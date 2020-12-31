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
public class Act_hi_procinst implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String PROC_INST_ID_;

    private String BUSINESS_KEY_;

    private String PROC_DEF_ID_;

    private LocalDateTime START_TIME_;

    private LocalDateTime END_TIME_;

    private Long DURATION_;

    private String START_USER_ID_;

    private String START_ACT_ID_;

    private String END_ACT_ID_;

    private String SUPER_PROCESS_INSTANCE_ID_;

    private String DELETE_REASON_;

    private String TENANT_ID_;

    private String NAME_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public String getPROC_INST_ID_() {
        return PROC_INST_ID_;
    }

    public void setPROC_INST_ID_(String PROC_INST_ID_) {
        this.PROC_INST_ID_ = PROC_INST_ID_;
    }

    public String getBUSINESS_KEY_() {
        return BUSINESS_KEY_;
    }

    public void setBUSINESS_KEY_(String BUSINESS_KEY_) {
        this.BUSINESS_KEY_ = BUSINESS_KEY_;
    }

    public String getPROC_DEF_ID_() {
        return PROC_DEF_ID_;
    }

    public void setPROC_DEF_ID_(String PROC_DEF_ID_) {
        this.PROC_DEF_ID_ = PROC_DEF_ID_;
    }

    public LocalDateTime getSTART_TIME_() {
        return START_TIME_;
    }

    public void setSTART_TIME_(LocalDateTime START_TIME_) {
        this.START_TIME_ = START_TIME_;
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

    public String getSTART_USER_ID_() {
        return START_USER_ID_;
    }

    public void setSTART_USER_ID_(String START_USER_ID_) {
        this.START_USER_ID_ = START_USER_ID_;
    }

    public String getSTART_ACT_ID_() {
        return START_ACT_ID_;
    }

    public void setSTART_ACT_ID_(String START_ACT_ID_) {
        this.START_ACT_ID_ = START_ACT_ID_;
    }

    public String getEND_ACT_ID_() {
        return END_ACT_ID_;
    }

    public void setEND_ACT_ID_(String END_ACT_ID_) {
        this.END_ACT_ID_ = END_ACT_ID_;
    }

    public String getSUPER_PROCESS_INSTANCE_ID_() {
        return SUPER_PROCESS_INSTANCE_ID_;
    }

    public void setSUPER_PROCESS_INSTANCE_ID_(String SUPER_PROCESS_INSTANCE_ID_) {
        this.SUPER_PROCESS_INSTANCE_ID_ = SUPER_PROCESS_INSTANCE_ID_;
    }

    public String getDELETE_REASON_() {
        return DELETE_REASON_;
    }

    public void setDELETE_REASON_(String DELETE_REASON_) {
        this.DELETE_REASON_ = DELETE_REASON_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    @Override
    public String toString() {
        return "Act_hi_procinst{" +
        "ID_=" + ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", BUSINESS_KEY_=" + BUSINESS_KEY_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", START_TIME_=" + START_TIME_ +
        ", END_TIME_=" + END_TIME_ +
        ", DURATION_=" + DURATION_ +
        ", START_USER_ID_=" + START_USER_ID_ +
        ", START_ACT_ID_=" + START_ACT_ID_ +
        ", END_ACT_ID_=" + END_ACT_ID_ +
        ", SUPER_PROCESS_INSTANCE_ID_=" + SUPER_PROCESS_INSTANCE_ID_ +
        ", DELETE_REASON_=" + DELETE_REASON_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        ", NAME_=" + NAME_ +
        "}";
    }
}
