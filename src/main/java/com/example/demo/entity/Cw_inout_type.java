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
public class Cw_inout_type implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 类别名称
     */
    private String cw_name;

    private Long cw_pid;

    private String type;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCw_name() {
        return cw_name;
    }

    public void setCw_name(String cw_name) {
        this.cw_name = cw_name;
    }

    public Long getCw_pid() {
        return cw_pid;
    }

    public void setCw_pid(Long cw_pid) {
        this.cw_pid = cw_pid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Cw_inout_type{" +
        "id=" + id +
        ", cw_name=" + cw_name +
        ", cw_pid=" + cw_pid +
        ", type=" + type +
        "}";
    }
}
