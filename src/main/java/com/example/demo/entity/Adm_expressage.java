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
public class Adm_expressage implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 发件人
     */
    private String system_user_addresser;

    /**
     * 收件人
     */
    private String system_user_recipients;

    /**
     * 收件单位
     */
    private String expressage_sendaunit;

    /**
     * 发件日期
     */
    private LocalDate expressage_sendadate;

    /**
     * 收件日期
     */
    private LocalDate expressage_dateofreceipt;

    /**
     * 领件时间
     */
    private LocalDate expressage_bring_date;

    /**
     * 快递方式
     */
    private Integer expressage_send_waay_id;

    /**
     * 快件类型
     */
    private Integer expressage_express_type_id;

    /**
     * 快递单号
     */
    private Integer expressage_courier_number;

    /**
     * 文件
     */
    private String expressage_file;

    /**
     * 领件说明
     */
    private String expressage_collarnote;

    /**
     * 备注说明
     */
    private String expressage_remark;

    /**
     * 领件状态 2 已领取 1 未领取
     */
    private Integer takestatus;

    /**
     * 快递费
     */
    private BigDecimal express_fee;

    /**
     * 领件人
     */
    private String collar_person;

    /**
     * 联系电话
     */
    private String expressage_tel;

    /**
     * 快递信息类型 S 收件 F 发件
     */
    private String expressage_type;

    /**
     * 案件id 外键
     */
    private String case_no;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystem_user_addresser() {
        return system_user_addresser;
    }

    public void setSystem_user_addresser(String system_user_addresser) {
        this.system_user_addresser = system_user_addresser;
    }

    public String getSystem_user_recipients() {
        return system_user_recipients;
    }

    public void setSystem_user_recipients(String system_user_recipients) {
        this.system_user_recipients = system_user_recipients;
    }

    public String getExpressage_sendaunit() {
        return expressage_sendaunit;
    }

    public void setExpressage_sendaunit(String expressage_sendaunit) {
        this.expressage_sendaunit = expressage_sendaunit;
    }

    public LocalDate getExpressage_sendadate() {
        return expressage_sendadate;
    }

    public void setExpressage_sendadate(LocalDate expressage_sendadate) {
        this.expressage_sendadate = expressage_sendadate;
    }

    public LocalDate getExpressage_dateofreceipt() {
        return expressage_dateofreceipt;
    }

    public void setExpressage_dateofreceipt(LocalDate expressage_dateofreceipt) {
        this.expressage_dateofreceipt = expressage_dateofreceipt;
    }

    public LocalDate getExpressage_bring_date() {
        return expressage_bring_date;
    }

    public void setExpressage_bring_date(LocalDate expressage_bring_date) {
        this.expressage_bring_date = expressage_bring_date;
    }

    public Integer getExpressage_send_waay_id() {
        return expressage_send_waay_id;
    }

    public void setExpressage_send_waay_id(Integer expressage_send_waay_id) {
        this.expressage_send_waay_id = expressage_send_waay_id;
    }

    public Integer getExpressage_express_type_id() {
        return expressage_express_type_id;
    }

    public void setExpressage_express_type_id(Integer expressage_express_type_id) {
        this.expressage_express_type_id = expressage_express_type_id;
    }

    public Integer getExpressage_courier_number() {
        return expressage_courier_number;
    }

    public void setExpressage_courier_number(Integer expressage_courier_number) {
        this.expressage_courier_number = expressage_courier_number;
    }

    public String getExpressage_file() {
        return expressage_file;
    }

    public void setExpressage_file(String expressage_file) {
        this.expressage_file = expressage_file;
    }

    public String getExpressage_collarnote() {
        return expressage_collarnote;
    }

    public void setExpressage_collarnote(String expressage_collarnote) {
        this.expressage_collarnote = expressage_collarnote;
    }

    public String getExpressage_remark() {
        return expressage_remark;
    }

    public void setExpressage_remark(String expressage_remark) {
        this.expressage_remark = expressage_remark;
    }

    public Integer getTakestatus() {
        return takestatus;
    }

    public void setTakestatus(Integer takestatus) {
        this.takestatus = takestatus;
    }

    public BigDecimal getExpress_fee() {
        return express_fee;
    }

    public void setExpress_fee(BigDecimal express_fee) {
        this.express_fee = express_fee;
    }

    public String getCollar_person() {
        return collar_person;
    }

    public void setCollar_person(String collar_person) {
        this.collar_person = collar_person;
    }

    public String getExpressage_tel() {
        return expressage_tel;
    }

    public void setExpressage_tel(String expressage_tel) {
        this.expressage_tel = expressage_tel;
    }

    public String getExpressage_type() {
        return expressage_type;
    }

    public void setExpressage_type(String expressage_type) {
        this.expressage_type = expressage_type;
    }

    public String getCase_no() {
        return case_no;
    }

    public void setCase_no(String case_no) {
        this.case_no = case_no;
    }

    @Override
    public String toString() {
        return "Adm_expressage{" +
        "id=" + id +
        ", system_user_addresser=" + system_user_addresser +
        ", system_user_recipients=" + system_user_recipients +
        ", expressage_sendaunit=" + expressage_sendaunit +
        ", expressage_sendadate=" + expressage_sendadate +
        ", expressage_dateofreceipt=" + expressage_dateofreceipt +
        ", expressage_bring_date=" + expressage_bring_date +
        ", expressage_send_waay_id=" + expressage_send_waay_id +
        ", expressage_express_type_id=" + expressage_express_type_id +
        ", expressage_courier_number=" + expressage_courier_number +
        ", expressage_file=" + expressage_file +
        ", expressage_collarnote=" + expressage_collarnote +
        ", expressage_remark=" + expressage_remark +
        ", takestatus=" + takestatus +
        ", express_fee=" + express_fee +
        ", collar_person=" + collar_person +
        ", expressage_tel=" + expressage_tel +
        ", expressage_type=" + expressage_type +
        ", case_no=" + case_no +
        "}";
    }
}
