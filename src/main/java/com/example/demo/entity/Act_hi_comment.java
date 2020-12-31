package com.example.demo.entity;

import java.time.LocalDateTime;
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
public class Act_hi_comment implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String TYPE_;

    private LocalDateTime TIME_;

    private String USER_ID_;

    private String TASK_ID_;

    private String PROC_INST_ID_;

    private String ACTION_;

    private String MESSAGE_;

    private Blob FULL_MSG_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
    }

    public LocalDateTime getTIME_() {
        return TIME_;
    }

    public void setTIME_(LocalDateTime TIME_) {
        this.TIME_ = TIME_;
    }

    public String getUSER_ID_() {
        return USER_ID_;
    }

    public void setUSER_ID_(String USER_ID_) {
        this.USER_ID_ = USER_ID_;
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

    public String getACTION_() {
        return ACTION_;
    }

    public void setACTION_(String ACTION_) {
        this.ACTION_ = ACTION_;
    }

    public String getMESSAGE_() {
        return MESSAGE_;
    }

    public void setMESSAGE_(String MESSAGE_) {
        this.MESSAGE_ = MESSAGE_;
    }

    public Blob getFULL_MSG_() {
        return FULL_MSG_;
    }

    public void setFULL_MSG_(Blob FULL_MSG_) {
        this.FULL_MSG_ = FULL_MSG_;
    }

    @Override
    public String toString() {
        return "Act_hi_comment{" +
        "ID_=" + ID_ +
        ", TYPE_=" + TYPE_ +
        ", TIME_=" + TIME_ +
        ", USER_ID_=" + USER_ID_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", ACTION_=" + ACTION_ +
        ", MESSAGE_=" + MESSAGE_ +
        ", FULL_MSG_=" + FULL_MSG_ +
        "}";
    }
}
