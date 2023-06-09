# OpenDRG的目标是成为国家医保局CHS-DRG的开源实现，就像OpenJDK是Java SE的开源实现一样

## 分组器版本
国家医保局CHS-DRG分组器，Java实现版

|分组器版本|实现的分组方案|
|-|-|
|drg_group/chs_drg_11|CHS-DRG 1.1标准版、铜川版、临沂版|
|drg_group/chs_drg_10|CHS-DRG 1.0修订版、西安版、成都版|
|drg_group/yancheng_2023|盐城版|
|drg_group/suzhou_2023|苏州版|
|drg_group/taizhou_2022|泰州版|
|drg_group/wuxi_2022|无锡版|
|drg_group/wuhan_2022|武汉版|
|drg_group/beijing_2022|北京版|
|drg_group/lanzhou_2023|兰州版|
|drg_group/fuzhou_2022|福州版|
|drg_group/zhejiang_2022|浙江版|
|drg_group/wlmq_2022|乌鲁木齐版|
|drg_group/changsha_2022|长株潭衡区域版|
|drg_group/yantai_2023|烟台版|
|drg_group/changzhou_2022|常州版|
|drg_group/qingdao_2023|青岛版|
|drg_group/linfen_2022|临汾版|
|drg_group/handan_2022|邯郸版|
|drg_group/chongqing_2022|重庆版|

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

## 联系开发团队
请发邮件至OpenDRG@hotmail.com
