package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class Case_case_type implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String case_type_name;

    private Integer type_pid;

    /**
     * 最小金额
     */
    private BigDecimal type_money_min;

    /**
     * 最大金额
     */
    private BigDecimal type_money_max;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCase_type_name() {
        return case_type_name;
    }

    public void setCase_type_name(String case_type_name) {
        this.case_type_name = case_type_name;
    }

    public Integer getType_pid() {
        return type_pid;
    }

    public void setType_pid(Integer type_pid) {
        this.type_pid = type_pid;
    }

    public BigDecimal getType_money_min() {
        return type_money_min;
    }

    public void setType_money_min(BigDecimal type_money_min) {
        this.type_money_min = type_money_min;
    }

    public BigDecimal getType_money_max() {
        return type_money_max;
    }

    public void setType_money_max(BigDecimal type_money_max) {
        this.type_money_max = type_money_max;
    }

    @Override
    public String toString() {
        return "Case_case_type{" +
        "id=" + id +
        ", case_type_name=" + case_type_name +
        ", type_pid=" + type_pid +
        ", type_money_min=" + type_money_min +
        ", type_money_max=" + type_money_max +
        "}";
    }
}
