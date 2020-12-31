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
public class Adm_signinrecor implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id 外键
     */
    private Integer system_user_id;

    /**
     * 签到类型
     */
    private Integer classify;

    /**
     * 签到日期
     */
    private LocalDateTime signinrecord_sign;

    /**
     * 签到地点
     */
    private String signinrecord_site;

    /**
     * 签到类型 D 签到 T 签退
     */
    private String signin_status;


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

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public LocalDateTime getSigninrecord_sign() {
        return signinrecord_sign;
    }

    public void setSigninrecord_sign(LocalDateTime signinrecord_sign) {
        this.signinrecord_sign = signinrecord_sign;
    }

    public String getSigninrecord_site() {
        return signinrecord_site;
    }

    public void setSigninrecord_site(String signinrecord_site) {
        this.signinrecord_site = signinrecord_site;
    }

    public String getSignin_status() {
        return signin_status;
    }

    public void setSignin_status(String signin_status) {
        this.signin_status = signin_status;
    }

    @Override
    public String toString() {
        return "Adm_signinrecor{" +
        "id=" + id +
        ", system_user_id=" + system_user_id +
        ", classify=" + classify +
        ", signinrecord_sign=" + signinrecord_sign +
        ", signinrecord_site=" + signinrecord_site +
        ", signin_status=" + signin_status +
        "}";
    }
}
