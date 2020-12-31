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
public class Case_seal_historytask implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer case_seal_id;

    private String act_ru_execution_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCase_seal_id() {
        return case_seal_id;
    }

    public void setCase_seal_id(Integer case_seal_id) {
        this.case_seal_id = case_seal_id;
    }

    public String getAct_ru_execution_id() {
        return act_ru_execution_id;
    }

    public void setAct_ru_execution_id(String act_ru_execution_id) {
        this.act_ru_execution_id = act_ru_execution_id;
    }

    @Override
    public String toString() {
        return "Case_seal_historytask{" +
        "id=" + id +
        ", case_seal_id=" + case_seal_id +
        ", act_ru_execution_id=" + act_ru_execution_id +
        "}";
    }
}
