package com.example.demo.entity;

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
public class System_formtype implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String formtype;

    private Long approval_flow_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFormtype() {
        return formtype;
    }

    public void setFormtype(String formtype) {
        this.formtype = formtype;
    }

    public Long getApproval_flow_id() {
        return approval_flow_id;
    }

    public void setApproval_flow_id(Long approval_flow_id) {
        this.approval_flow_id = approval_flow_id;
    }

    @Override
    public String toString() {
        return "System_formtype{" +
        "id=" + id +
        ", formtype=" + formtype +
        ", approval_flow_id=" + approval_flow_id +
        "}";
    }
}
