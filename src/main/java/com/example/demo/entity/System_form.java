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
public class System_form implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String form_name;

    private LocalDateTime form_startdate;

    private LocalDateTime form_enddate;

    private Float form_day_num;

    private Long formtype_id;

    private Long approva_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForm_name() {
        return form_name;
    }

    public void setForm_name(String form_name) {
        this.form_name = form_name;
    }

    public LocalDateTime getForm_startdate() {
        return form_startdate;
    }

    public void setForm_startdate(LocalDateTime form_startdate) {
        this.form_startdate = form_startdate;
    }

    public LocalDateTime getForm_enddate() {
        return form_enddate;
    }

    public void setForm_enddate(LocalDateTime form_enddate) {
        this.form_enddate = form_enddate;
    }

    public Float getForm_day_num() {
        return form_day_num;
    }

    public void setForm_day_num(Float form_day_num) {
        this.form_day_num = form_day_num;
    }

    public Long getFormtype_id() {
        return formtype_id;
    }

    public void setFormtype_id(Long formtype_id) {
        this.formtype_id = formtype_id;
    }

    public Long getApprova_id() {
        return approva_id;
    }

    public void setApprova_id(Long approva_id) {
        this.approva_id = approva_id;
    }

    @Override
    public String toString() {
        return "System_form{" +
        "id=" + id +
        ", form_name=" + form_name +
        ", form_startdate=" + form_startdate +
        ", form_enddate=" + form_enddate +
        ", form_day_num=" + form_day_num +
        ", formtype_id=" + formtype_id +
        ", approva_id=" + approva_id +
        "}";
    }
}
