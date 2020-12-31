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
public class Adm_notice implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String title;

    private LocalDateTime notice_releasetime;

    private Integer system_user_id;

    private LocalDateTime notice_notificationtime;

    private LocalDateTime notice_notificationendtime;

    private String notice_content;

    private String notice_file;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getNotice_releasetime() {
        return notice_releasetime;
    }

    public void setNotice_releasetime(LocalDateTime notice_releasetime) {
        this.notice_releasetime = notice_releasetime;
    }

    public Integer getSystem_user_id() {
        return system_user_id;
    }

    public void setSystem_user_id(Integer system_user_id) {
        this.system_user_id = system_user_id;
    }

    public LocalDateTime getNotice_notificationtime() {
        return notice_notificationtime;
    }

    public void setNotice_notificationtime(LocalDateTime notice_notificationtime) {
        this.notice_notificationtime = notice_notificationtime;
    }

    public LocalDateTime getNotice_notificationendtime() {
        return notice_notificationendtime;
    }

    public void setNotice_notificationendtime(LocalDateTime notice_notificationendtime) {
        this.notice_notificationendtime = notice_notificationendtime;
    }

    public String getNotice_content() {
        return notice_content;
    }

    public void setNotice_content(String notice_content) {
        this.notice_content = notice_content;
    }

    public String getNotice_file() {
        return notice_file;
    }

    public void setNotice_file(String notice_file) {
        this.notice_file = notice_file;
    }

    @Override
    public String toString() {
        return "Adm_notice{" +
        "id=" + id +
        ", title=" + title +
        ", notice_releasetime=" + notice_releasetime +
        ", system_user_id=" + system_user_id +
        ", notice_notificationtime=" + notice_notificationtime +
        ", notice_notificationendtime=" + notice_notificationendtime +
        ", notice_content=" + notice_content +
        ", notice_file=" + notice_file +
        "}";
    }
}
