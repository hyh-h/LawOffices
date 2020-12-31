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
public class Case_pk_user_client implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer case_law_id;

    private Integer system_user_id;

    private Integer client_id;

    private String user_client_seal_matter;

    private LocalDate user_client_receive_time;

    private String user_client_approval_status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Integer case_law_id) {
        this.case_law_id = case_law_id;
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

    public String getUser_client_seal_matter() {
        return user_client_seal_matter;
    }

    public void setUser_client_seal_matter(String user_client_seal_matter) {
        this.user_client_seal_matter = user_client_seal_matter;
    }

    public LocalDate getUser_client_receive_time() {
        return user_client_receive_time;
    }

    public void setUser_client_receive_time(LocalDate user_client_receive_time) {
        this.user_client_receive_time = user_client_receive_time;
    }

    public String getUser_client_approval_status() {
        return user_client_approval_status;
    }

    public void setUser_client_approval_status(String user_client_approval_status) {
        this.user_client_approval_status = user_client_approval_status;
    }

    @Override
    public String toString() {
        return "Case_pk_user_client{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", system_user_id=" + system_user_id +
        ", client_id=" + client_id +
        ", user_client_seal_matter=" + user_client_seal_matter +
        ", user_client_receive_time=" + user_client_receive_time +
        ", user_client_approval_status=" + user_client_approval_status +
        "}";
    }
}
