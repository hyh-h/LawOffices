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
public class Log_job implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer whatis_person;

    private Integer logtype_id;

    private String case_law_id;

    private Integer client_id;

    private LocalDate joblog_startTime;

    private LocalDate joblog_enddTime;

    private String joblog_reportedTime;

    private LocalDate joblog_updatetime;

    private String joblog_file;

    private String joblog_text;

    private String joblog_status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWhatis_person() {
        return whatis_person;
    }

    public void setWhatis_person(Integer whatis_person) {
        this.whatis_person = whatis_person;
    }

    public Integer getLogtype_id() {
        return logtype_id;
    }

    public void setLogtype_id(Integer logtype_id) {
        this.logtype_id = logtype_id;
    }

    public String getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(String case_law_id) {
        this.case_law_id = case_law_id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public LocalDate getJoblog_startTime() {
        return joblog_startTime;
    }

    public void setJoblog_startTime(LocalDate joblog_startTime) {
        this.joblog_startTime = joblog_startTime;
    }

    public LocalDate getJoblog_enddTime() {
        return joblog_enddTime;
    }

    public void setJoblog_enddTime(LocalDate joblog_enddTime) {
        this.joblog_enddTime = joblog_enddTime;
    }

    public String getJoblog_reportedTime() {
        return joblog_reportedTime;
    }

    public void setJoblog_reportedTime(String joblog_reportedTime) {
        this.joblog_reportedTime = joblog_reportedTime;
    }

    public LocalDate getJoblog_updatetime() {
        return joblog_updatetime;
    }

    public void setJoblog_updatetime(LocalDate joblog_updatetime) {
        this.joblog_updatetime = joblog_updatetime;
    }

    public String getJoblog_file() {
        return joblog_file;
    }

    public void setJoblog_file(String joblog_file) {
        this.joblog_file = joblog_file;
    }

    public String getJoblog_text() {
        return joblog_text;
    }

    public void setJoblog_text(String joblog_text) {
        this.joblog_text = joblog_text;
    }

    public String getJoblog_status() {
        return joblog_status;
    }

    public void setJoblog_status(String joblog_status) {
        this.joblog_status = joblog_status;
    }

    @Override
    public String toString() {
        return "Log_job{" +
        "id=" + id +
        ", whatis_person=" + whatis_person +
        ", logtype_id=" + logtype_id +
        ", case_law_id=" + case_law_id +
        ", client_id=" + client_id +
        ", joblog_startTime=" + joblog_startTime +
        ", joblog_enddTime=" + joblog_enddTime +
        ", joblog_reportedTime=" + joblog_reportedTime +
        ", joblog_updatetime=" + joblog_updatetime +
        ", joblog_file=" + joblog_file +
        ", joblog_text=" + joblog_text +
        ", joblog_status=" + joblog_status +
        "}";
    }
}
