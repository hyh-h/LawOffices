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
public class Hr_emp_insured implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long hr_emp_id;

    private Long hr_insured_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    public Long getHr_insured_id() {
        return hr_insured_id;
    }

    public void setHr_insured_id(Long hr_insured_id) {
        this.hr_insured_id = hr_insured_id;
    }

    @Override
    public String toString() {
        return "Hr_emp_insured{" +
        "id=" + id +
        ", hr_emp_id=" + hr_emp_id +
        ", hr_insured_id=" + hr_insured_id +
        "}";
    }
}
