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
public class Case_procuratorial_work implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String case_law_id;

    private String work_office;

    private String work_dept;

    private String work_undertaker;

    private String work_tel;

    private LocalDate work_investigate_prosecute_time;


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

    public String getWork_office() {
        return work_office;
    }

    public void setWork_office(String work_office) {
        this.work_office = work_office;
    }

    public String getWork_dept() {
        return work_dept;
    }

    public void setWork_dept(String work_dept) {
        this.work_dept = work_dept;
    }

    public String getWork_undertaker() {
        return work_undertaker;
    }

    public void setWork_undertaker(String work_undertaker) {
        this.work_undertaker = work_undertaker;
    }

    public String getWork_tel() {
        return work_tel;
    }

    public void setWork_tel(String work_tel) {
        this.work_tel = work_tel;
    }

    public LocalDate getWork_investigate_prosecute_time() {
        return work_investigate_prosecute_time;
    }

    public void setWork_investigate_prosecute_time(LocalDate work_investigate_prosecute_time) {
        this.work_investigate_prosecute_time = work_investigate_prosecute_time;
    }

    @Override
    public String toString() {
        return "Case_procuratorial_work{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", work_office=" + work_office +
        ", work_dept=" + work_dept +
        ", work_undertaker=" + work_undertaker +
        ", work_tel=" + work_tel +
        ", work_investigate_prosecute_time=" + work_investigate_prosecute_time +
        "}";
    }
}
