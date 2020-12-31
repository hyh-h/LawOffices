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
public class Act_id_membership implements Serializable {

    private static final long serialVersionUID = 1L;

      private String USER_ID_;

    private String GROUP_ID_;


    public String getUSER_ID_() {
        return USER_ID_;
    }

    public void setUSER_ID_(String USER_ID_) {
        this.USER_ID_ = USER_ID_;
    }

    public String getGROUP_ID_() {
        return GROUP_ID_;
    }

    public void setGROUP_ID_(String GROUP_ID_) {
        this.GROUP_ID_ = GROUP_ID_;
    }

    @Override
    public String toString() {
        return "Act_id_membership{" +
        "USER_ID_=" + USER_ID_ +
        ", GROUP_ID_=" + GROUP_ID_ +
        "}";
    }
}
