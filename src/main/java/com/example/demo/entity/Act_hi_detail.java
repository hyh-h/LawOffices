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
public class Act_hi_detail implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String TYPE_;

    private String PROC_INST_ID_;

    private String EXECUTION_ID_;

    private String TASK_ID_;

    private String ACT_INST_ID_;

    private String NAME_;

    private String VAR_TYPE_;

    private Integer REV_;

    private LocalDateTime TIME_;

    private String BYTEARRAY_ID_;

    private Double DOUBLE_;

    private Long LONG_;

    private String TEXT_;

    private String TEXT2_;


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

    public String getACT_INST_ID_() {
        return ACT_INST_ID_;
    }

    public void setACT_INST_ID_(String ACT_INST_ID_) {
        this.ACT_INST_ID_ = ACT_INST_ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getVAR_TYPE_() {
        return VAR_TYPE_;
    }

    public void setVAR_TYPE_(String VAR_TYPE_) {
        this.VAR_TYPE_ = VAR_TYPE_;
    }

    public Integer getREV_() {
        return REV_;
    }

    public void setREV_(Integer REV_) {
        this.REV_ = REV_;
    }

    public LocalDateTime getTIME_() {
        return TIME_;
    }

    public void setTIME_(LocalDateTime TIME_) {
        this.TIME_ = TIME_;
    }

    public String getBYTEARRAY_ID_() {
        return BYTEARRAY_ID_;
    }

    public void setBYTEARRAY_ID_(String BYTEARRAY_ID_) {
        this.BYTEARRAY_ID_ = BYTEARRAY_ID_;
    }

    public Double getDOUBLE_() {
        return DOUBLE_;
    }

    public void setDOUBLE_(Double DOUBLE_) {
        this.DOUBLE_ = DOUBLE_;
    }

    public Long getLONG_() {
        return LONG_;
    }

    public void setLONG_(Long LONG_) {
        this.LONG_ = LONG_;
    }

    public String getTEXT_() {
        return TEXT_;
    }

    public void setTEXT_(String TEXT_) {
        this.TEXT_ = TEXT_;
    }

    public String getTEXT2_() {
        return TEXT2_;
    }

    public void setTEXT2_(String TEXT2_) {
        this.TEXT2_ = TEXT2_;
    }

    @Override
    public String toString() {
        return "Act_hi_detail{" +
        "ID_=" + ID_ +
        ", TYPE_=" + TYPE_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", ACT_INST_ID_=" + ACT_INST_ID_ +
        ", NAME_=" + NAME_ +
        ", VAR_TYPE_=" + VAR_TYPE_ +
        ", REV_=" + REV_ +
        ", TIME_=" + TIME_ +
        ", BYTEARRAY_ID_=" + BYTEARRAY_ID_ +
        ", DOUBLE_=" + DOUBLE_ +
        ", LONG_=" + LONG_ +
        ", TEXT_=" + TEXT_ +
        ", TEXT2_=" + TEXT2_ +
        "}";
    }
}
