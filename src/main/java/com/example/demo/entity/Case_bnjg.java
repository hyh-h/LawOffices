package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class Case_bnjg implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer caseid;

    private Integer fyid;

    private Integer zcid;

    private Integer jcid;


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

    public Integer getFyid() {
        return fyid;
    }

    public void setFyid(Integer fyid) {
        this.fyid = fyid;
    }

    public Integer getZcid() {
        return zcid;
    }

    public void setZcid(Integer zcid) {
        this.zcid = zcid;
    }

    public Integer getJcid() {
        return jcid;
    }

    public void setJcid(Integer jcid) {
        this.jcid = jcid;
    }

    @Override
    public String toString() {
        return "Case_bnjg{" +
        "id=" + id +
        ", caseid=" + caseid +
        ", fyid=" + fyid +
        ", zcid=" + zcid +
        ", jcid=" + jcid +
        "}";
    }
}
