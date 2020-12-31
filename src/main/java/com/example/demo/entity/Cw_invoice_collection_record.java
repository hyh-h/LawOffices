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
public class Cw_invoice_collection_record implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 开票id
     */
    private Long cw_invoice_id;

    /**
     * 收支id
     */
    private Long cw_inout_id;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCw_invoice_id() {
        return cw_invoice_id;
    }

    public void setCw_invoice_id(Long cw_invoice_id) {
        this.cw_invoice_id = cw_invoice_id;
    }

    public Long getCw_inout_id() {
        return cw_inout_id;
    }

    public void setCw_inout_id(Long cw_inout_id) {
        this.cw_inout_id = cw_inout_id;
    }

    @Override
    public String toString() {
        return "Cw_invoice_collection_record{" +
        "id=" + id +
        ", cw_invoice_id=" + cw_invoice_id +
        ", cw_inout_id=" + cw_inout_id +
        "}";
    }
}
