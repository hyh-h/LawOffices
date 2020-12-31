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
public class Act_ru_event_subscr implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String EVENT_TYPE_;

    private String EVENT_NAME_;

    private String EXECUTION_ID_;

    private String PROC_INST_ID_;

    private String ACTIVITY_ID_;

    private String CONFIGURATION_;

    private LocalDateTime CREATED_;

    private String PROC_DEF_ID_;

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

    public String getEVENT_TYPE_() {
        return EVENT_TYPE_;
    }

    public void setEVENT_TYPE_(String EVENT_TYPE_) {
        this.EVENT_TYPE_ = EVENT_TYPE_;
    }

    public String getEVENT_NAME_() {
        return EVENT_NAME_;
    }

    public void setEVENT_NAME_(String EVENT_NAME_) {
        this.EVENT_NAME_ = EVENT_NAME_;
    }

    public String getEXECUTION_ID_() {
        return EXECUTION_ID_;
    }

    public void setEXECUTION_ID_(String EXECUTION_ID_) {
        this.EXECUTION_ID_ = EXECUTION_ID_;
    }

    public String getPROC_INST_ID_() {
        return PROC_INST_ID_;
    }

    public void setPROC_INST_ID_(String PROC_INST_ID_) {
        this.PROC_INST_ID_ = PROC_INST_ID_;
    }

    public String getACTIVITY_ID_() {
        return ACTIVITY_ID_;
    }

    public void setACTIVITY_ID_(String ACTIVITY_ID_) {
        this.ACTIVITY_ID_ = ACTIVITY_ID_;
    }

    public String getCONFIGURATION_() {
        return CONFIGURATION_;
    }

    public void setCONFIGURATION_(String CONFIGURATION_) {
        this.CONFIGURATION_ = CONFIGURATION_;
    }

    public LocalDateTime getCREATED_() {
        return CREATED_;
    }

    public void setCREATED_(LocalDateTime CREATED_) {
        this.CREATED_ = CREATED_;
    }

    public String getPROC_DEF_ID_() {
        return PROC_DEF_ID_;
    }

    public void setPROC_DEF_ID_(String PROC_DEF_ID_) {
        this.PROC_DEF_ID_ = PROC_DEF_ID_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    @Override
    public String toString() {
        return "Act_ru_event_subscr{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", EVENT_TYPE_=" + EVENT_TYPE_ +
        ", EVENT_NAME_=" + EVENT_NAME_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", ACTIVITY_ID_=" + ACTIVITY_ID_ +
        ", CONFIGURATION_=" + CONFIGURATION_ +
        ", CREATED_=" + CREATED_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        "}";
    }
}
