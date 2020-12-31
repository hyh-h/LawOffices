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
public class Act_hi_varinst implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private String PROC_INST_ID_;

    private String EXECUTION_ID_;

    private String TASK_ID_;

    private String NAME_;

    private String VAR_TYPE_;

    private Integer REV_;

    private String BYTEARRAY_ID_;

    private Double DOUBLE_;

    private Long LONG_;

    private String TEXT_;

    private String TEXT2_;

    private LocalDateTime CREATE_TIME_;

    private LocalDateTime LAST_UPDATED_TIME_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
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

    public LocalDateTime getCREATE_TIME_() {
        return CREATE_TIME_;
    }

    public void setCREATE_TIME_(LocalDateTime CREATE_TIME_) {
        this.CREATE_TIME_ = CREATE_TIME_;
    }

    public LocalDateTime getLAST_UPDATED_TIME_() {
        return LAST_UPDATED_TIME_;
    }

    public void setLAST_UPDATED_TIME_(LocalDateTime LAST_UPDATED_TIME_) {
        this.LAST_UPDATED_TIME_ = LAST_UPDATED_TIME_;
    }

    @Override
    public String toString() {
        return "Act_hi_varinst{" +
        "ID_=" + ID_ +
        ", PROC_INST_ID_=" + PROC_INST_ID_ +
        ", EXECUTION_ID_=" + EXECUTION_ID_ +
        ", TASK_ID_=" + TASK_ID_ +
        ", NAME_=" + NAME_ +
        ", VAR_TYPE_=" + VAR_TYPE_ +
        ", REV_=" + REV_ +
        ", BYTEARRAY_ID_=" + BYTEARRAY_ID_ +
        ", DOUBLE_=" + DOUBLE_ +
        ", LONG_=" + LONG_ +
        ", TEXT_=" + TEXT_ +
        ", TEXT2_=" + TEXT2_ +
        ", CREATE_TIME_=" + CREATE_TIME_ +
        ", LAST_UPDATED_TIME_=" + LAST_UPDATED_TIME_ +
        "}";
    }
}
