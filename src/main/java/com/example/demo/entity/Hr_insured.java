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
public class Hr_insured implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String insured_name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInsured_name() {
        return insured_name;
    }

    public void setInsured_name(String insured_name) {
        this.insured_name = insured_name;
    }

    @Override
    public String toString() {
        return "Hr_insured{" +
        "id=" + id +
        ", insured_name=" + insured_name +
        "}";
    }
}
