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
public class Case_flow implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer case_type_id;

    private Integer act_deployment_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCase_type_id() {
        return case_type_id;
    }

    public void setCase_type_id(Integer case_type_id) {
        this.case_type_id = case_type_id;
    }

    public Integer getAct_deployment_id() {
        return act_deployment_id;
    }

    public void setAct_deployment_id(Integer act_deployment_id) {
        this.act_deployment_id = act_deployment_id;
    }

    @Override
    public String toString() {
        return "Case_flow{" +
        "id=" + id +
        ", case_type_id=" + case_type_id +
        ", act_deployment_id=" + act_deployment_id +
        "}";
    }
}
