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
public class Hr_workhistory implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private LocalDate workhistory_startdate;

    private LocalDate workhistory_enddate;

    private String workhistory_workunit;

    private String workhistory_job_position;

    private String workhistory_worktype;

    private String workhistory_worknature;

    private String workhistory_site;

    private Long hr_emp_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getWorkhistory_startdate() {
        return workhistory_startdate;
    }

    public void setWorkhistory_startdate(LocalDate workhistory_startdate) {
        this.workhistory_startdate = workhistory_startdate;
    }

    public LocalDate getWorkhistory_enddate() {
        return workhistory_enddate;
    }

    public void setWorkhistory_enddate(LocalDate workhistory_enddate) {
        this.workhistory_enddate = workhistory_enddate;
    }

    public String getWorkhistory_workunit() {
        return workhistory_workunit;
    }

    public void setWorkhistory_workunit(String workhistory_workunit) {
        this.workhistory_workunit = workhistory_workunit;
    }

    public String getWorkhistory_job_position() {
        return workhistory_job_position;
    }

    public void setWorkhistory_job_position(String workhistory_job_position) {
        this.workhistory_job_position = workhistory_job_position;
    }

    public String getWorkhistory_worktype() {
        return workhistory_worktype;
    }

    public void setWorkhistory_worktype(String workhistory_worktype) {
        this.workhistory_worktype = workhistory_worktype;
    }

    public String getWorkhistory_worknature() {
        return workhistory_worknature;
    }

    public void setWorkhistory_worknature(String workhistory_worknature) {
        this.workhistory_worknature = workhistory_worknature;
    }

    public String getWorkhistory_site() {
        return workhistory_site;
    }

    public void setWorkhistory_site(String workhistory_site) {
        this.workhistory_site = workhistory_site;
    }

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    @Override
    public String toString() {
        return "Hr_workhistory{" +
        "id=" + id +
        ", workhistory_startdate=" + workhistory_startdate +
        ", workhistory_enddate=" + workhistory_enddate +
        ", workhistory_workunit=" + workhistory_workunit +
        ", workhistory_job_position=" + workhistory_job_position +
        ", workhistory_worktype=" + workhistory_worktype +
        ", workhistory_worknature=" + workhistory_worknature +
        ", workhistory_site=" + workhistory_site +
        ", hr_emp_id=" + hr_emp_id +
        "}";
    }
}
