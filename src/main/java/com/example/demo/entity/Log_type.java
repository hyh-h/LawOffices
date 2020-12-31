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
public class Log_type implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String log_type_logname;

    private Integer log_type_pid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLog_type_logname() {
        return log_type_logname;
    }

    public void setLog_type_logname(String log_type_logname) {
        this.log_type_logname = log_type_logname;
    }

    public Integer getLog_type_pid() {
        return log_type_pid;
    }

    public void setLog_type_pid(Integer log_type_pid) {
        this.log_type_pid = log_type_pid;
    }

    @Override
    public String toString() {
        return "Log_type{" +
        "id=" + id +
        ", log_type_logname=" + log_type_logname +
        ", log_type_pid=" + log_type_pid +
        "}";
    }
}
