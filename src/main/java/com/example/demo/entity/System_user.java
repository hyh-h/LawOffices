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
public class System_user implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String user_name;

    private String user_pwd;

    private String user_realname;

    private String user_phone;

    private String user_email;

    private LocalDateTime user_createdate;

    private LocalDateTime user_pre_date;

    private Long user_login_num;

    private Long hr_emp_id;

    private String user_status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_realname() {
        return user_realname;
    }

    public void setUser_realname(String user_realname) {
        this.user_realname = user_realname;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public LocalDateTime getUser_createdate() {
        return user_createdate;
    }

    public void setUser_createdate(LocalDateTime user_createdate) {
        this.user_createdate = user_createdate;
    }

    public LocalDateTime getUser_pre_date() {
        return user_pre_date;
    }

    public void setUser_pre_date(LocalDateTime user_pre_date) {
        this.user_pre_date = user_pre_date;
    }

    public Long getUser_login_num() {
        return user_login_num;
    }

    public void setUser_login_num(Long user_login_num) {
        this.user_login_num = user_login_num;
    }

    public Long getHr_emp_id() {
        return hr_emp_id;
    }

    public void setHr_emp_id(Long hr_emp_id) {
        this.hr_emp_id = hr_emp_id;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    @Override
    public String toString() {
        return "System_user{" +
        "id=" + id +
        ", user_name=" + user_name +
        ", user_pwd=" + user_pwd +
        ", user_realname=" + user_realname +
        ", user_phone=" + user_phone +
        ", user_email=" + user_email +
        ", user_createdate=" + user_createdate +
        ", user_pre_date=" + user_pre_date +
        ", user_login_num=" + user_login_num +
        ", hr_emp_id=" + hr_emp_id +
        ", user_status=" + user_status +
        "}";
    }
}
