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
public class Hr_inspect implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String inspect_name;

    private String inspect_norm1;

    private String inspect_norm2;

    private String inspect_score;

    private String inspect_standard;

    private String inspect_way;

    private String inspect_graded;

    private String inspect_insptype;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInspect_name() {
        return inspect_name;
    }

    public void setInspect_name(String inspect_name) {
        this.inspect_name = inspect_name;
    }

    public String getInspect_norm1() {
        return inspect_norm1;
    }

    public void setInspect_norm1(String inspect_norm1) {
        this.inspect_norm1 = inspect_norm1;
    }

    public String getInspect_norm2() {
        return inspect_norm2;
    }

    public void setInspect_norm2(String inspect_norm2) {
        this.inspect_norm2 = inspect_norm2;
    }

    public String getInspect_score() {
        return inspect_score;
    }

    public void setInspect_score(String inspect_score) {
        this.inspect_score = inspect_score;
    }

    public String getInspect_standard() {
        return inspect_standard;
    }

    public void setInspect_standard(String inspect_standard) {
        this.inspect_standard = inspect_standard;
    }

    public String getInspect_way() {
        return inspect_way;
    }

    public void setInspect_way(String inspect_way) {
        this.inspect_way = inspect_way;
    }

    public String getInspect_graded() {
        return inspect_graded;
    }

    public void setInspect_graded(String inspect_graded) {
        this.inspect_graded = inspect_graded;
    }

    public String getInspect_insptype() {
        return inspect_insptype;
    }

    public void setInspect_insptype(String inspect_insptype) {
        this.inspect_insptype = inspect_insptype;
    }

    @Override
    public String toString() {
        return "Hr_inspect{" +
        "id=" + id +
        ", inspect_name=" + inspect_name +
        ", inspect_norm1=" + inspect_norm1 +
        ", inspect_norm2=" + inspect_norm2 +
        ", inspect_score=" + inspect_score +
        ", inspect_standard=" + inspect_standard +
        ", inspect_way=" + inspect_way +
        ", inspect_graded=" + inspect_graded +
        ", inspect_insptype=" + inspect_insptype +
        "}";
    }
}
