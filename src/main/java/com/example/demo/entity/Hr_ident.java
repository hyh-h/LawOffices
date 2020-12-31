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
public class Hr_ident implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long lawyer_identity_id;

    private Long hr_emp_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLawyer_identity_id() {
        return lawyer_identity_id;
    }

    public void setLawyer_identity_id(Long lawyer_identity_id) {
        this.lawyer_identity_id = lawyer_identity_id;
    }

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    @Override
    public String toString() {
        return "Hr_ident{" +
        "id=" + id +
        ", lawyer_identity_id=" + lawyer_identity_id +
        ", hr_emp_id=" + hr_emp_id +
        "}";
    }
}
