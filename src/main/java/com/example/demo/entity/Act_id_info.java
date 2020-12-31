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
public class Act_id_info implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String USER_ID_;

    private String TYPE_;

    private String KEY_;

    private String VALUE_;

    private Blob PASSWORD_;

    private String PARENT_ID_;


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

    public String getTYPE_() {
        return TYPE_;
    }

    public void setTYPE_(String TYPE_) {
        this.TYPE_ = TYPE_;
    }

    public String getKEY_() {
        return KEY_;
    }

    public void setKEY_(String KEY_) {
        this.KEY_ = KEY_;
    }

    public String getVALUE_() {
        return VALUE_;
    }

    public void setVALUE_(String VALUE_) {
        this.VALUE_ = VALUE_;
    }

    public Blob getPASSWORD_() {
        return PASSWORD_;
    }

    public void setPASSWORD_(Blob PASSWORD_) {
        this.PASSWORD_ = PASSWORD_;
    }

    public String getPARENT_ID_() {
        return PARENT_ID_;
    }

    public void setPARENT_ID_(String PARENT_ID_) {
        this.PARENT_ID_ = PARENT_ID_;
    }

    @Override
    public String toString() {
        return "Act_id_info{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", USER_ID_=" + USER_ID_ +
        ", TYPE_=" + TYPE_ +
        ", KEY_=" + KEY_ +
        ", VALUE_=" + VALUE_ +
        ", PASSWORD_=" + PASSWORD_ +
        ", PARENT_ID_=" + PARENT_ID_ +
        "}";
    }
}
