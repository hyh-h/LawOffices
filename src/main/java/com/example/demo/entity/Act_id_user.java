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
public class Act_id_user implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String FIRST_;

    private String LAST_;

    private String EMAIL_;

    private String PWD_;

    private String PICTURE_ID_;


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

    public String getFIRST_() {
        return FIRST_;
    }

    public void setFIRST_(String FIRST_) {
        this.FIRST_ = FIRST_;
    }

    public String getLAST_() {
        return LAST_;
    }

    public void setLAST_(String LAST_) {
        this.LAST_ = LAST_;
    }

    public String getEMAIL_() {
        return EMAIL_;
    }

    public void setEMAIL_(String EMAIL_) {
        this.EMAIL_ = EMAIL_;
    }

    public String getPWD_() {
        return PWD_;
    }

    public void setPWD_(String PWD_) {
        this.PWD_ = PWD_;
    }

    public String getPICTURE_ID_() {
        return PICTURE_ID_;
    }

    public void setPICTURE_ID_(String PICTURE_ID_) {
        this.PICTURE_ID_ = PICTURE_ID_;
    }

    @Override
    public String toString() {
        return "Act_id_user{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", FIRST_=" + FIRST_ +
        ", LAST_=" + LAST_ +
        ", EMAIL_=" + EMAIL_ +
        ", PWD_=" + PWD_ +
        ", PICTURE_ID_=" + PICTURE_ID_ +
        "}";
    }
}
