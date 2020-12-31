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
public class Act_re_deployment implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String NAME_;

    private String CATEGORY_;

    private String TENANT_ID_;

    private LocalDateTime DEPLOY_TIME_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
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

    public LocalDateTime getDEPLOY_TIME_() {
        return DEPLOY_TIME_;
    }

    public void setDEPLOY_TIME_(LocalDateTime DEPLOY_TIME_) {
        this.DEPLOY_TIME_ = DEPLOY_TIME_;
    }

    @Override
    public String toString() {
        return "Act_re_deployment{" +
        "ID_=" + ID_ +
        ", NAME_=" + NAME_ +
        ", CATEGORY_=" + CATEGORY_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        ", DEPLOY_TIME_=" + DEPLOY_TIME_ +
        "}";
    }
}
