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
public class System_approval implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String approval_deal;

    private String approval_advice;

    private LocalDateTime approval_date;

    private Integer approval_num;

    private String approval_type;

    private Integer system_role_id;

    private Long approval_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApproval_deal() {
        return approval_deal;
    }

    public void setApproval_deal(String approval_deal) {
        this.approval_deal = approval_deal;
    }

    public String getApproval_advice() {
        return approval_advice;
    }

    public void setApproval_advice(String approval_advice) {
        this.approval_advice = approval_advice;
    }

    public LocalDateTime getApproval_date() {
        return approval_date;
    }

    public void setApproval_date(LocalDateTime approval_date) {
        this.approval_date = approval_date;
    }

    public Integer getApproval_num() {
        return approval_num;
    }

    public void setApproval_num(Integer approval_num) {
        this.approval_num = approval_num;
    }

    public String getApproval_type() {
        return approval_type;
    }

    public void setApproval_type(String approval_type) {
        this.approval_type = approval_type;
    }

    public Integer getSystem_role_id() {
        return system_role_id;
    }

    public void setSystem_role_id(Integer system_role_id) {
        this.system_role_id = system_role_id;
    }

    public Long getApproval_id() {
        return approval_id;
    }

    public void setApproval_id(Long approval_id) {
        this.approval_id = approval_id;
    }

    @Override
    public String toString() {
        return "System_approval{" +
        "id=" + id +
        ", approval_deal=" + approval_deal +
        ", approval_advice=" + approval_advice +
        ", approval_date=" + approval_date +
        ", approval_num=" + approval_num +
        ", approval_type=" + approval_type +
        ", system_role_id=" + system_role_id +
        ", approval_id=" + approval_id +
        "}";
    }
}
