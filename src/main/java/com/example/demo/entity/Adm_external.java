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
public class Adm_external implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String external_companyname;

    private String dept;

    private String jobtitle;

    private String external_contacts;

    private Integer external_cellphonenumber;

    private Integer external_telephone;

    private String external_fax;

    private String external_family;

    private String external_postbox;

    private String external_comment;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExternal_companyname() {
        return external_companyname;
    }

    public void setExternal_companyname(String external_companyname) {
        this.external_companyname = external_companyname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getExternal_contacts() {
        return external_contacts;
    }

    public void setExternal_contacts(String external_contacts) {
        this.external_contacts = external_contacts;
    }

    public Integer getExternal_cellphonenumber() {
        return external_cellphonenumber;
    }

    public void setExternal_cellphonenumber(Integer external_cellphonenumber) {
        this.external_cellphonenumber = external_cellphonenumber;
    }

    public Integer getExternal_telephone() {
        return external_telephone;
    }

    public void setExternal_telephone(Integer external_telephone) {
        this.external_telephone = external_telephone;
    }

    public String getExternal_fax() {
        return external_fax;
    }

    public void setExternal_fax(String external_fax) {
        this.external_fax = external_fax;
    }

    public String getExternal_family() {
        return external_family;
    }

    public void setExternal_family(String external_family) {
        this.external_family = external_family;
    }

    public String getExternal_postbox() {
        return external_postbox;
    }

    public void setExternal_postbox(String external_postbox) {
        this.external_postbox = external_postbox;
    }

    public String getExternal_comment() {
        return external_comment;
    }

    public void setExternal_comment(String external_comment) {
        this.external_comment = external_comment;
    }

    @Override
    public String toString() {
        return "Adm_external{" +
        "id=" + id +
        ", external_companyname=" + external_companyname +
        ", dept=" + dept +
        ", jobtitle=" + jobtitle +
        ", external_contacts=" + external_contacts +
        ", external_cellphonenumber=" + external_cellphonenumber +
        ", external_telephone=" + external_telephone +
        ", external_fax=" + external_fax +
        ", external_family=" + external_family +
        ", external_postbox=" + external_postbox +
        ", external_comment=" + external_comment +
        "}";
    }
}
