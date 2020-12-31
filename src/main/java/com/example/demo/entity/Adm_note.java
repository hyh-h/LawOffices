package com.example.demo.entity;

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
public class Adm_note implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String note_template;

    private Integer note_balance;

    private String note_remark;

    private LocalDate note_addtime;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNote_template() {
        return note_template;
    }

    public void setNote_template(String note_template) {
        this.note_template = note_template;
    }

    public Integer getNote_balance() {
        return note_balance;
    }

    public void setNote_balance(Integer note_balance) {
        this.note_balance = note_balance;
    }

    public String getNote_remark() {
        return note_remark;
    }

    public void setNote_remark(String note_remark) {
        this.note_remark = note_remark;
    }

    public LocalDate getNote_addtime() {
        return note_addtime;
    }

    public void setNote_addtime(LocalDate note_addtime) {
        this.note_addtime = note_addtime;
    }

    @Override
    public String toString() {
        return "Adm_note{" +
        "id=" + id +
        ", note_template=" + note_template +
        ", note_balance=" + note_balance +
        ", note_remark=" + note_remark +
        ", note_addtime=" + note_addtime +
        "}";
    }
}
