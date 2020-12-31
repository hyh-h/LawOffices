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
public class Record_archiveslibrary implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 案件id 外键
     */
    private Integer case_law_id;

    /**
     * 档案号
     */
    private String record_num;

    /**
     * 档案名称
     */
    private String record_name;

    /**
     * 借档人
     */
    private String borrow_file_people;

    /**
     * 借出时间
     */
    private LocalDate borrow_date;

    /**
     * 归还时间
     */
    private LocalDate give_back_date;

    /**
     * 备注
     */
    private String remark;

    /**
     * 归还状态 Y 已归还 N 未归还
     */
    private String borrow_status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Integer case_law_id) {
        this.case_law_id = case_law_id;
    }

    public String getRecord_num() {
        return record_num;
    }

    public void setRecord_num(String record_num) {
        this.record_num = record_num;
    }

    public String getRecord_name() {
        return record_name;
    }

    public void setRecord_name(String record_name) {
        this.record_name = record_name;
    }

    public String getBorrow_file_people() {
        return borrow_file_people;
    }

    public void setBorrow_file_people(String borrow_file_people) {
        this.borrow_file_people = borrow_file_people;
    }

    public LocalDate getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(LocalDate borrow_date) {
        this.borrow_date = borrow_date;
    }

    public LocalDate getGive_back_date() {
        return give_back_date;
    }

    public void setGive_back_date(LocalDate give_back_date) {
        this.give_back_date = give_back_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getBorrow_status() {
        return borrow_status;
    }

    public void setBorrow_status(String borrow_status) {
        this.borrow_status = borrow_status;
    }

    @Override
    public String toString() {
        return "Record_archiveslibrary{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", record_num=" + record_num +
        ", record_name=" + record_name +
        ", borrow_file_people=" + borrow_file_people +
        ", borrow_date=" + borrow_date +
        ", give_back_date=" + give_back_date +
        ", remark=" + remark +
        ", borrow_status=" + borrow_status +
        "}";
    }
}
