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
public class Client_typemsg implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer client_id;

    private Integer client_type_id;

    private String idtype;

    private Integer idnumber;

    private String company_nature;

    private String company_scale;

    private String type;

    private String industry;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getClient_type_id() {
        return client_type_id;
    }

    public void setClient_type_id(Integer client_type_id) {
        this.client_type_id = client_type_id;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public Integer getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(Integer idnumber) {
        this.idnumber = idnumber;
    }

    public String getCompany_nature() {
        return company_nature;
    }

    public void setCompany_nature(String company_nature) {
        this.company_nature = company_nature;
    }

    public String getCompany_scale() {
        return company_scale;
    }

    public void setCompany_scale(String company_scale) {
        this.company_scale = company_scale;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return "Client_typemsg{" +
        "id=" + id +
        ", client_id=" + client_id +
        ", client_type_id=" + client_type_id +
        ", idtype=" + idtype +
        ", idnumber=" + idnumber +
        ", company_nature=" + company_nature +
        ", company_scale=" + company_scale +
        ", type=" + type +
        ", industry=" + industry +
        "}";
    }
}
