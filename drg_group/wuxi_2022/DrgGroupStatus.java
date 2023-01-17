package drg_group.wuxi_2022;

public enum DrgGroupStatus{
    CHECK_FAILED("信息校验不通过"),
    SUCCESS("分组成功"),
    FAIL("无法入组"),
    ZD_NOT_MAPPING("诊断不能转换为分组器支持的编码"),
    SS_NOT_MAPPING("手术操作不能转换为分组器支持的编码"),
    ZD_NOT_VALID("诊断不是有效的ICD编码"),
    SS_NOT_VALID("手术操作不是有效的ICD编码"),
    QY("歧义病案"),
    ZD_NOT_MATCH_GENDER("主诊断与病人性别不相符"),
    MAIN_ZD_NOT_MDC("主诊断不在所有MDC的主诊表内"),
    SS_ERROR("手术选择错误"),
    NEWBORN_ERROR("新生儿诊断或手术错误");

    DrgGroupStatus(String desc){
        this.desc=desc;
    }
    private String desc;
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}