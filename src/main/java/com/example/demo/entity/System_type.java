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
public class System_type implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String system_type_logtype;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSystem_type_logtype() {
        return system_type_logtype;
    }

    public void setSystem_type_logtype(String system_type_logtype) {
        this.system_type_logtype = system_type_logtype;
    }

    @Override
    public String toString() {
        return "System_type{" +
        "id=" + id +
        ", system_type_logtype=" + system_type_logtype +
        "}";
    }
}
