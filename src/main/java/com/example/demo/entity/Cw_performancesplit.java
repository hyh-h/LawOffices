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
public class Cw_performancesplit implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 案件id
     */
    private Long case_law_id;

    /**
     * 员工id
     */
    private Long hr_emp_id;

    /**
     * 承办律师类型 主办律师 协助律师 督办律师 实习律师
     */
    private String case_attorney;

    /**
     * 业绩分成
     */
    private Integer cw_performancesplit;

    /**
     * 分成方式
     */
    private String cw_split_type;

    /**
     * 实际提成金额
     */
    private BigDecimal cw_real_split_money;

    /**
     * 1代表案件  2代表咨询代书
     */
    private String type;


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

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    public String getCase_attorney() {
        return case_attorney;
    }

    public void setCase_attorney(String case_attorney) {
        this.case_attorney = case_attorney;
    }

    public Integer getCw_performancesplit() {
        return cw_performancesplit;
    }

    public void setCw_performancesplit(Integer cw_performancesplit) {
        this.cw_performancesplit = cw_performancesplit;
    }

    public String getCw_split_type() {
        return cw_split_type;
    }

    public void setCw_split_type(String cw_split_type) {
        this.cw_split_type = cw_split_type;
    }

    public BigDecimal getCw_real_split_money() {
        return cw_real_split_money;
    }

    public void setCw_real_split_money(BigDecimal cw_real_split_money) {
        this.cw_real_split_money = cw_real_split_money;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cw_performancesplit{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", hr_emp_id=" + hr_emp_id +
        ", case_attorney=" + case_attorney +
        ", cw_performancesplit=" + cw_performancesplit +
        ", cw_split_type=" + cw_split_type +
        ", cw_real_split_money=" + cw_real_split_money +
        ", type=" + type +
        "}";
    }
}
