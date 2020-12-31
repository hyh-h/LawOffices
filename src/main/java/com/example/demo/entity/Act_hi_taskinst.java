package com.example.demo.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Act_hi_taskinst implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String PROC_DEF_ID_;

    private String TASK_DEF_KEY_;

    private String PROC_INST_ID_;

    private String EXECUTION_ID_;

    private String NAME_;

    private String PARENT_TASK_ID_;

    private String DESCRIPTION_;

    private String OWNER_;

    private String ASSIGNEE_;

    private LocalDateTime START_TIME_;

    private LocalDateTime CLAIM_TIME_;

    private LocalDateTime END_TIME_;

    private Long DURATION_;

    private String DELETE_REASON_;

    private Integer PRIORITY_;

    private LocalDateTime DUE_DATE_;

    private String FORM_KEY_;

    private String CATEGORY_;

    private String TENANT_ID_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public String getPROC_DEF_ID_() {
        return PROC_DEF_ID_;
    }

    public void setPROC_DEF_ID_(String PROC_DEF_ID_) {
        this.PROC_DEF_ID_ = PROC_DEF_ID_;
    }

    public String getTASK_DEF_KEY_() {
        return TASK_DEF_KEY_;
    }

    public void setTASK_DEF_KEY_(String TASK_DEF_KEY_) {
        this.TASK_DEF_KEY_ = TASK_DEF_KEY_;
    }

    public String getPROC_INST_ID_() {
        return PROC_INST_ID_;
    }

    public void setPROC_INST_ID_(String PROC_INST_ID_) {
        this.PROC_INST_ID_ = PROC_INST_ID_;
    }

    public String getEXECUTION_ID_() {
        return EXECUTION_ID_;
    }

    public void setEXECUTION_ID_(String EXECUTION_ID_) {
        this.EXECUTION_ID_ = EXECUTION_ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getPARENT_TASK_ID_() {
        return PARENT_TASK_ID_;
    }

    public void setPARENT_TASK_ID_(String PARENT_TASK_ID_) {
        this.PARENT_TASK_ID_ = PARENT_TASK_ID_;
    }

    public String getDESCRIPTION_() {
        return DESCRIPTION_;
    }

    public void setDESCRIPTION_(String DESCRIPTION_) {
        this.DESCRIPTION_ = DESCRIPTION_;
    }

    public String getOWNER_() {
        return OWNER_;
    }

    public void setOWNER_(String OWNER_) {
        this.OWNER_ = OWNER_;
    }

    public String getASSIGNEE_() {
        return ASSIGNEE_;
    }

    public void setASSIGNEE_(String ASSIGNEE_) {
        this.ASSIGNEE_ = ASSIGNEE_;
    }

    public LocalDateTime getSTART_TIME_() {
        return START_TIME_;
    }

    public void setSTART_TIME_(LocalDateTime START_TIME_) {
        this.START_TIME_ = START_TIME_;
    }

    public LocalDateTime getCLAIM_TIME_() {
        return CLAIM_TIME_;
    }

    public void setCLAIM_TIME_(LocalDateTime CLAIM_TIME_) {
        this.CLAIM_TIME_ = CLAIM_TIME_;
    }

    public LocalDateTime getEND_TIME_() {
        return END_TIME_;
    }

    public void setEND_TIME_(LocalDateTime END_TIME_) {
        this.END_TIME_ = END_TIME_;
    }

    public Long getDURATION_() {
        return DURATION_;
    }

    public void setDURATION_(Long DURATION_) {
        this.DURATION_ = DURATION_;
    }

    public String getDELETE_REASON_() {
        return DELETE_REASON_;
    }

    public void setDELETE_REASON_(String DELETE_REASON_) {
        this.DELETE_REASON_ = DELETE_REASON_;
    }

    public Integer getPRIORITY_() {
        return PRIORITY_;
    }

    public void setPRIORITY_(Integer PRIORITY_) {
        this.PRIORITY_ = PRIORITY_;
    }

    public LocalDateTime getDUE_DATE_() {
        return DUE_DATE_;
    }

    public void setDUE_DATE_(LocalDateTime DUE_DATE_) {
        this.DUE_DATE_ = DUE_DATE_;
    }

    public String getFORM_KEY_() {
        return FORM_KEY_;
    }

    public void setFORM_KEY_(String FORM_KEY_) {
        this.FORM_KEY_ = FORM_KEY_;
    }

    public String getCATEGORY_() {
        return CATEGORY_;
    }

    public void setCATEGORY_(String CATEGORY_) {
        this.CATEGORY_ = CATEGORY_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    @Override
    public String toString() {
        return "Act_hi_taskinst{" +
        "ID_=" + ID_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", TASK_DEF_KEY_=" + TASK_DEF_KEY_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", NAME_=" + NAME_ +
        ", PARENT_TASK_ID_=" + PARENT_TASK_ID_ +
        ", DESCRIPTION_=" + DESCRIPTION_ +
        ", OWNER_=" + OWNER_ +
        ", ASSIGNEE_=" + ASSIGNEE_ +
        ", START_TIME_=" + START_TIME_ +
        ", CLAIM_TIME_=" + CLAIM_TIME_ +
        ", END_TIME_=" + END_TIME_ +
        ", DURATION_=" + DURATION_ +
        ", DELETE_REASON_=" + DELETE_REASON_ +
        ", PRIORITY_=" + PRIORITY_ +
        ", DUE_DATE_=" + DUE_DATE_ +
        ", FORM_KEY_=" + FORM_KEY_ +
        ", CATEGORY_=" + CATEGORY_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        "}";
    }
}
