package com.example.demo.entity;

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
public class Hr_lawyer_identity implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String identity_name;

    private String identity_tutor;

    private String identity_type;

    private LocalDate identity_startdate;

    private LocalDate identity_enddate;

    private String identity_num;

    private Long hr_emp_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentity_name() {
        return identity_name;
    }

    public void setIdentity_name(String identity_name) {
        this.identity_name = identity_name;
    }

    public String getIdentity_tutor() {
        return identity_tutor;
    }

    public void setIdentity_tutor(String identity_tutor) {
        this.identity_tutor = identity_tutor;
    }

    public String getIdentity_type() {
        return identity_type;
    }

    public void setIdentity_type(String identity_type) {
        this.identity_type = identity_type;
    }

    public LocalDate getIdentity_startdate() {
        return identity_startdate;
    }

    public void setIdentity_startdate(LocalDate identity_startdate) {
        this.identity_startdate = identity_startdate;
    }

    public LocalDate getIdentity_enddate() {
        return identity_enddate;
    }

    public void setIdentity_enddate(LocalDate identity_enddate) {
        this.identity_enddate = identity_enddate;
    }

    public String getIdentity_num() {
        return identity_num;
    }

    public void setIdentity_num(String identity_num) {
        this.identity_num = identity_num;
    }

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    @Override
    public String toString() {
        return "Hr_lawyer_identity{" +
        "id=" + id +
        ", identity_name=" + identity_name +
        ", identity_tutor=" + identity_tutor +
        ", identity_type=" + identity_type +
        ", identity_startdate=" + identity_startdate +
        ", identity_enddate=" + identity_enddate +
        ", identity_num=" + identity_num +
        ", hr_emp_id=" + hr_emp_id +
        "}";
    }
}
