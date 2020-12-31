package com.example.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
public class Case_service_log implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Integer client_id;

    private Integer system_user_id;

    private LocalDate log_service_time;

    private Integer log_consult_service_type_id;

    private Integer log_service_count;

    private BigDecimal log_service_price;

    private LocalDate log_register_time;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Integer getSystem_user_id() {
        return system_user_id;
    }

    public void setSystem_user_id(Integer system_user_id) {
        this.system_user_id = system_user_id;
    }

    public LocalDate getLog_service_time() {
        return log_service_time;
    }

    public void setLog_service_time(LocalDate log_service_time) {
        this.log_service_time = log_service_time;
    }

    public Integer getLog_consult_service_type_id() {
        return log_consult_service_type_id;
    }

    public void setLog_consult_service_type_id(Integer log_consult_service_type_id) {
        this.log_consult_service_type_id = log_consult_service_type_id;
    }

    public Integer getLog_service_count() {
        return log_service_count;
    }

    public void setLog_service_count(Integer log_service_count) {
        this.log_service_count = log_service_count;
    }

    public BigDecimal getLog_service_price() {
        return log_service_price;
    }

    public void setLog_service_price(BigDecimal log_service_price) {
        this.log_service_price = log_service_price;
    }

    public LocalDate getLog_register_time() {
        return log_register_time;
    }

    public void setLog_register_time(LocalDate log_register_time) {
        this.log_register_time = log_register_time;
    }

    @Override
    public String toString() {
        return "Case_service_log{" +
        "id=" + id +
        ", client_id=" + client_id +
        ", system_user_id=" + system_user_id +
        ", log_service_time=" + log_service_time +
        ", log_consult_service_type_id=" + log_consult_service_type_id +
        ", log_service_count=" + log_service_count +
        ", log_service_price=" + log_service_price +
        ", log_register_time=" + log_register_time +
        "}";
    }
}
