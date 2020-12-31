package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Hr_degree implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDate degree_startdate;

    private LocalDate degree_enddate;

    private String degree_school;

    private String degree_major;

    private String degree_education;

    private String degree_degrees;

    private String degree_crednum;

    private String degree_fulltime;

    private String degree_site;

    private Long hr_emp_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDegree_startdate() {
        return degree_startdate;
    }

    public void setDegree_startdate(LocalDate degree_startdate) {
        this.degree_startdate = degree_startdate;
    }

    public LocalDate getDegree_enddate() {
        return degree_enddate;
    }

    public void setDegree_enddate(LocalDate degree_enddate) {
        this.degree_enddate = degree_enddate;
    }

    public String getDegree_school() {
        return degree_school;
    }

    public void setDegree_school(String degree_school) {
        this.degree_school = degree_school;
    }

    public String getDegree_major() {
        return degree_major;
    }

    public void setDegree_major(String degree_major) {
        this.degree_major = degree_major;
    }

    public String getDegree_education() {
        return degree_education;
    }

    public void setDegree_education(String degree_education) {
        this.degree_education = degree_education;
    }

    public String getDegree_degrees() {
        return degree_degrees;
    }

    public void setDegree_degrees(String degree_degrees) {
        this.degree_degrees = degree_degrees;
    }

    public String getDegree_crednum() {
        return degree_crednum;
    }

    public void setDegree_crednum(String degree_crednum) {
        this.degree_crednum = degree_crednum;
    }

    public String getDegree_fulltime() {
        return degree_fulltime;
    }

    public void setDegree_fulltime(String degree_fulltime) {
        this.degree_fulltime = degree_fulltime;
    }

    public String getDegree_site() {
        return degree_site;
    }

    public void setDegree_site(String degree_site) {
        this.degree_site = degree_site;
    }

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    @Override
    public String toString() {
        return "Hr_degree{" +
        "id=" + id +
        ", degree_startdate=" + degree_startdate +
        ", degree_enddate=" + degree_enddate +
        ", degree_school=" + degree_school +
        ", degree_major=" + degree_major +
        ", degree_education=" + degree_education +
        ", degree_degrees=" + degree_degrees +
        ", degree_crednum=" + degree_crednum +
        ", degree_fulltime=" + degree_fulltime +
        ", degree_site=" + degree_site +
        ", hr_emp_id=" + hr_emp_id +
        "}";
    }
}
