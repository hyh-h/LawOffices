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
public class Act_hi_actinst implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String PROC_DEF_ID_;

    private String PROC_INST_ID_;

    private String EXECUTION_ID_;

    private String ACT_ID_;

    private String TASK_ID_;

    private String CALL_PROC_INST_ID_;

    private String ACT_NAME_;

    private String ACT_TYPE_;

    private String ASSIGNEE_;

    private LocalDateTime START_TIME_;

    private LocalDateTime END_TIME_;

    private Long DURATION_;

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

    public String getACT_ID_() {
        return ACT_ID_;
    }

    public void setACT_ID_(String ACT_ID_) {
        this.ACT_ID_ = ACT_ID_;
    }

    public String getTASK_ID_() {
        return TASK_ID_;
    }

    public void setTASK_ID_(String TASK_ID_) {
        this.TASK_ID_ = TASK_ID_;
    }

    public String getCALL_PROC_INST_ID_() {
        return CALL_PROC_INST_ID_;
    }

    public void setCALL_PROC_INST_ID_(String CALL_PROC_INST_ID_) {
        this.CALL_PROC_INST_ID_ = CALL_PROC_INST_ID_;
    }

    public String getACT_NAME_() {
        return ACT_NAME_;
    }

    public void setACT_NAME_(String ACT_NAME_) {
        this.ACT_NAME_ = ACT_NAME_;
    }

    public String getACT_TYPE_() {
        return ACT_TYPE_;
    }

    public void setACT_TYPE_(String ACT_TYPE_) {
        this.ACT_TYPE_ = ACT_TYPE_;
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

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    @Override
    public String toString() {
        return "Act_hi_actinst{" +
        "ID_=" + ID_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", ACT_ID_=" + ACT_ID_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", CALL_PROC_INST_ID_=" + CALL_PROC_INST_ID_ +
        ", ACT_NAME_=" + ACT_NAME_ +
        ", ACT_TYPE_=" + ACT_TYPE_ +
        ", ASSIGNEE_=" + ASSIGNEE_ +
        ", START_TIME_=" + START_TIME_ +
        ", END_TIME_=" + END_TIME_ +
        ", DURATION_=" + DURATION_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        "}";
    }
}
