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
public class Act_id_group implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String NAME_;

    private String TYPE_;


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

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
    }

    @Override
    public String toString() {
        return "Act_id_group{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", NAME_=" + NAME_ +
        ", TYPE_=" + TYPE_ +
        "}";
    }
}
