package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Adm_addresslist implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String addresslist_user;

    private String addresslist_name;

    private Integer addresslist_cellphonenumber;

    private Integer addresslist_telephone;

    private String addresslist_fax;

    private String addresslist_state;

    private Integer addresslist_qq;

    private String addresslist_postbox;

    private String addresslist_sex;

    private Blob addresslist_img;

    private String addresslist_duty;

    private String addresslist_family;

    private String addresslist_comment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddresslist_user() {
        return addresslist_user;
    }

    public void setAddresslist_user(String addresslist_user) {
        this.addresslist_user = addresslist_user;
    }

    public String getAddresslist_name() {
        return addresslist_name;
    }

    public void setAddresslist_name(String addresslist_name) {
        this.addresslist_name = addresslist_name;
    }

    public Integer getAddresslist_cellphonenumber() {
        return addresslist_cellphonenumber;
    }

    public void setAddresslist_cellphonenumber(Integer addresslist_cellphonenumber) {
        this.addresslist_cellphonenumber = addresslist_cellphonenumber;
    }

    public Integer getAddresslist_telephone() {
        return addresslist_telephone;
    }

    public void setAddresslist_telephone(Integer addresslist_telephone) {
        this.addresslist_telephone = addresslist_telephone;
    }

    public String getAddresslist_fax() {
        return addresslist_fax;
    }

    public void setAddresslist_fax(String addresslist_fax) {
        this.addresslist_fax = addresslist_fax;
    }

    public String getAddresslist_state() {
        return addresslist_state;
    }

    public void setAddresslist_state(String addresslist_state) {
        this.addresslist_state = addresslist_state;
    }

    public Integer getAddresslist_qq() {
        return addresslist_qq;
    }

    public void setAddresslist_qq(Integer addresslist_qq) {
        this.addresslist_qq = addresslist_qq;
    }

    public String getAddresslist_postbox() {
        return addresslist_postbox;
    }

    public void setAddresslist_postbox(String addresslist_postbox) {
        this.addresslist_postbox = addresslist_postbox;
    }

    public String getAddresslist_sex() {
        return addresslist_sex;
    }

    public void setAddresslist_sex(String addresslist_sex) {
        this.addresslist_sex = addresslist_sex;
    }

    public Blob getAddresslist_img() {
        return addresslist_img;
    }

    public void setAddresslist_img(Blob addresslist_img) {
        this.addresslist_img = addresslist_img;
    }

    public String getAddresslist_duty() {
        return addresslist_duty;
    }

    public void setAddresslist_duty(String addresslist_duty) {
        this.addresslist_duty = addresslist_duty;
    }

    public String getAddresslist_family() {
        return addresslist_family;
    }

    public void setAddresslist_family(String addresslist_family) {
        this.addresslist_family = addresslist_family;
    }

    public String getAddresslist_comment() {
        return addresslist_comment;
    }

    public void setAddresslist_comment(String addresslist_comment) {
        this.addresslist_comment = addresslist_comment;
    }

    @Override
    public String toString() {
        return "Adm_addresslist{" +
        "id=" + id +
        ", addresslist_user=" + addresslist_user +
        ", addresslist_name=" + addresslist_name +
        ", addresslist_cellphonenumber=" + addresslist_cellphonenumber +
        ", addresslist_telephone=" + addresslist_telephone +
        ", addresslist_fax=" + addresslist_fax +
        ", addresslist_state=" + addresslist_state +
        ", addresslist_qq=" + addresslist_qq +
        ", addresslist_postbox=" + addresslist_postbox +
        ", addresslist_sex=" + addresslist_sex +
        ", addresslist_img=" + addresslist_img +
        ", addresslist_duty=" + addresslist_duty +
        ", addresslist_family=" + addresslist_family +
        ", addresslist_comment=" + addresslist_comment +
        "}";
    }
}
