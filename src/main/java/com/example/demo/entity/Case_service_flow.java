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
public class Case_service_flow implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String case_service_type;

    private String act_deployment_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCase_service_type() {
        return case_service_type;
    }

    public void setCase_service_type(String case_service_type) {
        this.case_service_type = case_service_type;
    }

    public String getAct_deployment_id() {
        return act_deployment_id;
    }

    public void setAct_deployment_id(String act_deployment_id) {
        this.act_deployment_id = act_deployment_id;
    }

    @Override
    public String toString() {
        return "Case_service_flow{" +
        "id=" + id +
        ", case_service_type=" + case_service_type +
        ", act_deployment_id=" + act_deployment_id +
        "}";
    }
}
