package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Apply implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String case_no;

    private String submiter;

    private String type;

    private String leader;

    private LocalDateTime createtime;

    /**
     * 1,2,3
     */
    private Integer status;

    private Integer wid;

    private String remark;

    private Blob file;

    private String wtr;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCase_no() {
        return case_no;
    }

    public void setCase_no(String case_no) {
        this.case_no = case_no;
    }

    public String getSubmiter() {
        return submiter;
    }

    public void setSubmiter(String submiter) {
        this.submiter = submiter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Blob getFile() {
        return file;
    }

    public void setFile(Blob file) {
        this.file = file;
    }

    public String getWtr() {
        return wtr;
    }

    public void setWtr(String wtr) {
        this.wtr = wtr;
    }

    @Override
    public String toString() {
        return "Apply{" +
        "id=" + id +
        ", case_no=" + case_no +
        ", submiter=" + submiter +
        ", type=" + type +
        ", leader=" + leader +
        ", createtime=" + createtime +
        ", status=" + status +
        ", wid=" + wid +
        ", remark=" + remark +
        ", file=" + file +
        ", wtr=" + wtr +
        "}";
    }
}
