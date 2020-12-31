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
public class Cw_inout implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 收支类别id
     */
    private Long cw_inout_type_id;

    /**
     * 发生日期
     */
    private LocalDate cw_inout_date;

    /**
     * 收支人
     */
    private String cw_inout_person;

    /**
     * 收支金额
     */
    private BigDecimal cw_inout_money;

    /**
     * 支付方式
     */
    private Integer cw_pay_type;

    /**
     * 案件id
     */
    private Long case_law_id;

    /**
     * 录入日期
     */
    private LocalDate cw_enteringdate;

    /**
     * 备注
     */
    private String cw_remark;

    /**
     * 付款人
     */
    private String cw_payer;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCw_inout_type_id() {
        return cw_inout_type_id;
    }

    public void setCw_inout_type_id(Long cw_inout_type_id) {
        this.cw_inout_type_id = cw_inout_type_id;
    }

    public LocalDate getCw_inout_date() {
        return cw_inout_date;
    }

    public void setCw_inout_date(LocalDate cw_inout_date) {
        this.cw_inout_date = cw_inout_date;
    }

    public String getCw_inout_person() {
        return cw_inout_person;
    }

    public void setCw_inout_person(String cw_inout_person) {
        this.cw_inout_person = cw_inout_person;
    }

    public BigDecimal getCw_inout_money() {
        return cw_inout_money;
    }

    public void setCw_inout_money(BigDecimal cw_inout_money) {
        this.cw_inout_money = cw_inout_money;
    }

    public Integer getCw_pay_type() {
        return cw_pay_type;
    }

    public void setCw_pay_type(Integer cw_pay_type) {
        this.cw_pay_type = cw_pay_type;
    }

    public Long getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Long case_law_id) {
        this.case_law_id = case_law_id;
    }

    public LocalDate getCw_enteringdate() {
        return cw_enteringdate;
    }

    public void setCw_enteringdate(LocalDate cw_enteringdate) {
        this.cw_enteringdate = cw_enteringdate;
    }

    public String getCw_remark() {
        return cw_remark;
    }

    public void setCw_remark(String cw_remark) {
        this.cw_remark = cw_remark;
    }

    public String getCw_payer() {
        return cw_payer;
    }

    public void setCw_payer(String cw_payer) {
        this.cw_payer = cw_payer;
    }

    @Override
    public String toString() {
        return "Cw_inout{" +
        "id=" + id +
        ", cw_inout_type_id=" + cw_inout_type_id +
        ", cw_inout_date=" + cw_inout_date +
        ", cw_inout_person=" + cw_inout_person +
        ", cw_inout_money=" + cw_inout_money +
        ", cw_pay_type=" + cw_pay_type +
        ", case_law_id=" + case_law_id +
        ", cw_enteringdate=" + cw_enteringdate +
        ", cw_remark=" + cw_remark +
        ", cw_payer=" + cw_payer +
        "}";
    }
}
