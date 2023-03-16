# OpenDRG的目的是成为国家医保局CHS-DRG的开源实现，就像OpenJDK是Java SE的开源实现一样

## 业务背景

&emsp;&emsp;疾病诊断相关组（Diagnosis Related Groups，DRG）是用于衡量医疗服务质量效率以及进行医保支付的重要工具。国家医疗保障局要求从2022到2024年，三年内全面完成DRG/DIP付费方式改革，很多地区的医保局已经开始采用DRG与医院进行医保资金的结算。

&emsp;&emsp;DRG分组器是医院端DRG信息管理系统的基础和核心，也是难点所在。国家医保局已经发布了1.0版、1.0修正版、1.1版这三个版本的DRG分组方案，即将发布2.0版，但各地市甚至各医院版本更新的进度不一致，同一地区不同医院版本各不相同，甚至可能同一医院多版本并存或者是合集。

&emsp;&emsp;通过大量的研究和实践，采用“知识库+规则库”的思路，研发了此款DRG分组器，具备的优势如下：
* 严格按照医保局规则进行分组，其正确性经过多个地区、多家医院的实际验证
* 分组性能达到单线程每秒5000份病案，满足业务处理、数据分析等多种业务场景
* 支持Java、C#、python、js等多种语言实现
* 不需要部署服务器，支持以插件方式嵌入医院业务系统运行

## 分组器版本(Java)说明
国家医保局CHS-DRG分组器，Java实现版

|DRG分组方案|分组器源代码路径|DRG组数|说明|
|-|-|-|-|
|CHS-DRG 1.1<br>标准版|628组| 陕西铜川<br>山东临沂<br>贵州六盘水、铜仁|
|CHS-DRG 1.0<br>修订版|618组| 陕西西安<br>四川成都|
|CHS-DRG 1.1<br>盐城2022细分组|628组| 江苏省盐城市2022版细分组|
|CHS-DRG 1.1<br>苏州2022细分组|667组| 江苏省苏州市2022版细分组|
|CHS-DRG 1.1<br>泰州2022细分组|758组| 江苏省泰州市2022版细分组|
|CHS-DRG 1.1<br>无锡2022细分组|599组| 江苏省无锡市2022版细分组|
|CHS-DRG 1.0修订版<br>武汉2022细分组|660组| 湖北省武汉市2022版细分组|
|CHS-DRG 1.1<br>北京版细分组|696组| 北京2022版细分组|
|CHS-DRG 1.1<br>兰州2022细分组|792组| 甘肃省兰州市2022版细分组|
|CHS-DRG 1.1<br>福州2022细分组|563组| 福建省福州市2022版细分组|
|ZJ-DRG 1.1<br>浙江2022细分组|1006组| 浙江省2022版细分组|
|CHS-DRG 1.1<br>长株潭衡2023细分组|737组| 湖南省长株潭衡区域2023版细分组|

&emsp;&emsp;其他地区版本的分组器将逐步发布，敬请关注

## 打包方式
### apache ant
可采用apache ant方式打包，需下载安装，官网地址：https://ant.apache.org/
进入每个版本分组器的build.xml所在目录，执行ant jar命令，将在该版本分组器目录的build/jar路径下生成jar文件
如：
```console
cd drg_group/chs_drg_11
ant jar
```
生成文件路径：drg_group/chs_drg_11/build/jar/grouper_chs_drg_11.jar

### Maven
略

## 测试方法
将run.cmd和打包好的jar文件放在同一目录，双击执行run.cmd执行，打开的控制台窗口中，如果输出以下信息，则说明程序可以正常执行：
```
MedicalRecord [Index=22058878, gender=2, age=88, ageDay=32460, weight=0, dept=13040503, inHospitalTime=94, leavingType=1, zdList=[K22.301, K11.901, E11.900, I10.x05], ssList=[96.0800x005], remark=]
GroupResult [Index=22058878, status=分组成功, messages=[K22.301 食管破裂, K11.901 腮腺区肿物, E11.900 2型糖尿病, I10.x05 高血压3级, 96.0800x005 鼻十二指肠营养管置入术, 符合MDCG入组条件，匹配规则：主诊断匹配, 符合GZ1入组条件，匹配规则：主诊 断匹配, 主诊断K22.301排除表111, 主诊断K22.301排除表111, 诊断K11.901属于CC，排除表110, ***GZ13 其他消化系统诊断，伴并发症或合并症***], mdc=MDCG, adrg=GZ1, drg=GZ13]
```

## Java系统调用方式
外部系统引入分组器jar包，调用GroupProxy类的以下方法：
* group_record
> 输入参数为String，格式如"22058878,2,88,32460,,13040503,94,1,K80.302|K80.305|K83.109|K72.905|Z90.408|E14.900x001,51.8803|51.8701|54.5100x005|45.1301"
将MedicalRecord类的11个属性用逗号拼接，其中：zdList、ssList的类型是String[]，多个元素用|分隔；remark字段可选
返回结果为GroupResult对象
* group_txt
> 无输入参数，程序自动读取当前目录下的input.txt文件，如文件不存在则报错
input.txt内容参考源代码根目录下的文件
执行成功后在当前目录下生成output.txt文件，内容为一个或多个GroupResult对象
* group_csv
> 输入参数filename为CSV文件路径，cols参数为CSV文件中分组所需字段的列名，传入List
cols输入的列名需要与MedicalRecord类的属性（Index,gender,age,ageDay,weight,dept,inHospitalTime,leavingType,zdList,ssList,remark）顺序保持一致
输出结果为CSV文件，保存在输入filename的相同路径，并在输入文件名称后面加上_java_result，结果CSV的列在输入列的基础上增加了status,messages,mdc,adrg,drg这几列

**推荐使用group_record。group_txt一般用于测试，group_csv用于数据分析**
## 返回结果说明
返回结果为GroupResult类
* Index：带入输入对象MedicalRecord的Index字段，建议使用病案号或住院号，保持唯一性
* status：分组结果，“分组成功”代表分组成功，其他定义见DrgGroupStatus类
* messages：分组过程，列表格式，包括ICD编码转换信息、名称信息，以及DRG分组每一步操作的记录，是什么结果，应用了哪些规则
* mdc：主要诊断大类，分组成功或分入歧义组是有值
* adrg：核心DRG组代码，校验通过后有值，分入歧义组时为QY，没有分到组时为00
* drg：DRG组代码，校验通过后有值，分入歧义组时为*QY，没有分到组时为00

## 联系作者
14463966@qq.com