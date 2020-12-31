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
public class Adm_complain implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 投诉内容
     */
    private String complain_content;

    /**
     * 案件id 外键
     */
    private Integer law_case_id;

    /**
     * 客户id 外键
     */
    private Integer client_id;

    /**
     * 提交日期
     */
    private LocalDate complain_submit_time;

    /**
     * 回复数
     */
    private Integer complain_reply_number;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplain_content() {
        return complain_content;
    }

    public void setComplain_content(String complain_content) {
        this.complain_content = complain_content;
    }

    public Integer getLaw_case_id() {
        return law_case_id;
    }

    public void setLaw_case_id(Integer law_case_id) {
        this.law_case_id = law_case_id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public LocalDate getComplain_submit_time() {
        return complain_submit_time;
    }

    public void setComplain_submit_time(LocalDate complain_submit_time) {
        this.complain_submit_time = complain_submit_time;
    }

    public Integer getComplain_reply_number() {
        return complain_reply_number;
    }

    public void setComplain_reply_number(Integer complain_reply_number) {
        this.complain_reply_number = complain_reply_number;
    }

    @Override
    public String toString() {
        return "Adm_complain{" +
        "id=" + id +
        ", complain_content=" + complain_content +
        ", law_case_id=" + law_case_id +
        ", client_id=" + client_id +
        ", complain_submit_time=" + complain_submit_time +
        ", complain_reply_number=" + complain_reply_number +
        "}";
    }
}
