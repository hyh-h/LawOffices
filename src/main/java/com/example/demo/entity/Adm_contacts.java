package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Adm_contacts implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 单位名称
     */
    private String unitname;

    /**
     * 联系人
     */
    private String contact_name;

    /**
     * 手机
     */
    private String contact_phone;

    /**
     * 部门
     */
    private String contact_dept;

    /**
     * 职务
     */
    private String contact_post;

    /**
     * 电话
     */
    private String contact_tel;

    /**
     * 邮箱
     */
    private String contact_email;

    /**
     * 地址
     */
    private String contact_address;

    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getContact_dept() {
        return contact_dept;
    }

    public void setContact_dept(String contact_dept) {
        this.contact_dept = contact_dept;
    }

    public String getContact_post() {
        return contact_post;
    }

    public void setContact_post(String contact_post) {
        this.contact_post = contact_post;
    }

    public String getContact_tel() {
        return contact_tel;
    }

    public void setContact_tel(String contact_tel) {
        this.contact_tel = contact_tel;
    }

    public String getContact_email() {
        return contact_email;
    }

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }

    public String getContact_address() {
        return contact_address;
    }

    public void setContact_address(String contact_address) {
        this.contact_address = contact_address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Adm_contacts{" +
        "id=" + id +
        ", unitname=" + unitname +
        ", contact_name=" + contact_name +
        ", contact_phone=" + contact_phone +
        ", contact_dept=" + contact_dept +
        ", contact_post=" + contact_post +
        ", contact_tel=" + contact_tel +
        ", contact_email=" + contact_email +
        ", contact_address=" + contact_address +
        ", remark=" + remark +
        "}";
    }
}
