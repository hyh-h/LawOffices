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
public class System_authority implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String authority_name;

    private Integer authority_pid;

    private String authority_path;

    private LocalDateTime authority_createdate;

    private String authority_desc;

    private String authority_status;

    private String authority_ico;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthority_name() {
        return authority_name;
    }

    public void setAuthority_name(String authority_name) {
        this.authority_name = authority_name;
    }

    public Integer getAuthority_pid() {
        return authority_pid;
    }

    public void setAuthority_pid(Integer authority_pid) {
        this.authority_pid = authority_pid;
    }

    public String getAuthority_path() {
        return authority_path;
    }

    public void setAuthority_path(String authority_path) {
        this.authority_path = authority_path;
    }

    public LocalDateTime getAuthority_createdate() {
        return authority_createdate;
    }

    public void setAuthority_createdate(LocalDateTime authority_createdate) {
        this.authority_createdate = authority_createdate;
    }

    public String getAuthority_desc() {
        return authority_desc;
    }

    public void setAuthority_desc(String authority_desc) {
        this.authority_desc = authority_desc;
    }

    public String getAuthority_status() {
        return authority_status;
    }

    public void setAuthority_status(String authority_status) {
        this.authority_status = authority_status;
    }

    public String getAuthority_ico() {
        return authority_ico;
    }

    public void setAuthority_ico(String authority_ico) {
        this.authority_ico = authority_ico;
    }

    @Override
    public String toString() {
        return "System_authority{" +
        "id=" + id +
        ", authority_name=" + authority_name +
        ", authority_pid=" + authority_pid +
        ", authority_path=" + authority_path +
        ", authority_createdate=" + authority_createdate +
        ", authority_desc=" + authority_desc +
        ", authority_status=" + authority_status +
        ", authority_ico=" + authority_ico +
        "}";
    }
}
