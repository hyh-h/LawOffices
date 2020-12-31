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
public class Cw_empincome implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 基本工资
     */
    private BigDecimal cw_basic_salary;

    /**
     * 级别工资
     */
    private BigDecimal cw_level_salary;

    /**
     * 管理费
     */
    private BigDecimal cw_management_cost;

    /**
     * 公积金
     */
    private BigDecimal cw_accumulation_fund;

    /**
     * 养老保险
     */
    private BigDecimal cw_pension_insurance;

    /**
     * 其他固定支出项
     */
    private BigDecimal cw_other_fixed_expenses;

    /**
     * 个人所得税
     */
    private BigDecimal cw_individual_income_tax;

    /**
     * 考勤扣款
     */
    private BigDecimal cw_attendance_deduction;

    /**
     * 加班工资
     */
    private BigDecimal cw_overtime_wage;

    /**
     * 年终奖
     */
    private BigDecimal cw_yearend_bonus;

    /**
     * 日期
     */
    private LocalDate cw_empincome_date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getCw_basic_salary() {
        return cw_basic_salary;
    }

    public void setCw_basic_salary(BigDecimal cw_basic_salary) {
        this.cw_basic_salary = cw_basic_salary;
    }

    public BigDecimal getCw_level_salary() {
        return cw_level_salary;
    }

    public void setCw_level_salary(BigDecimal cw_level_salary) {
        this.cw_level_salary = cw_level_salary;
    }

    public BigDecimal getCw_management_cost() {
        return cw_management_cost;
    }

    public void setCw_management_cost(BigDecimal cw_management_cost) {
        this.cw_management_cost = cw_management_cost;
    }

    public BigDecimal getCw_accumulation_fund() {
        return cw_accumulation_fund;
    }

    public void setCw_accumulation_fund(BigDecimal cw_accumulation_fund) {
        this.cw_accumulation_fund = cw_accumulation_fund;
    }

    public BigDecimal getCw_pension_insurance() {
        return cw_pension_insurance;
    }

    public void setCw_pension_insurance(BigDecimal cw_pension_insurance) {
        this.cw_pension_insurance = cw_pension_insurance;
    }

    public BigDecimal getCw_other_fixed_expenses() {
        return cw_other_fixed_expenses;
    }

    public void setCw_other_fixed_expenses(BigDecimal cw_other_fixed_expenses) {
        this.cw_other_fixed_expenses = cw_other_fixed_expenses;
    }

    public BigDecimal getCw_individual_income_tax() {
        return cw_individual_income_tax;
    }

    public void setCw_individual_income_tax(BigDecimal cw_individual_income_tax) {
        this.cw_individual_income_tax = cw_individual_income_tax;
    }

    public BigDecimal getCw_attendance_deduction() {
        return cw_attendance_deduction;
    }

    public void setCw_attendance_deduction(BigDecimal cw_attendance_deduction) {
        this.cw_attendance_deduction = cw_attendance_deduction;
    }

    public BigDecimal getCw_overtime_wage() {
        return cw_overtime_wage;
    }

    public void setCw_overtime_wage(BigDecimal cw_overtime_wage) {
        this.cw_overtime_wage = cw_overtime_wage;
    }

    public BigDecimal getCw_yearend_bonus() {
        return cw_yearend_bonus;
    }

    public void setCw_yearend_bonus(BigDecimal cw_yearend_bonus) {
        this.cw_yearend_bonus = cw_yearend_bonus;
    }

    public LocalDate getCw_empincome_date() {
        return cw_empincome_date;
    }

    public void setCw_empincome_date(LocalDate cw_empincome_date) {
        this.cw_empincome_date = cw_empincome_date;
    }

    @Override
    public String toString() {
        return "Cw_empincome{" +
        "id=" + id +
        ", cw_basic_salary=" + cw_basic_salary +
        ", cw_level_salary=" + cw_level_salary +
        ", cw_management_cost=" + cw_management_cost +
        ", cw_accumulation_fund=" + cw_accumulation_fund +
        ", cw_pension_insurance=" + cw_pension_insurance +
        ", cw_other_fixed_expenses=" + cw_other_fixed_expenses +
        ", cw_individual_income_tax=" + cw_individual_income_tax +
        ", cw_attendance_deduction=" + cw_attendance_deduction +
        ", cw_overtime_wage=" + cw_overtime_wage +
        ", cw_yearend_bonus=" + cw_yearend_bonus +
        ", cw_empincome_date=" + cw_empincome_date +
        "}";
    }
}
