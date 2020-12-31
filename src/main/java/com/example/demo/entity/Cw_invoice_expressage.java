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
public class Cw_invoice_expressage implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 发票id
     */
    private Long cw_invoice_id;

    /**
     * 快递id
     */
    private Long adm_expressage_id;


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

    public Long getAdm_expressage_id() {
        return adm_expressage_id;
    }

    public void setAdm_expressage_id(Long adm_expressage_id) {
        this.adm_expressage_id = adm_expressage_id;
    }

    @Override
    public String toString() {
        return "Cw_invoice_expressage{" +
        "id=" + id +
        ", cw_invoice_id=" + cw_invoice_id +
        ", adm_expressage_id=" + adm_expressage_id +
        "}";
    }
}
