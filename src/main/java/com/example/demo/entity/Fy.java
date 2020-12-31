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
public class Fy implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer caseid;

    /**
     * 审判程序
     */
    private String flow;

    /**
     * 审判机关
     */
    private String spjg;

    /**
     * 立案时间
     */
    private String lnsj;

    /**
     * 开庭时间
     */
    private String ktsj;

    /**
     * 宣判日期
     */
    private String xprq;

    /**
     * 上诉日期
     */
    private String ssrq;

    /**
     * 法庭
     */
    private String ft;

    /**
     * 法官
     */
    private String fg;

    /**
     * 书记员
     */
    private String sjy;

    /**
     * 备注
     */
    private String remark;

    /**
     * 法官电话
     */
    private String fgtel;

    /**
     * 书记电话
     */
    private String sjtel;

    /**
     * 提交时间
     */
    private LocalDateTime subtime;

    /**
     * 提交人
     */
    private String uname;

    /**
     * 开庭状态
     */
    private String status;

    /**
     * 立案提醒
     */
    private Integer lntx;

    /**
     * 开庭提醒
     */
    private Integer kttx;

    /**
     * 宣判提醒
     */
    private Integer xptx;

    /**
     * 上述提醒
     */
    private Integer sstx;


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

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getSpjg() {
        return spjg;
    }

    public void setSpjg(String spjg) {
        this.spjg = spjg;
    }

    public String getLnsj() {
        return lnsj;
    }

    public void setLnsj(String lnsj) {
        this.lnsj = lnsj;
    }

    public String getKtsj() {
        return ktsj;
    }

    public void setKtsj(String ktsj) {
        this.ktsj = ktsj;
    }

    public String getXprq() {
        return xprq;
    }

    public void setXprq(String xprq) {
        this.xprq = xprq;
    }

    public String getSsrq() {
        return ssrq;
    }

    public void setSsrq(String ssrq) {
        this.ssrq = ssrq;
    }

    public String getFt() {
        return ft;
    }

    public void setFt(String ft) {
        this.ft = ft;
    }

    public String getFg() {
        return fg;
    }

    public void setFg(String fg) {
        this.fg = fg;
    }

    public String getSjy() {
        return sjy;
    }

    public void setSjy(String sjy) {
        this.sjy = sjy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFgtel() {
        return fgtel;
    }

    public void setFgtel(String fgtel) {
        this.fgtel = fgtel;
    }

    public String getSjtel() {
        return sjtel;
    }

    public void setSjtel(String sjtel) {
        this.sjtel = sjtel;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLntx() {
        return lntx;
    }

    public void setLntx(Integer lntx) {
        this.lntx = lntx;
    }

    public Integer getKttx() {
        return kttx;
    }

    public void setKttx(Integer kttx) {
        this.kttx = kttx;
    }

    public Integer getXptx() {
        return xptx;
    }

    public void setXptx(Integer xptx) {
        this.xptx = xptx;
    }

    public Integer getSstx() {
        return sstx;
    }

    public void setSstx(Integer sstx) {
        this.sstx = sstx;
    }

    @Override
    public String toString() {
        return "Fy{" +
        "id=" + id +
        ", caseid=" + caseid +
        ", flow=" + flow +
        ", spjg=" + spjg +
        ", lnsj=" + lnsj +
        ", ktsj=" + ktsj +
        ", xprq=" + xprq +
        ", ssrq=" + ssrq +
        ", ft=" + ft +
        ", fg=" + fg +
        ", sjy=" + sjy +
        ", remark=" + remark +
        ", fgtel=" + fgtel +
        ", sjtel=" + sjtel +
        ", subtime=" + subtime +
        ", uname=" + uname +
        ", status=" + status +
        ", lntx=" + lntx +
        ", kttx=" + kttx +
        ", xptx=" + xptx +
        ", sstx=" + sstx +
        "}";
    }
}
