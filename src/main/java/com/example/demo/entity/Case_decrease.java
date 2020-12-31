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
public class Case_decrease implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer case_law_id;

    private String person;

    private BigDecimal decrease_money;

    private LocalDate apply_date;

    private String reason;

    /**
     * 1,2,3
     */
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Integer case_law_id) {
        this.case_law_id = case_law_id;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public BigDecimal getDecrease_money() {
        return decrease_money;
    }

    public void setDecrease_money(BigDecimal decrease_money) {
        this.decrease_money = decrease_money;
    }

    public LocalDate getApply_date() {
        return apply_date;
    }

    public void setApply_date(LocalDate apply_date) {
        this.apply_date = apply_date;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Case_decrease{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", person=" + person +
        ", decrease_money=" + decrease_money +
        ", apply_date=" + apply_date +
        ", reason=" + reason +
        ", status=" + status +
        "}";
    }
}
