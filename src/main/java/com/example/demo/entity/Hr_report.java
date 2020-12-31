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
public class Hr_report implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long case_law_id;

    private LocalDate report_date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Long case_law_id) {
        this.case_law_id = case_law_id;
    }

    public LocalDate getReport_date() {
        return report_date;
    }

    public void setReport_date(LocalDate report_date) {
        this.report_date = report_date;
    }

    @Override
    public String toString() {
        return "Hr_report{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", report_date=" + report_date +
        "}";
    }
}
