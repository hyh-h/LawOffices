package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Hr_emp implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String emp_name;

    private LocalDate emp_birthdate;

    private String emp_sex;

    private String emp_workstatus;

    private String emp_paperstype;

    private String emp_papersnum;

    private String emp_higth_education;

    private String emp_higth_degree;

    private String emp_position;

    private String hr_nation_id;

    private String hr_political_id;

    private String emp_maritalsta;

    private String emp_entrancenum;

    private String hr_specialty_id;

    private String hr_practise_id;

    private String emp_pracnum;

    private LocalDate emp_pracdate;

    private String emp_pracsite;

    private String hr_certify_id;

    private String emp_certifynum;

    private String emp_gainway;

    private String emp_gainsite;

    private String emp_introduce;

    private LocalDate emp_entrydate;

    private String emp_social_num;

    private LocalDate emp_cont_startdate;

    private LocalDate emp_cont_enddate;

    private String emp_insured;

    private String emp_phone;

    private Blob emp_picture;

    private String emp_site;

    private String emp_contact_phone;

    private String emp_email;

    private String emp_postcode;

    private String emp_qq;

    private String emp_wechat;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public LocalDate getEmp_birthdate() {
        return emp_birthdate;
    }

    public void setEmp_birthdate(LocalDate emp_birthdate) {
        this.emp_birthdate = emp_birthdate;
    }

    public String getEmp_sex() {
        return emp_sex;
    }

    public void setEmp_sex(String emp_sex) {
        this.emp_sex = emp_sex;
    }

    public String getEmp_workstatus() {
        return emp_workstatus;
    }

    public void setEmp_workstatus(String emp_workstatus) {
        this.emp_workstatus = emp_workstatus;
    }

    public String getEmp_paperstype() {
        return emp_paperstype;
    }

    public void setEmp_paperstype(String emp_paperstype) {
        this.emp_paperstype = emp_paperstype;
    }

    public String getEmp_papersnum() {
        return emp_papersnum;
    }

    public void setEmp_papersnum(String emp_papersnum) {
        this.emp_papersnum = emp_papersnum;
    }

    public String getEmp_higth_education() {
        return emp_higth_education;
    }

    public void setEmp_higth_education(String emp_higth_education) {
        this.emp_higth_education = emp_higth_education;
    }

    public String getEmp_higth_degree() {
        return emp_higth_degree;
    }

    public void setEmp_higth_degree(String emp_higth_degree) {
        this.emp_higth_degree = emp_higth_degree;
    }

    public String getEmp_position() {
        return emp_position;
    }

    public void setEmp_position(String emp_position) {
        this.emp_position = emp_position;
    }

    public String getHr_nation_id() {
        return hr_nation_id;
    }

    public void setHr_nation_id(String hr_nation_id) {
        this.hr_nation_id = hr_nation_id;
    }

    public String getHr_political_id() {
        return hr_political_id;
    }

    public void setHr_political_id(String hr_political_id) {
        this.hr_political_id = hr_political_id;
    }

    public String getEmp_maritalsta() {
        return emp_maritalsta;
    }

    public void setEmp_maritalsta(String emp_maritalsta) {
        this.emp_maritalsta = emp_maritalsta;
    }

    public String getEmp_entrancenum() {
        return emp_entrancenum;
    }

    public void setEmp_entrancenum(String emp_entrancenum) {
        this.emp_entrancenum = emp_entrancenum;
    }

    public String getHr_specialty_id() {
        return hr_specialty_id;
    }

    public void setHr_specialty_id(String hr_specialty_id) {
        this.hr_specialty_id = hr_specialty_id;
    }

    public String getHr_practise_id() {
        return hr_practise_id;
    }

    public void setHr_practise_id(String hr_practise_id) {
        this.hr_practise_id = hr_practise_id;
    }

    public String getEmp_pracnum() {
        return emp_pracnum;
    }

    public void setEmp_pracnum(String emp_pracnum) {
        this.emp_pracnum = emp_pracnum;
    }

    public LocalDate getEmp_pracdate() {
        return emp_pracdate;
    }

    public void setEmp_pracdate(LocalDate emp_pracdate) {
        this.emp_pracdate = emp_pracdate;
    }

    public String getEmp_pracsite() {
        return emp_pracsite;
    }

    public void setEmp_pracsite(String emp_pracsite) {
        this.emp_pracsite = emp_pracsite;
    }

    public String getHr_certify_id() {
        return hr_certify_id;
    }

    public void setHr_certify_id(String hr_certify_id) {
        this.hr_certify_id = hr_certify_id;
    }

    public String getEmp_certifynum() {
        return emp_certifynum;
    }

    public void setEmp_certifynum(String emp_certifynum) {
        this.emp_certifynum = emp_certifynum;
    }

    public String getEmp_gainway() {
        return emp_gainway;
    }

    public void setEmp_gainway(String emp_gainway) {
        this.emp_gainway = emp_gainway;
    }

    public String getEmp_gainsite() {
        return emp_gainsite;
    }

    public void setEmp_gainsite(String emp_gainsite) {
        this.emp_gainsite = emp_gainsite;
    }

    public String getEmp_introduce() {
        return emp_introduce;
    }

    public void setEmp_introduce(String emp_introduce) {
        this.emp_introduce = emp_introduce;
    }

    public LocalDate getEmp_entrydate() {
        return emp_entrydate;
    }

    public void setEmp_entrydate(LocalDate emp_entrydate) {
        this.emp_entrydate = emp_entrydate;
    }

    public String getEmp_social_num() {
        return emp_social_num;
    }

    public void setEmp_social_num(String emp_social_num) {
        this.emp_social_num = emp_social_num;
    }

    public LocalDate getEmp_cont_startdate() {
        return emp_cont_startdate;
    }

    public void setEmp_cont_startdate(LocalDate emp_cont_startdate) {
        this.emp_cont_startdate = emp_cont_startdate;
    }

    public LocalDate getEmp_cont_enddate() {
        return emp_cont_enddate;
    }

    public void setEmp_cont_enddate(LocalDate emp_cont_enddate) {
        this.emp_cont_enddate = emp_cont_enddate;
    }

    public String getEmp_insured() {
        return emp_insured;
    }

    public void setEmp_insured(String emp_insured) {
        this.emp_insured = emp_insured;
    }

    public String getEmp_phone() {
        return emp_phone;
    }

    public void setEmp_phone(String emp_phone) {
        this.emp_phone = emp_phone;
    }

    public Blob getEmp_picture() {
        return emp_picture;
    }

    public void setEmp_picture(Blob emp_picture) {
        this.emp_picture = emp_picture;
    }

    public String getEmp_site() {
        return emp_site;
    }

    public void setEmp_site(String emp_site) {
        this.emp_site = emp_site;
    }

    public String getEmp_contact_phone() {
        return emp_contact_phone;
    }

    public void setEmp_contact_phone(String emp_contact_phone) {
        this.emp_contact_phone = emp_contact_phone;
    }

    public String getEmp_email() {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getEmp_postcode() {
        return emp_postcode;
    }

    public void setEmp_postcode(String emp_postcode) {
        this.emp_postcode = emp_postcode;
    }

    public String getEmp_qq() {
        return emp_qq;
    }

    public void setEmp_qq(String emp_qq) {
        this.emp_qq = emp_qq;
    }

    public String getEmp_wechat() {
        return emp_wechat;
    }

    public void setEmp_wechat(String emp_wechat) {
        this.emp_wechat = emp_wechat;
    }

    @Override
    public String toString() {
        return "Hr_emp{" +
        "id=" + id +
        ", emp_name=" + emp_name +
        ", emp_birthdate=" + emp_birthdate +
        ", emp_sex=" + emp_sex +
        ", emp_workstatus=" + emp_workstatus +
        ", emp_paperstype=" + emp_paperstype +
        ", emp_papersnum=" + emp_papersnum +
        ", emp_higth_education=" + emp_higth_education +
        ", emp_higth_degree=" + emp_higth_degree +
        ", emp_position=" + emp_position +
        ", hr_nation_id=" + hr_nation_id +
        ", hr_political_id=" + hr_political_id +
        ", emp_maritalsta=" + emp_maritalsta +
        ", emp_entrancenum=" + emp_entrancenum +
        ", hr_specialty_id=" + hr_specialty_id +
        ", hr_practise_id=" + hr_practise_id +
        ", emp_pracnum=" + emp_pracnum +
        ", emp_pracdate=" + emp_pracdate +
        ", emp_pracsite=" + emp_pracsite +
        ", hr_certify_id=" + hr_certify_id +
        ", emp_certifynum=" + emp_certifynum +
        ", emp_gainway=" + emp_gainway +
        ", emp_gainsite=" + emp_gainsite +
        ", emp_introduce=" + emp_introduce +
        ", emp_entrydate=" + emp_entrydate +
        ", emp_social_num=" + emp_social_num +
        ", emp_cont_startdate=" + emp_cont_startdate +
        ", emp_cont_enddate=" + emp_cont_enddate +
        ", emp_insured=" + emp_insured +
        ", emp_phone=" + emp_phone +
        ", emp_picture=" + emp_picture +
        ", emp_site=" + emp_site +
        ", emp_contact_phone=" + emp_contact_phone +
        ", emp_email=" + emp_email +
        ", emp_postcode=" + emp_postcode +
        ", emp_qq=" + emp_qq +
        ", emp_wechat=" + emp_wechat +
        "}";
    }
}
