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
public class System_user_role implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long system_user_id;

    private Integer system_role_id;

    private String status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSystem_user_id() {
        return system_user_id;
    }

    public void setSystem_user_id(Long system_user_id) {
        this.system_user_id = system_user_id;
    }

    public Integer getSystem_role_id() {
        return system_role_id;
    }

    public void setSystem_role_id(Integer system_role_id) {
        this.system_role_id = system_role_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "System_user_role{" +
        "id=" + id +
        ", system_user_id=" + system_user_id +
        ", system_role_id=" + system_role_id +
        ", status=" + status +
        "}";
    }
}
