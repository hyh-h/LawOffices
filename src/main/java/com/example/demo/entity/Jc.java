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
public class Jc implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer caseid;

    /**
     * 承办人
     */
    private String cbr;

    /**
     * 电话
     */
    private String tel;

    /**
     * 办案机关
     */
    private String bnjg;

    /**
     * 起诉时间始
     */
    private String qssjb;

    /**
     * 起诉时间止
     */
    private String qssje;

    /**
     * 备注
     */
    private String remark;

    /**
     * 提交时间
     */
    private LocalDateTime subtime;

    /**
     * 提交人
     */
    private String uname;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getCbr() {
        return cbr;
    }

    public void setCbr(String cbr) {
        this.cbr = cbr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getBnjg() {
        return bnjg;
    }

    public void setBnjg(String bnjg) {
        this.bnjg = bnjg;
    }

    public String getQssjb() {
        return qssjb;
    }

    public void setQssjb(String qssjb) {
        this.qssjb = qssjb;
    }

    public String getQssje() {
        return qssje;
    }

    public void setQssje(String qssje) {
        this.qssje = qssje;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getSubtime() {
        return subtime;
    }

    public void setSubtime(LocalDateTime subtime) {
        this.subtime = subtime;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "Jc{" +
        "id=" + id +
        ", caseid=" + caseid +
        ", cbr=" + cbr +
        ", tel=" + tel +
        ", bnjg=" + bnjg +
        ", qssjb=" + qssjb +
        ", qssje=" + qssje +
        ", remark=" + remark +
        ", subtime=" + subtime +
        ", uname=" + uname +
        "}";
    }
}
