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
public class Act_re_model implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String NAME_;

    private String KEY_;

    private String CATEGORY_;

    private LocalDateTime CREATE_TIME_;

    private LocalDateTime LAST_UPDATE_TIME_;

    private Integer VERSION_;

    private String META_INFO_;

    private String DEPLOYMENT_ID_;

    private String EDITOR_SOURCE_VALUE_ID_;

    private String EDITOR_SOURCE_EXTRA_VALUE_ID_;

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

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getKEY_() {
        return KEY_;
    }

    public void setKEY_(String KEY_) {
        this.KEY_ = KEY_;
    }

    public String getCATEGORY_() {
        return CATEGORY_;
    }

    public void setCATEGORY_(String CATEGORY_) {
        this.CATEGORY_ = CATEGORY_;
    }

    public LocalDateTime getCREATE_TIME_() {
        return CREATE_TIME_;
    }

    public void setCREATE_TIME_(LocalDateTime CREATE_TIME_) {
        this.CREATE_TIME_ = CREATE_TIME_;
    }

    public LocalDateTime getLAST_UPDATE_TIME_() {
        return LAST_UPDATE_TIME_;
    }

    public void setLAST_UPDATE_TIME_(LocalDateTime LAST_UPDATE_TIME_) {
        this.LAST_UPDATE_TIME_ = LAST_UPDATE_TIME_;
    }

    public Integer getVERSION_() {
        return VERSION_;
    }

    public void setVERSION_(Integer VERSION_) {
        this.VERSION_ = VERSION_;
    }

    public String getMETA_INFO_() {
        return META_INFO_;
    }

    public void setMETA_INFO_(String META_INFO_) {
        this.META_INFO_ = META_INFO_;
    }

    public String getDEPLOYMENT_ID_() {
        return DEPLOYMENT_ID_;
    }

    public void setDEPLOYMENT_ID_(String DEPLOYMENT_ID_) {
        this.DEPLOYMENT_ID_ = DEPLOYMENT_ID_;
    }

    public String getEDITOR_SOURCE_VALUE_ID_() {
        return EDITOR_SOURCE_VALUE_ID_;
    }

    public void setEDITOR_SOURCE_VALUE_ID_(String EDITOR_SOURCE_VALUE_ID_) {
        this.EDITOR_SOURCE_VALUE_ID_ = EDITOR_SOURCE_VALUE_ID_;
    }

    public String getEDITOR_SOURCE_EXTRA_VALUE_ID_() {
        return EDITOR_SOURCE_EXTRA_VALUE_ID_;
    }

    public void setEDITOR_SOURCE_EXTRA_VALUE_ID_(String EDITOR_SOURCE_EXTRA_VALUE_ID_) {
        this.EDITOR_SOURCE_EXTRA_VALUE_ID_ = EDITOR_SOURCE_EXTRA_VALUE_ID_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    @Override
    public String toString() {
        return "Act_re_model{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", NAME_=" + NAME_ +
        ", KEY_=" + KEY_ +
        ", CATEGORY_=" + CATEGORY_ +
        ", CREATE_TIME_=" + CREATE_TIME_ +
        ", LAST_UPDATE_TIME_=" + LAST_UPDATE_TIME_ +
        ", VERSION_=" + VERSION_ +
        ", META_INFO_=" + META_INFO_ +
        ", DEPLOYMENT_ID_=" + DEPLOYMENT_ID_ +
        ", EDITOR_SOURCE_VALUE_ID_=" + EDITOR_SOURCE_VALUE_ID_ +
        ", EDITOR_SOURCE_EXTRA_VALUE_ID_=" + EDITOR_SOURCE_EXTRA_VALUE_ID_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        "}";
    }
}
