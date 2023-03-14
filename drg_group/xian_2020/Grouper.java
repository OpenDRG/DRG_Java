package drg_group.xian_2020;

import drg_group.xian_2020.MDC.*;

public class Grouper {
    public static String group(MedicalRecord record){
        Base.groupMessages.initMessage(record.Index);
        String result;

        result=MDCA.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCP.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCY.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCZ.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCM.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCN.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCB.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCC.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCD.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCE.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCF.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCG.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCH.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCI.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCJ.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCK.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCL.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCO.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCQ.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCR.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCS.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCT.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCU.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCV.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCW.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        result=MDCX.group(record);
        if (result.length()>0){
            Base.groupMessages.putMessage(record.Index, "***"+result+" "+Base.DRG.get(result)+"***");
            return result;
        }

        Base.groupMessages.putMessage(record.Index,"不符合所有MDC的入组条件，无法入组");
        return "0000";
    }

}
