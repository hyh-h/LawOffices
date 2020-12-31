package com.example.demo.entity;

import java.math.BigDecimal;
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
public class Cw_history_statistic implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String emp_name;

    private LocalDate cw_begin_date;

    private LocalDate cw_end_date;

    private BigDecimal cw_income_all;

    private BigDecimal cw_expend_all;

    private BigDecimal cw_actual;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public LocalDate getCw_begin_date() {
        return cw_begin_date;
    }

    public void setCw_begin_date(LocalDate cw_begin_date) {
        this.cw_begin_date = cw_begin_date;
    }

    public LocalDate getCw_end_date() {
        return cw_end_date;
    }

    public void setCw_end_date(LocalDate cw_end_date) {
        this.cw_end_date = cw_end_date;
    }

    public BigDecimal getCw_income_all() {
        return cw_income_all;
    }

    public void setCw_income_all(BigDecimal cw_income_all) {
        this.cw_income_all = cw_income_all;
    }

    public BigDecimal getCw_expend_all() {
        return cw_expend_all;
    }

    public void setCw_expend_all(BigDecimal cw_expend_all) {
        this.cw_expend_all = cw_expend_all;
    }

    public BigDecimal getCw_actual() {
        return cw_actual;
    }

    public void setCw_actual(BigDecimal cw_actual) {
        this.cw_actual = cw_actual;
    }

    @Override
    public String toString() {
        return "Cw_history_statistic{" +
        "id=" + id +
        ", emp_name=" + emp_name +
        ", cw_begin_date=" + cw_begin_date +
        ", cw_end_date=" + cw_end_date +
        ", cw_income_all=" + cw_income_all +
        ", cw_expend_all=" + cw_expend_all +
        ", cw_actual=" + cw_actual +
        "}";
    }
}
