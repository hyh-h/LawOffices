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
public class Case_expressage implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer law_case_id;

    private Integer expressage_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLaw_case_id() {
        return law_case_id;
    }

    public void setLaw_case_id(Integer law_case_id) {
        this.law_case_id = law_case_id;
    }

    public Integer getExpressage_id() {
        return expressage_id;
    }

    public void setExpressage_id(Integer expressage_id) {
        this.expressage_id = expressage_id;
    }

    @Override
    public String toString() {
        return "Case_expressage{" +
        "id=" + id +
        ", law_case_id=" + law_case_id +
        ", expressage_id=" + expressage_id +
        "}";
    }
}
