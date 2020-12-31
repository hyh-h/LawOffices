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
public class Act_ru_job implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String TYPE_;

    private LocalDateTime LOCK_EXP_TIME_;

    private String LOCK_OWNER_;

    private Boolean EXCLUSIVE_;

    private String EXECUTION_ID_;

    private String PROCESS_INSTANCE_ID_;

    private String PROC_DEF_ID_;

    private Integer RETRIES_;

    private String EXCEPTION_STACK_ID_;

    private String EXCEPTION_MSG_;

    private LocalDateTime DUEDATE_;

    private String REPEAT_;

    private String HANDLER_TYPE_;

    private String HANDLER_CFG_;

    private String TENANT_ID_;


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

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
    }

    public LocalDateTime getLOCK_EXP_TIME_() {
        return LOCK_EXP_TIME_;
    }

    public void setLOCK_EXP_TIME_(LocalDateTime LOCK_EXP_TIME_) {
        this.LOCK_EXP_TIME_ = LOCK_EXP_TIME_;
    }

    public String getLOCK_OWNER_() {
        return LOCK_OWNER_;
    }

    public void setLOCK_OWNER_(String LOCK_OWNER_) {
        this.LOCK_OWNER_ = LOCK_OWNER_;
    }

    public Boolean getEXCLUSIVE_() {
        return EXCLUSIVE_;
    }

    public void setEXCLUSIVE_(Boolean EXCLUSIVE_) {
        this.EXCLUSIVE_ = EXCLUSIVE_;
    }

    public String getEXECUTION_ID_() {
        return EXECUTION_ID_;
    }

    public void setEXECUTION_ID_(String EXECUTION_ID_) {
        this.EXECUTION_ID_ = EXECUTION_ID_;
    }

    public String getPROCESS_INSTANCE_ID_() {
        return PROCESS_INSTANCE_ID_;
    }

    public void setPROCESS_INSTANCE_ID_(String PROCESS_INSTANCE_ID_) {
        this.PROCESS_INSTANCE_ID_ = PROCESS_INSTANCE_ID_;
    }

    public String getPROC_DEF_ID_() {
        return PROC_DEF_ID_;
    }

    public void setPROC_DEF_ID_(String PROC_DEF_ID_) {
        this.PROC_DEF_ID_ = PROC_DEF_ID_;
    }

    public Integer getRETRIES_() {
        return RETRIES_;
    }

    public void setRETRIES_(Integer RETRIES_) {
        this.RETRIES_ = RETRIES_;
    }

    public String getEXCEPTION_STACK_ID_() {
        return EXCEPTION_STACK_ID_;
    }

    public void setEXCEPTION_STACK_ID_(String EXCEPTION_STACK_ID_) {
        this.EXCEPTION_STACK_ID_ = EXCEPTION_STACK_ID_;
    }

    public String getEXCEPTION_MSG_() {
        return EXCEPTION_MSG_;
    }

    public void setEXCEPTION_MSG_(String EXCEPTION_MSG_) {
        this.EXCEPTION_MSG_ = EXCEPTION_MSG_;
    }

    public LocalDateTime getDUEDATE_() {
        return DUEDATE_;
    }

    public void setDUEDATE_(LocalDateTime DUEDATE_) {
        this.DUEDATE_ = DUEDATE_;
    }

    public String getREPEAT_() {
        return REPEAT_;
    }

    public void setREPEAT_(String REPEAT_) {
        this.REPEAT_ = REPEAT_;
    }

    public String getHANDLER_TYPE_() {
        return HANDLER_TYPE_;
    }

    public void setHANDLER_TYPE_(String HANDLER_TYPE_) {
        this.HANDLER_TYPE_ = HANDLER_TYPE_;
    }

    public String getHANDLER_CFG_() {
        return HANDLER_CFG_;
    }

    public void setHANDLER_CFG_(String HANDLER_CFG_) {
        this.HANDLER_CFG_ = HANDLER_CFG_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    @Override
    public String toString() {
        return "Act_ru_job{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", TYPE_=" + TYPE_ +
        ", LOCK_EXP_TIME_=" + LOCK_EXP_TIME_ +
        ", LOCK_OWNER_=" + LOCK_OWNER_ +
        ", EXCLUSIVE_=" + EXCLUSIVE_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", PROCESS_INSTANCE_ID_=" + PROCESS_INSTANCE_ID_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", RETRIES_=" + RETRIES_ +
        ", EXCEPTION_STACK_ID_=" + EXCEPTION_STACK_ID_ +
        ", EXCEPTION_MSG_=" + EXCEPTION_MSG_ +
        ", DUEDATE_=" + DUEDATE_ +
        ", REPEAT_=" + REPEAT_ +
        ", HANDLER_TYPE_=" + HANDLER_TYPE_ +
        ", HANDLER_CFG_=" + HANDLER_CFG_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        "}";
    }
}
