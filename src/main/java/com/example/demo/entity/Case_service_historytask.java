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
public class Case_service_historytask implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer apply_id;

    private String act_ru_execution_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getApply_id() {
        return apply_id;
    }

    public void setApply_id(Integer apply_id) {
        this.apply_id = apply_id;
    }

    public String getAct_ru_execution_id() {
        return act_ru_execution_id;
    }

    public void setAct_ru_execution_id(String act_ru_execution_id) {
        this.act_ru_execution_id = act_ru_execution_id;
    }

    @Override
    public String toString() {
        return "Case_service_historytask{" +
        "id=" + id +
        ", apply_id=" + apply_id +
        ", act_ru_execution_id=" + act_ru_execution_id +
        "}";
    }
}
