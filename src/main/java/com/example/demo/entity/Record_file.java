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
public class Record_file implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String file_name;

    private Integer file_type_id;

    private String file_path;

    private LocalDate file_upload_date;

    private String file_upload_person;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public Integer getFile_type_id() {
        return file_type_id;
    }

    public void setFile_type_id(Integer file_type_id) {
        this.file_type_id = file_type_id;
    }

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    public LocalDate getFile_upload_date() {
        return file_upload_date;
    }

    public void setFile_upload_date(LocalDate file_upload_date) {
        this.file_upload_date = file_upload_date;
    }

    public String getFile_upload_person() {
        return file_upload_person;
    }

    public void setFile_upload_person(String file_upload_person) {
        this.file_upload_person = file_upload_person;
    }

    @Override
    public String toString() {
        return "Record_file{" +
        "id=" + id +
        ", file_name=" + file_name +
        ", file_type_id=" + file_type_id +
        ", file_path=" + file_path +
        ", file_upload_date=" + file_upload_date +
        ", file_upload_person=" + file_upload_person +
        "}";
    }
}
