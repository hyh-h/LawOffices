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
public class Act_ge_property implements Serializable {

    private static final long serialVersionUID = 1L;

      private String NAME_;

    private String VALUE_;

    private Integer REV_;


    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getVALUE_() {
        return VALUE_;
    }

    public void setVALUE_(String VALUE_) {
        this.VALUE_ = VALUE_;
    }

    public Integer getREV_() {
        return REV_;
    }

    public void setREV_(Integer REV_) {
        this.REV_ = REV_;
    }

    @Override
    public String toString() {
        return "Act_ge_property{" +
        "NAME_=" + NAME_ +
        ", VALUE_=" + VALUE_ +
        ", REV_=" + REV_ +
        "}";
    }
}
