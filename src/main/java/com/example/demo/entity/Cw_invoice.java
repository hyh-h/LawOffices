package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.sql.Blob;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Cw_invoice implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发票抬头
     */
    private String cw_invoice_title;

    /**
     * 发票金额
     */
    private BigDecimal cw_invoice_money;

    /**
     * 申请日期
     */
    private LocalDate cw_application_date;

    /**
     * 开票日期
     */
    private LocalDate cw_invoice_date;

    /**
     * 开票状态
     */
    private String cw_invoice_status;

    /**
     * 发票号
     */
    private String cw_invoice_number;

    /**
     * 开具类型
     */
    private Integer cw_open_type;

    /**
     * 发票类型
     */
    private Integer cw_invoice_type;

    /**
     * 开票项目
     */
    private Integer cw_invoice_item;

    /**
     * 纳税人识别号
     */
    private String cw_taxpayer_identity_number;

    /**
     * 基本开户银行
     */
    private String cw_basic_bankofdeposit;

    /**
     * 注册地址
     */
    private String cw_registered_address;

    /**
     * 固定电话
     */
    private String cw_fixedline_telephone;

    /**
     * 税务登记证副本(文件id)
     */
    private Blob record_file_id;

    /**
     * 案件表外键id
     */
    private Integer case_law_id;

    /**
     * 申请备注
     */
    private String cw_application_remark;

    /**
     * 开票备注
     */
    private String cw_invoice_remark;

    /**
     * 基本开户账号
     */
    private String cw_account_number;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCw_invoice_title() {
        return cw_invoice_title;
    }

    public void setCw_invoice_title(String cw_invoice_title) {
        this.cw_invoice_title = cw_invoice_title;
    }

    public BigDecimal getCw_invoice_money() {
        return cw_invoice_money;
    }

    public void setCw_invoice_money(BigDecimal cw_invoice_money) {
        this.cw_invoice_money = cw_invoice_money;
    }

    public LocalDate getCw_application_date() {
        return cw_application_date;
    }

    public void setCw_application_date(LocalDate cw_application_date) {
        this.cw_application_date = cw_application_date;
    }

    public LocalDate getCw_invoice_date() {
        return cw_invoice_date;
    }

    public void setCw_invoice_date(LocalDate cw_invoice_date) {
        this.cw_invoice_date = cw_invoice_date;
    }

    public String getCw_invoice_status() {
        return cw_invoice_status;
    }

    public void setCw_invoice_status(String cw_invoice_status) {
        this.cw_invoice_status = cw_invoice_status;
    }

    public String getCw_invoice_number() {
        return cw_invoice_number;
    }

    public void setCw_invoice_number(String cw_invoice_number) {
        this.cw_invoice_number = cw_invoice_number;
    }

    public Integer getCw_open_type() {
        return cw_open_type;
    }

    public void setCw_open_type(Integer cw_open_type) {
        this.cw_open_type = cw_open_type;
    }

    public Integer getCw_invoice_type() {
        return cw_invoice_type;
    }

    public void setCw_invoice_type(Integer cw_invoice_type) {
        this.cw_invoice_type = cw_invoice_type;
    }

    public Integer getCw_invoice_item() {
        return cw_invoice_item;
    }

    public void setCw_invoice_item(Integer cw_invoice_item) {
        this.cw_invoice_item = cw_invoice_item;
    }

    public String getCw_taxpayer_identity_number() {
        return cw_taxpayer_identity_number;
    }

    public void setCw_taxpayer_identity_number(String cw_taxpayer_identity_number) {
        this.cw_taxpayer_identity_number = cw_taxpayer_identity_number;
    }

    public String getCw_basic_bankofdeposit() {
        return cw_basic_bankofdeposit;
    }

    public void setCw_basic_bankofdeposit(String cw_basic_bankofdeposit) {
        this.cw_basic_bankofdeposit = cw_basic_bankofdeposit;
    }

    public String getCw_registered_address() {
        return cw_registered_address;
    }

    public void setCw_registered_address(String cw_registered_address) {
        this.cw_registered_address = cw_registered_address;
    }

    public String getCw_fixedline_telephone() {
        return cw_fixedline_telephone;
    }

    public void setCw_fixedline_telephone(String cw_fixedline_telephone) {
        this.cw_fixedline_telephone = cw_fixedline_telephone;
    }

    public Blob getRecord_file_id() {
        return record_file_id;
    }

    public void setRecord_file_id(Blob record_file_id) {
        this.record_file_id = record_file_id;
    }

    public Integer getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Integer case_law_id) {
        this.case_law_id = case_law_id;
    }

    public String getCw_application_remark() {
        return cw_application_remark;
    }

    public void setCw_application_remark(String cw_application_remark) {
        this.cw_application_remark = cw_application_remark;
    }

    public String getCw_invoice_remark() {
        return cw_invoice_remark;
    }

    public void setCw_invoice_remark(String cw_invoice_remark) {
        this.cw_invoice_remark = cw_invoice_remark;
    }

    public String getCw_account_number() {
        return cw_account_number;
    }

    public void setCw_account_number(String cw_account_number) {
        this.cw_account_number = cw_account_number;
    }

    @Override
    public String toString() {
        return "Cw_invoice{" +
        "id=" + id +
        ", cw_invoice_title=" + cw_invoice_title +
        ", cw_invoice_money=" + cw_invoice_money +
        ", cw_application_date=" + cw_application_date +
        ", cw_invoice_date=" + cw_invoice_date +
        ", cw_invoice_status=" + cw_invoice_status +
        ", cw_invoice_number=" + cw_invoice_number +
        ", cw_open_type=" + cw_open_type +
        ", cw_invoice_type=" + cw_invoice_type +
        ", cw_invoice_item=" + cw_invoice_item +
        ", cw_taxpayer_identity_number=" + cw_taxpayer_identity_number +
        ", cw_basic_bankofdeposit=" + cw_basic_bankofdeposit +
        ", cw_registered_address=" + cw_registered_address +
        ", cw_fixedline_telephone=" + cw_fixedline_telephone +
        ", record_file_id=" + record_file_id +
        ", case_law_id=" + case_law_id +
        ", cw_application_remark=" + cw_application_remark +
        ", cw_invoice_remark=" + cw_invoice_remark +
        ", cw_account_number=" + cw_account_number +
        "}";
    }
}
