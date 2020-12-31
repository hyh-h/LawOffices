package com.example.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Act_ru_identitylink implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String GROUP_ID_;

    private String TYPE_;

    private String USER_ID_;

    private String TASK_ID_;

    private String PROC_INST_ID_;

    private String PROC_DEF_ID_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public Integer getREV_() {
        return REV_;
    }

    public void setREV_(Integer REV_) {
        this.REV_ = REV_;
    }

    public String getGROUP_ID_() {
        return GROUP_ID_;
    }

    public void setGROUP_ID_(String GROUP_ID_) {
        this.GROUP_ID_ = GROUP_ID_;
    }

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
    }

    public String getUSER_ID_() {
        return USER_ID_;
    }

    public void setUSER_ID_(String USER_ID_) {
        this.USER_ID_ = USER_ID_;
    }

    public String getTASK_ID_() {
        return TASK_ID_;
    }

    public void setTASK_ID_(String TASK_ID_) {
        this.TASK_ID_ = TASK_ID_;
    }

    public String getPROC_INST_ID_() {
        return PROC_INST_ID_;
    }

    public void setPROC_INST_ID_(String PROC_INST_ID_) {
        this.PROC_INST_ID_ = PROC_INST_ID_;
    }

    public String getPROC_DEF_ID_() {
        return PROC_DEF_ID_;
    }

    public void setPROC_DEF_ID_(String PROC_DEF_ID_) {
        this.PROC_DEF_ID_ = PROC_DEF_ID_;
    }

    @Override
    public String toString() {
        return "Act_ru_identitylink{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", GROUP_ID_=" + GROUP_ID_ +
        ", TYPE_=" + TYPE_ +
        ", USER_ID_=" + USER_ID_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        "}";
    }
}
