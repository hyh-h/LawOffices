package com.example.demo.entity;

import java.sql.Blob;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Act_ge_bytearray implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String NAME_;

    private String DEPLOYMENT_ID_;

    private Blob BYTES_;

    private Integer GENERATED_;


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

    public String getDEPLOYMENT_ID_() {
        return DEPLOYMENT_ID_;
    }

    public void setDEPLOYMENT_ID_(String DEPLOYMENT_ID_) {
        this.DEPLOYMENT_ID_ = DEPLOYMENT_ID_;
    }

    public Blob getBYTES_() {
        return BYTES_;
    }

    public void setBYTES_(Blob BYTES_) {
        this.BYTES_ = BYTES_;
    }

    public Integer getGENERATED_() {
        return GENERATED_;
    }

    public void setGENERATED_(Integer GENERATED_) {
        this.GENERATED_ = GENERATED_;
    }

    @Override
    public String toString() {
        return "Act_ge_bytearray{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", NAME_=" + NAME_ +
        ", DEPLOYMENT_ID_=" + DEPLOYMENT_ID_ +
        ", BYTES_=" + BYTES_ +
        ", GENERATED_=" + GENERATED_ +
        "}";
    }
}
