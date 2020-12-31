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
public class Case_investigation implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String case_law_id;

    private String investigation_office;

    private String investigation_no;

    private String investigation_dept;

    private String investigation_undertaker;

    private LocalDate investigation_criminal_time;

    private LocalDate investigation_arrest_time;

    private String investigation_tel;

    private Integer investigation_deadline;

    private String investigation_supplement_deadline;

    private String investigation_secondary_supplementary;

    private String investigation_remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(String case_law_id) {
        this.case_law_id = case_law_id;
    }

    public String getInvestigation_office() {
        return investigation_office;
    }

    public void setInvestigation_office(String investigation_office) {
        this.investigation_office = investigation_office;
    }

    public String getInvestigation_no() {
        return investigation_no;
    }

    public void setInvestigation_no(String investigation_no) {
        this.investigation_no = investigation_no;
    }

    public String getInvestigation_dept() {
        return investigation_dept;
    }

    public void setInvestigation_dept(String investigation_dept) {
        this.investigation_dept = investigation_dept;
    }

    public String getInvestigation_undertaker() {
        return investigation_undertaker;
    }

    public void setInvestigation_undertaker(String investigation_undertaker) {
        this.investigation_undertaker = investigation_undertaker;
    }

    public LocalDate getInvestigation_criminal_time() {
        return investigation_criminal_time;
    }

    public void setInvestigation_criminal_time(LocalDate investigation_criminal_time) {
        this.investigation_criminal_time = investigation_criminal_time;
    }

    public LocalDate getInvestigation_arrest_time() {
        return investigation_arrest_time;
    }

    public void setInvestigation_arrest_time(LocalDate investigation_arrest_time) {
        this.investigation_arrest_time = investigation_arrest_time;
    }

    public String getInvestigation_tel() {
        return investigation_tel;
    }

    public void setInvestigation_tel(String investigation_tel) {
        this.investigation_tel = investigation_tel;
    }

    public Integer getInvestigation_deadline() {
        return investigation_deadline;
    }

    public void setInvestigation_deadline(Integer investigation_deadline) {
        this.investigation_deadline = investigation_deadline;
    }

    public String getInvestigation_supplement_deadline() {
        return investigation_supplement_deadline;
    }

    public void setInvestigation_supplement_deadline(String investigation_supplement_deadline) {
        this.investigation_supplement_deadline = investigation_supplement_deadline;
    }

    public String getInvestigation_secondary_supplementary() {
        return investigation_secondary_supplementary;
    }

    public void setInvestigation_secondary_supplementary(String investigation_secondary_supplementary) {
        this.investigation_secondary_supplementary = investigation_secondary_supplementary;
    }

    public String getInvestigation_remark() {
        return investigation_remark;
    }

    public void setInvestigation_remark(String investigation_remark) {
        this.investigation_remark = investigation_remark;
    }

    @Override
    public String toString() {
        return "Case_investigation{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", investigation_office=" + investigation_office +
        ", investigation_no=" + investigation_no +
        ", investigation_dept=" + investigation_dept +
        ", investigation_undertaker=" + investigation_undertaker +
        ", investigation_criminal_time=" + investigation_criminal_time +
        ", investigation_arrest_time=" + investigation_arrest_time +
        ", investigation_tel=" + investigation_tel +
        ", investigation_deadline=" + investigation_deadline +
        ", investigation_supplement_deadline=" + investigation_supplement_deadline +
        ", investigation_secondary_supplementary=" + investigation_secondary_supplementary +
        ", investigation_remark=" + investigation_remark +
        "}";
    }
}
