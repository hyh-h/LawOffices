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
public class Act_hi_attachment implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String USER_ID_;

    private String NAME_;

    private String DESCRIPTION_;

    private String TYPE_;

    private String TASK_ID_;

    private String PROC_INST_ID_;

    private String URL_;

    private String CONTENT_ID_;

    private LocalDateTime TIME_;


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

    public String getUSER_ID_() {
        return USER_ID_;
    }

    public void setUSER_ID_(String USER_ID_) {
        this.USER_ID_ = USER_ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getDESCRIPTION_() {
        return DESCRIPTION_;
    }

    public void setDESCRIPTION_(String DESCRIPTION_) {
        this.DESCRIPTION_ = DESCRIPTION_;
    }

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
    }

    public String getTASK_ID_() {
        return TASK_ID_;
    }

    public void setTASK_ID_(String TASK_ID_) {
        this.TASK_ID_ = TASK_ID_;
    }

    public String getPROC_INST_ID_() {
        return PROC_INST_ID_;
    }

    public void setPROC_INST_ID_(String PROC_INST_ID_) {
        this.PROC_INST_ID_ = PROC_INST_ID_;
    }

    public String getURL_() {
        return URL_;
    }

    public void setURL_(String URL_) {
        this.URL_ = URL_;
    }

    public String getCONTENT_ID_() {
        return CONTENT_ID_;
    }

    public void setCONTENT_ID_(String CONTENT_ID_) {
        this.CONTENT_ID_ = CONTENT_ID_;
    }

    public LocalDateTime getTIME_() {
        return TIME_;
    }

    public void setTIME_(LocalDateTime TIME_) {
        this.TIME_ = TIME_;
    }

    @Override
    public String toString() {
        return "Act_hi_attachment{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", USER_ID_=" + USER_ID_ +
        ", NAME_=" + NAME_ +
        ", DESCRIPTION_=" + DESCRIPTION_ +
        ", TYPE_=" + TYPE_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", URL_=" + URL_ +
        ", CONTENT_ID_=" + CONTENT_ID_ +
        ", TIME_=" + TIME_ +
        "}";
    }
}
