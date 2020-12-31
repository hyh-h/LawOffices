package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
public class Case_law implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 案号
     */
    private String case_no;

    /**
     * 对方当事人
     */
    private String case_opposite_parties;

    /**
     * 对方当事人证件号
     */
    private String case_opposite_cardnum;

    /**
     * 第三方
     */
    private String case_third_party;

    /**
     * 嫌疑人
     */
    private String case_suspect;

    /**
     * 案件冲突
     */
    private String case_clash;

    /**
     * 案由
     */
    private String case_cause;

    /**
     * 受理机关
     */
    private String case_accept;

    /**
     * 诉讼标的
     */
    private BigDecimal case_lawsuitobj;

    /**
     * 补助Y/N
     */
    private String case_subsidy;

    /**
     * 补助金额
     */
    private BigDecimal case_subsidysal;

    /**
     * 结案情况Y?N
     */
    private String case_settle_status;

    /**
     * 案件进度A待/B在办/C结案
     */
    private String case_plan;

    /**
     * 收案审批状态:1:审批中2:审批通过3:审批不通过
     */
    private String case_approve_status;

    /**
     * 代理费
     */
    private BigDecimal case_agencyfee;

    /**
     * 杂费
     */
    private BigDecimal case_proxysal;

    /**
     * 办理地区
     */
    private String case_transaction_region;

    /**
     * 是否指派Y?N
     */
    private String case_assign;

    /**
     * 已付金额
     */
    private BigDecimal case_paidsal;

    /**
     * 未付金额
     */
    private BigDecimal case_unpaidsal;

    /**
     * 已开票金额
     */
    private BigDecimal case_invoiced;

    /**
     * 未开票金额
     */
    private BigDecimal case_notinvoiced;

    /**
     * 专属案号
     */
    private String case_propernum;

    /**
     * 受理法院
     */
    private String case_court;

    /**
     * 档案号
     */
    private String case_filenumber;

    /**
     * 相关文件
     */
    private Blob case_correlation_file;

    /**
     * 提交人
     */
    private String case_submitter;

    /**
     * 提交时间
     */
    private LocalDateTime case_subtime;

    /**
     * 案件回收
     */
    private String case_recycle;

    /**
     * 备注
     */
    private String case_remarks;

    /**
     * 客户id 外键
     */
    private Integer client_id;

    /**
     * 承办律师
     */
    private String case_attorney;

    /**
     * 诉讼阶段
     */
    private String case_status;

    /**
     * 诉讼地位
     */
    private String case_lawsuit_status;

    /**
     * 收费方式
     */
    private String case_charge_way;

    /**
     * 收案审批人
     */
    private String system_approval_id;

    /**
     * 案件类型id 外键
     */
    private String case_case_type_id;

    /**
     * 案件文书id 外键
     */
    private Integer case_seal_applyfor_id;

    /**
     * 主办律师id 外键
     */
    private Integer hr_emp_id;

    /**
     * 收案时间
     */
    private LocalDate collection_time;

    /**
     * 委托人
     */
    private String case_parties;

    /**
     * 风险费
     */
    private BigDecimal case_fxmoney;

    /**
     * 委托人
     */
    private String case_wtr;

    /**
     * 合同状态1,2
     */
    private String case_contract;

    /**
     * 归档状态1,2
     */
    private String case_record;

    /**
     * 是否分享1,2
     */
    private String case_share;

    /**
     * 结案方式(0=默认，1=调解，2=判决，3=撤诉，4=其他方式)
     */
    private String case_settle_type;

    /**
     * 结案审批时间
     */
    private LocalDateTime case_approval_endtime;

    /**
     * 归档号
     */
    private String case_record_num;

    /**
     * 服务人次
     */
    private Integer standard;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCase_no() {
        return case_no;
    }

    public void setCase_no(String case_no) {
        this.case_no = case_no;
    }

    public String getCase_opposite_parties() {
        return case_opposite_parties;
    }

    public void setCase_opposite_parties(String case_opposite_parties) {
        this.case_opposite_parties = case_opposite_parties;
    }

    public String getCase_opposite_cardnum() {
        return case_opposite_cardnum;
    }

    public void setCase_opposite_cardnum(String case_opposite_cardnum) {
        this.case_opposite_cardnum = case_opposite_cardnum;
    }

    public String getCase_third_party() {
        return case_third_party;
    }

    public void setCase_third_party(String case_third_party) {
        this.case_third_party = case_third_party;
    }

    public String getCase_suspect() {
        return case_suspect;
    }

    public void setCase_suspect(String case_suspect) {
        this.case_suspect = case_suspect;
    }

    public String getCase_clash() {
        return case_clash;
    }

    public void setCase_clash(String case_clash) {
        this.case_clash = case_clash;
    }

    public String getCase_cause() {
        return case_cause;
    }

    public void setCase_cause(String case_cause) {
        this.case_cause = case_cause;
    }

    public String getCase_accept() {
        return case_accept;
    }

    public void setCase_accept(String case_accept) {
        this.case_accept = case_accept;
    }

    public BigDecimal getCase_lawsuitobj() {
        return case_lawsuitobj;
    }

    public void setCase_lawsuitobj(BigDecimal case_lawsuitobj) {
        this.case_lawsuitobj = case_lawsuitobj;
    }

    public String getCase_subsidy() {
        return case_subsidy;
    }

    public void setCase_subsidy(String case_subsidy) {
        this.case_subsidy = case_subsidy;
    }

    public BigDecimal getCase_subsidysal() {
        return case_subsidysal;
    }

    public void setCase_subsidysal(BigDecimal case_subsidysal) {
        this.case_subsidysal = case_subsidysal;
    }

    public String getCase_settle_status() {
        return case_settle_status;
    }

    public void setCase_settle_status(String case_settle_status) {
        this.case_settle_status = case_settle_status;
    }

    public String getCase_plan() {
        return case_plan;
    }

    public void setCase_plan(String case_plan) {
        this.case_plan = case_plan;
    }

    public String getCase_approve_status() {
        return case_approve_status;
    }

    public void setCase_approve_status(String case_approve_status) {
        this.case_approve_status = case_approve_status;
    }

    public BigDecimal getCase_agencyfee() {
        return case_agencyfee;
    }

    public void setCase_agencyfee(BigDecimal case_agencyfee) {
        this.case_agencyfee = case_agencyfee;
    }

    public BigDecimal getCase_proxysal() {
        return case_proxysal;
    }

    public void setCase_proxysal(BigDecimal case_proxysal) {
        this.case_proxysal = case_proxysal;
    }

    public String getCase_transaction_region() {
        return case_transaction_region;
    }

    public void setCase_transaction_region(String case_transaction_region) {
        this.case_transaction_region = case_transaction_region;
    }

    public String getCase_assign() {
        return case_assign;
    }

    public void setCase_assign(String case_assign) {
        this.case_assign = case_assign;
    }

    public BigDecimal getCase_paidsal() {
        return case_paidsal;
    }

    public void setCase_paidsal(BigDecimal case_paidsal) {
        this.case_paidsal = case_paidsal;
    }

    public BigDecimal getCase_unpaidsal() {
        return case_unpaidsal;
    }

    public void setCase_unpaidsal(BigDecimal case_unpaidsal) {
        this.case_unpaidsal = case_unpaidsal;
    }

    public BigDecimal getCase_invoiced() {
        return case_invoiced;
    }

    public void setCase_invoiced(BigDecimal case_invoiced) {
        this.case_invoiced = case_invoiced;
    }

    public BigDecimal getCase_notinvoiced() {
        return case_notinvoiced;
    }

    public void setCase_notinvoiced(BigDecimal case_notinvoiced) {
        this.case_notinvoiced = case_notinvoiced;
    }

    public String getCase_propernum() {
        return case_propernum;
    }

    public void setCase_propernum(String case_propernum) {
        this.case_propernum = case_propernum;
    }

    public String getCase_court() {
        return case_court;
    }

    public void setCase_court(String case_court) {
        this.case_court = case_court;
    }

    public String getCase_filenumber() {
        return case_filenumber;
    }

    public void setCase_filenumber(String case_filenumber) {
        this.case_filenumber = case_filenumber;
    }

    public Blob getCase_correlation_file() {
        return case_correlation_file;
    }

    public void setCase_correlation_file(Blob case_correlation_file) {
        this.case_correlation_file = case_correlation_file;
    }

    public String getCase_submitter() {
        return case_submitter;
    }

    public void setCase_submitter(String case_submitter) {
        this.case_submitter = case_submitter;
    }

    public LocalDateTime getCase_subtime() {
        return case_subtime;
    }

    public void setCase_subtime(LocalDateTime case_subtime) {
        this.case_subtime = case_subtime;
    }

    public String getCase_recycle() {
        return case_recycle;
    }

    public void setCase_recycle(String case_recycle) {
        this.case_recycle = case_recycle;
    }

    public String getCase_remarks() {
        return case_remarks;
    }

    public void setCase_remarks(String case_remarks) {
        this.case_remarks = case_remarks;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public String getCase_attorney() {
        return case_attorney;
    }

    public void setCase_attorney(String case_attorney) {
        this.case_attorney = case_attorney;
    }

    public String getCase_status() {
        return case_status;
    }

    public void setCase_status(String case_status) {
        this.case_status = case_status;
    }

    public String getCase_lawsuit_status() {
        return case_lawsuit_status;
    }

    public void setCase_lawsuit_status(String case_lawsuit_status) {
        this.case_lawsuit_status = case_lawsuit_status;
    }

    public String getCase_charge_way() {
        return case_charge_way;
    }

    public void setCase_charge_way(String case_charge_way) {
        this.case_charge_way = case_charge_way;
    }

    public String getSystem_approval_id() {
        return system_approval_id;
    }

    public void setSystem_approval_id(String system_approval_id) {
        this.system_approval_id = system_approval_id;
    }

    public String getCase_case_type_id() {
        return case_case_type_id;
    }

    public void setCase_case_type_id(String case_case_type_id) {
        this.case_case_type_id = case_case_type_id;
    }

    public Integer getCase_seal_applyfor_id() {
        return case_seal_applyfor_id;
    }

    public void setCase_seal_applyfor_id(Integer case_seal_applyfor_id) {
        this.case_seal_applyfor_id = case_seal_applyfor_id;
    }

    public Integer getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Integer hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    public LocalDate getCollection_time() {
        return collection_time;
    }

    public void setCollection_time(LocalDate collection_time) {
        this.collection_time = collection_time;
    }

    public String getCase_parties() {
        return case_parties;
    }

    public void setCase_parties(String case_parties) {
        this.case_parties = case_parties;
    }

    public BigDecimal getCase_fxmoney() {
        return case_fxmoney;
    }

    public void setCase_fxmoney(BigDecimal case_fxmoney) {
        this.case_fxmoney = case_fxmoney;
    }

    public String getCase_wtr() {
        return case_wtr;
    }

    public void setCase_wtr(String case_wtr) {
        this.case_wtr = case_wtr;
    }

    public String getCase_contract() {
        return case_contract;
    }

    public void setCase_contract(String case_contract) {
        this.case_contract = case_contract;
    }

    public String getCase_record() {
        return case_record;
    }

    public void setCase_record(String case_record) {
        this.case_record = case_record;
    }

    public String getCase_share() {
        return case_share;
    }

    public void setCase_share(String case_share) {
        this.case_share = case_share;
    }

    public String getCase_settle_type() {
        return case_settle_type;
    }

    public void setCase_settle_type(String case_settle_type) {
        this.case_settle_type = case_settle_type;
    }

    public LocalDateTime getCase_approval_endtime() {
        return case_approval_endtime;
    }

    public void setCase_approval_endtime(LocalDateTime case_approval_endtime) {
        this.case_approval_endtime = case_approval_endtime;
    }

    public String getCase_record_num() {
        return case_record_num;
    }

    public void setCase_record_num(String case_record_num) {
        this.case_record_num = case_record_num;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "Case_law{" +
        "id=" + id +
        ", case_no=" + case_no +
        ", case_opposite_parties=" + case_opposite_parties +
        ", case_opposite_cardnum=" + case_opposite_cardnum +
        ", case_third_party=" + case_third_party +
        ", case_suspect=" + case_suspect +
        ", case_clash=" + case_clash +
        ", case_cause=" + case_cause +
        ", case_accept=" + case_accept +
        ", case_lawsuitobj=" + case_lawsuitobj +
        ", case_subsidy=" + case_subsidy +
        ", case_subsidysal=" + case_subsidysal +
        ", case_settle_status=" + case_settle_status +
        ", case_plan=" + case_plan +
        ", case_approve_status=" + case_approve_status +
        ", case_agencyfee=" + case_agencyfee +
        ", case_proxysal=" + case_proxysal +
        ", case_transaction_region=" + case_transaction_region +
        ", case_assign=" + case_assign +
        ", case_paidsal=" + case_paidsal +
        ", case_unpaidsal=" + case_unpaidsal +
        ", case_invoiced=" + case_invoiced +
        ", case_notinvoiced=" + case_notinvoiced +
        ", case_propernum=" + case_propernum +
        ", case_court=" + case_court +
        ", case_filenumber=" + case_filenumber +
        ", case_correlation_file=" + case_correlation_file +
        ", case_submitter=" + case_submitter +
        ", case_subtime=" + case_subtime +
        ", case_recycle=" + case_recycle +
        ", case_remarks=" + case_remarks +
        ", client_id=" + client_id +
        ", case_attorney=" + case_attorney +
        ", case_status=" + case_status +
        ", case_lawsuit_status=" + case_lawsuit_status +
        ", case_charge_way=" + case_charge_way +
        ", system_approval_id=" + system_approval_id +
        ", case_case_type_id=" + case_case_type_id +
        ", case_seal_applyfor_id=" + case_seal_applyfor_id +
        ", hr_emp_id=" + hr_emp_id +
        ", collection_time=" + collection_time +
        ", case_parties=" + case_parties +
        ", case_fxmoney=" + case_fxmoney +
        ", case_wtr=" + case_wtr +
        ", case_contract=" + case_contract +
        ", case_record=" + case_record +
        ", case_share=" + case_share +
        ", case_settle_type=" + case_settle_type +
        ", case_approval_endtime=" + case_approval_endtime +
        ", case_record_num=" + case_record_num +
        ", standard=" + standard +
        "}";
    }
}
