package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class System_role implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String role_name;

    private LocalDateTime role_createdate;

    private String role_text;

    private String role_status;

    private Integer system_role_id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public LocalDateTime getRole_createdate() {
        return role_createdate;
    }

    public void setRole_createdate(LocalDateTime role_createdate) {
        this.role_createdate = role_createdate;
    }

    public String getRole_text() {
        return role_text;
    }

    public void setRole_text(String role_text) {
        this.role_text = role_text;
    }

    public String getRole_status() {
        return role_status;
    }

    public void setRole_status(String role_status) {
        this.role_status = role_status;
    }

    public Integer getSystem_role_id() {
        return system_role_id;
    }

    public void setSystem_role_id(Integer system_role_id) {
        this.system_role_id = system_role_id;
    }

    @Override
    public String toString() {
        return "System_role{" +
        "id=" + id +
        ", role_name=" + role_name +
        ", role_createdate=" + role_createdate +
        ", role_text=" + role_text +
        ", role_status=" + role_status +
        ", system_role_id=" + system_role_id +
        "}";
    }
}
