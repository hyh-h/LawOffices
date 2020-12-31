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
public class System_log implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String user_Name;

    private String system_log_type;

    private String system_log_logexplain;

    private String system_log_ip;

    private LocalDateTime system_log_recordTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_Name() {
        return user_Name;
    }

    public void setUser_Name(String user_Name) {
        this.user_Name = user_Name;
    }

    public String getSystem_log_type() {
        return system_log_type;
    }

    public void setSystem_log_type(String system_log_type) {
        this.system_log_type = system_log_type;
    }

    public String getSystem_log_logexplain() {
        return system_log_logexplain;
    }

    public void setSystem_log_logexplain(String system_log_logexplain) {
        this.system_log_logexplain = system_log_logexplain;
    }

    public String getSystem_log_ip() {
        return system_log_ip;
    }

    public void setSystem_log_ip(String system_log_ip) {
        this.system_log_ip = system_log_ip;
    }

    public LocalDateTime getSystem_log_recordTime() {
        return system_log_recordTime;
    }

    public void setSystem_log_recordTime(LocalDateTime system_log_recordTime) {
        this.system_log_recordTime = system_log_recordTime;
    }

    @Override
    public String toString() {
        return "System_log{" +
        "id=" + id +
        ", user_Name=" + user_Name +
        ", system_log_type=" + system_log_type +
        ", system_log_logexplain=" + system_log_logexplain +
        ", system_log_ip=" + system_log_ip +
        ", system_log_recordTime=" + system_log_recordTime +
        "}";
    }
}
