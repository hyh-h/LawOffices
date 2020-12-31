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
public class Case_cost_relief implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String case_law_id;

    private String relief_proposer;

    private BigDecimal relief_credit_amount;

    private LocalDate relief_application_date;

    private String relief_for;

    private Integer relief_application_for_exemption;

    private String relief_approval_status;

    private String relief_application_type;


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

    public String getRelief_proposer() {
        return relief_proposer;
    }

    public void setRelief_proposer(String relief_proposer) {
        this.relief_proposer = relief_proposer;
    }

    public BigDecimal getRelief_credit_amount() {
        return relief_credit_amount;
    }

    public void setRelief_credit_amount(BigDecimal relief_credit_amount) {
        this.relief_credit_amount = relief_credit_amount;
    }

    public LocalDate getRelief_application_date() {
        return relief_application_date;
    }

    public void setRelief_application_date(LocalDate relief_application_date) {
        this.relief_application_date = relief_application_date;
    }

    public String getRelief_for() {
        return relief_for;
    }

    public void setRelief_for(String relief_for) {
        this.relief_for = relief_for;
    }

    public Integer getRelief_application_for_exemption() {
        return relief_application_for_exemption;
    }

    public void setRelief_application_for_exemption(Integer relief_application_for_exemption) {
        this.relief_application_for_exemption = relief_application_for_exemption;
    }

    public String getRelief_approval_status() {
        return relief_approval_status;
    }

    public void setRelief_approval_status(String relief_approval_status) {
        this.relief_approval_status = relief_approval_status;
    }

    public String getRelief_application_type() {
        return relief_application_type;
    }

    public void setRelief_application_type(String relief_application_type) {
        this.relief_application_type = relief_application_type;
    }

    @Override
    public String toString() {
        return "Case_cost_relief{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", relief_proposer=" + relief_proposer +
        ", relief_credit_amount=" + relief_credit_amount +
        ", relief_application_date=" + relief_application_date +
        ", relief_for=" + relief_for +
        ", relief_application_for_exemption=" + relief_application_for_exemption +
        ", relief_approval_status=" + relief_approval_status +
        ", relief_application_type=" + relief_application_type +
        "}";
    }
}
