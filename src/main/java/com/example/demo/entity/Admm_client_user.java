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
public class Admm_client_user implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer system_user_id;

    private Integer client_id;

    private Integer client_user_cell_phone_number;

    private String client_user_content;

    private Integer client_user_number_ufwords;

    private String client_user_state;

    private LocalDate client_user_senddate;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSystem_user_id() {
        return system_user_id;
    }

    public void setSystem_user_id(Integer system_user_id) {
        this.system_user_id = system_user_id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getClient_user_cell_phone_number() {
        return client_user_cell_phone_number;
    }

    public void setClient_user_cell_phone_number(Integer client_user_cell_phone_number) {
        this.client_user_cell_phone_number = client_user_cell_phone_number;
    }

    public String getClient_user_content() {
        return client_user_content;
    }

    public void setClient_user_content(String client_user_content) {
        this.client_user_content = client_user_content;
    }

    public Integer getClient_user_number_ufwords() {
        return client_user_number_ufwords;
    }

    public void setClient_user_number_ufwords(Integer client_user_number_ufwords) {
        this.client_user_number_ufwords = client_user_number_ufwords;
    }

    public String getClient_user_state() {
        return client_user_state;
    }

    public void setClient_user_state(String client_user_state) {
        this.client_user_state = client_user_state;
    }

    public LocalDate getClient_user_senddate() {
        return client_user_senddate;
    }

    public void setClient_user_senddate(LocalDate client_user_senddate) {
        this.client_user_senddate = client_user_senddate;
    }

    @Override
    public String toString() {
        return "Admm_client_user{" +
        "id=" + id +
        ", system_user_id=" + system_user_id +
        ", client_id=" + client_id +
        ", client_user_cell_phone_number=" + client_user_cell_phone_number +
        ", client_user_content=" + client_user_content +
        ", client_user_number_ufwords=" + client_user_number_ufwords +
        ", client_user_state=" + client_user_state +
        ", client_user_senddate=" + client_user_senddate +
        "}";
    }
}
