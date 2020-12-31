package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Case_seal_applyfor implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String case_no;

    /**
     * 申请领用日期
     */
    private LocalDateTime applyfor_receive;

    /**
     * 审批状态 1,2,3
     */
    private String applyfor_approval_status;

    /**
     * 申请人
     */
    private String applyfor_recipient;

    /**
     * 收函方
     */
    private String send_person;

    /**
     * 用印事项
     */
    private String applyfor_using_the_item;

    /**
     * 案件id
     */
    private Integer caseid;

    private String remark;

    private Integer typeid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCase_no() {
        return case_no;
    }

    public void setCase_no(String case_no) {
        this.case_no = case_no;
    }

    public LocalDateTime getApplyfor_receive() {
        return applyfor_receive;
    }

    public void setApplyfor_receive(LocalDateTime applyfor_receive) {
        this.applyfor_receive = applyfor_receive;
    }

    public String getApplyfor_approval_status() {
        return applyfor_approval_status;
    }

    public void setApplyfor_approval_status(String applyfor_approval_status) {
        this.applyfor_approval_status = applyfor_approval_status;
    }

    public String getApplyfor_recipient() {
        return applyfor_recipient;
    }

    public void setApplyfor_recipient(String applyfor_recipient) {
        this.applyfor_recipient = applyfor_recipient;
    }

    public String getSend_person() {
        return send_person;
    }

    public void setSend_person(String send_person) {
        this.send_person = send_person;
    }

    public String getApplyfor_using_the_item() {
        return applyfor_using_the_item;
    }

    public void setApplyfor_using_the_item(String applyfor_using_the_item) {
        this.applyfor_using_the_item = applyfor_using_the_item;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    @Override
    public String toString() {
        return "Case_seal_applyfor{" +
        "id=" + id +
        ", case_no=" + case_no +
        ", applyfor_receive=" + applyfor_receive +
        ", applyfor_approval_status=" + applyfor_approval_status +
        ", applyfor_recipient=" + applyfor_recipient +
        ", send_person=" + send_person +
        ", applyfor_using_the_item=" + applyfor_using_the_item +
        ", caseid=" + caseid +
        ", remark=" + remark +
        ", typeid=" + typeid +
        "}";
    }
}
