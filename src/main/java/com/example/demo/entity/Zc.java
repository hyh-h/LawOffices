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
public class Zc implements Serializable {

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
     * 侦查案号
     */
    private String zcnh;

    /**
     * 刑拘时间
     */
    private String xjsj;

    /**
     * 逮捕时间
     */
    private String dbsj;

    /**
     * 侦查期限始
     */
    private String zcqxb;

    /**
     * 侦查期限止
     */
    private String zcqxe;

    /**
     * 补充侦查始
     */
    private String bczcb;

    /**
     * 补充侦查止
     */
    private String bczce;

    /**
     * 二次始
     */
    private String ecbcb;

    /**
     * 二次止
     */
    private String ecbce;

    /**
     * 备注
     */
    private String remark;

    /**
     * 提交人
     */
    private String uname;

    /**
     * 提交时间
     */
    private LocalDateTime subtime;


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

    public String getZcnh() {
        return zcnh;
    }

    public void setZcnh(String zcnh) {
        this.zcnh = zcnh;
    }

    public String getXjsj() {
        return xjsj;
    }

    public void setXjsj(String xjsj) {
        this.xjsj = xjsj;
    }

    public String getDbsj() {
        return dbsj;
    }

    public void setDbsj(String dbsj) {
        this.dbsj = dbsj;
    }

    public String getZcqxb() {
        return zcqxb;
    }

    public void setZcqxb(String zcqxb) {
        this.zcqxb = zcqxb;
    }

    public String getZcqxe() {
        return zcqxe;
    }

    public void setZcqxe(String zcqxe) {
        this.zcqxe = zcqxe;
    }

    public String getBczcb() {
        return bczcb;
    }

    public void setBczcb(String bczcb) {
        this.bczcb = bczcb;
    }

    public String getBczce() {
        return bczce;
    }

    public void setBczce(String bczce) {
        this.bczce = bczce;
    }

    public String getEcbcb() {
        return ecbcb;
    }

    public void setEcbcb(String ecbcb) {
        this.ecbcb = ecbcb;
    }

    public String getEcbce() {
        return ecbce;
    }

    public void setEcbce(String ecbce) {
        this.ecbce = ecbce;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public LocalDateTime getSubtime() {
        return subtime;
    }

    public void setSubtime(LocalDateTime subtime) {
        this.subtime = subtime;
    }

    @Override
    public String toString() {
        return "Zc{" +
        "id=" + id +
        ", caseid=" + caseid +
        ", cbr=" + cbr +
        ", tel=" + tel +
        ", bnjg=" + bnjg +
        ", zcnh=" + zcnh +
        ", xjsj=" + xjsj +
        ", dbsj=" + dbsj +
        ", zcqxb=" + zcqxb +
        ", zcqxe=" + zcqxe +
        ", bczcb=" + bczcb +
        ", bczce=" + bczce +
        ", ecbcb=" + ecbcb +
        ", ecbce=" + ecbce +
        ", remark=" + remark +
        ", uname=" + uname +
        ", subtime=" + subtime +
        "}";
    }
}
