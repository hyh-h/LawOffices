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
public class Case_attorney implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String attorney_type;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAttorney_type() {
        return attorney_type;
    }

    public void setAttorney_type(String attorney_type) {
        this.attorney_type = attorney_type;
    }

    @Override
    public String toString() {
        return "Case_attorney{" +
        "id=" + id +
        ", attorney_type=" + attorney_type +
        "}";
    }
}
