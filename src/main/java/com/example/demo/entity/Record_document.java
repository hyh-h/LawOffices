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
public class Record_document implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer case_law_id;

    private Integer system_user_id;

    private LocalDateTime upddate;

    private Integer folder_id;

    private String document_file;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(Integer case_law_id) {
        this.case_law_id = case_law_id;
    }

    public Integer getSystem_user_id() {
        return system_user_id;
    }

    public void setSystem_user_id(Integer system_user_id) {
        this.system_user_id = system_user_id;
    }

    public LocalDateTime getUpddate() {
        return upddate;
    }

    public void setUpddate(LocalDateTime upddate) {
        this.upddate = upddate;
    }

    public Integer getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(Integer folder_id) {
        this.folder_id = folder_id;
    }

    public String getDocument_file() {
        return document_file;
    }

    public void setDocument_file(String document_file) {
        this.document_file = document_file;
    }

    @Override
    public String toString() {
        return "Record_document{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", system_user_id=" + system_user_id +
        ", upddate=" + upddate +
        ", folder_id=" + folder_id +
        ", document_file=" + document_file +
        "}";
    }
}
