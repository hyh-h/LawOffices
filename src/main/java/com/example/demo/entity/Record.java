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
public class Record implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer law_case_id;

    private Integer record_archived_file;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLaw_case_id() {
        return law_case_id;
    }

    public void setLaw_case_id(Integer law_case_id) {
        this.law_case_id = law_case_id;
    }

    public Integer getRecord_archived_file() {
        return record_archived_file;
    }

    public void setRecord_archived_file(Integer record_archived_file) {
        this.record_archived_file = record_archived_file;
    }

    @Override
    public String toString() {
        return "Record{" +
        "id=" + id +
        ", law_case_id=" + law_case_id +
        ", record_archived_file=" + record_archived_file +
        "}";
    }
}
