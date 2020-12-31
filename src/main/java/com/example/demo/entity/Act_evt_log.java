package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Act_evt_log implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "LOG_NR_", type = IdType.AUTO)
    private Long LOG_NR_;

    private String TYPE_;

    private String PROC_DEF_ID_;

    private String PROC_INST_ID_;

    private String EXECUTION_ID_;

    private String TASK_ID_;

    private LocalDateTime TIME_STAMP_;

    private String USER_ID_;

    private Blob DATA_;

    private String LOCK_OWNER_;

    private LocalDateTime LOCK_TIME_;

    private Integer IS_PROCESSED_;


    public Long getLOG_NR_() {
        return LOG_NR_;
    }

    public void setLOG_NR_(Long LOG_NR_) {
        this.LOG_NR_ = LOG_NR_;
    }

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
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

    public String getTASK_ID_() {
        return TASK_ID_;
    }

    public void setTASK_ID_(String TASK_ID_) {
        this.TASK_ID_ = TASK_ID_;
    }

    public LocalDateTime getTIME_STAMP_() {
        return TIME_STAMP_;
    }

    public void setTIME_STAMP_(LocalDateTime TIME_STAMP_) {
        this.TIME_STAMP_ = TIME_STAMP_;
    }

    public String getUSER_ID_() {
        return USER_ID_;
    }

    public void setUSER_ID_(String USER_ID_) {
        this.USER_ID_ = USER_ID_;
    }

    public Blob getDATA_() {
        return DATA_;
    }

    public void setDATA_(Blob DATA_) {
        this.DATA_ = DATA_;
    }

    public String getLOCK_OWNER_() {
        return LOCK_OWNER_;
    }

    public void setLOCK_OWNER_(String LOCK_OWNER_) {
        this.LOCK_OWNER_ = LOCK_OWNER_;
    }

    public LocalDateTime getLOCK_TIME_() {
        return LOCK_TIME_;
    }

    public void setLOCK_TIME_(LocalDateTime LOCK_TIME_) {
        this.LOCK_TIME_ = LOCK_TIME_;
    }

    public Integer getIS_PROCESSED_() {
        return IS_PROCESSED_;
    }

    public void setIS_PROCESSED_(Integer IS_PROCESSED_) {
        this.IS_PROCESSED_ = IS_PROCESSED_;
    }

    @Override
    public String toString() {
        return "Act_evt_log{" +
        "LOG_NR_=" + LOG_NR_ +
        ", TYPE_=" + TYPE_ +
        ", PROC_DEF_ID_=" + PROC_DEF_ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", TIME_STAMP_=" + TIME_STAMP_ +
        ", USER_ID_=" + USER_ID_ +
        ", DATA_=" + DATA_ +
        ", LOCK_OWNER_=" + LOCK_OWNER_ +
        ", LOCK_TIME_=" + LOCK_TIME_ +
        ", IS_PROCESSED_=" + IS_PROCESSED_ +
        "}";
    }
}
