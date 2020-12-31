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
public class Act_procdef_info implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String PROC_DEF_ID_;

    private Integer REV_;

    private String INFO_JSON_ID_;


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

    public Integer getREV_() {
        return REV_;
    }

    public void setREV_(Integer REV_) {
        this.REV_ = REV_;
    }

    public String getINFO_JSON_ID_() {
        return INFO_JSON_ID_;
    }

    public void setINFO_JSON_ID_(String INFO_JSON_ID_) {
        this.INFO_JSON_ID_ = INFO_JSON_ID_;
    }

    @Override
    public String toString() {
        return "Act_procdef_info{" +
        "ID_=" + ID_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", REV_=" + REV_ +
        ", INFO_JSON_ID_=" + INFO_JSON_ID_ +
        "}";
    }
}
