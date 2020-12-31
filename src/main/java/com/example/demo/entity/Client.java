package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.sql.Blob;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String client;

    private String phone;

    private String type;

    private String typeinfo;

    private String cardnum;

    private String principal;

    private String contact;

    private String email;

    private String duty;

    private String affectedareas;

    private String tel;

    private String pertainarea;

    private Integer status;

    private String legalperson;

    private String legalpersontel;

    private Blob file;

    private String nation;

    private String sex;

    private String birth;

    private String address;

    private String remark;

    private LocalDateTime addtime;

    private Integer system_user_id;

    /**
     * 状态
     */
    private Integer assign;

    private String fileurl;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeinfo() {
        return typeinfo;
    }

    public void setTypeinfo(String typeinfo) {
        this.typeinfo = typeinfo;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getAffectedareas() {
        return affectedareas;
    }

    public void setAffectedareas(String affectedareas) {
        this.affectedareas = affectedareas;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPertainarea() {
        return pertainarea;
    }

    public void setPertainarea(String pertainarea) {
        this.pertainarea = pertainarea;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getLegalpersontel() {
        return legalpersontel;
    }

    public void setLegalpersontel(String legalpersontel) {
        this.legalpersontel = legalpersontel;
    }

    public Blob getFile() {
        return file;
    }

    public void setFile(Blob file) {
        this.file = file;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getAddtime() {
        return addtime;
    }

    public void setAddtime(LocalDateTime addtime) {
        this.addtime = addtime;
    }

    public Integer getSystem_user_id() {
        return system_user_id;
    }

    public void setSystem_user_id(Integer system_user_id) {
        this.system_user_id = system_user_id;
    }

    public Integer getAssign() {
        return assign;
    }

    public void setAssign(Integer assign) {
        this.assign = assign;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }

    @Override
    public String toString() {
        return "Client{" +
        "id=" + id +
        ", client=" + client +
        ", phone=" + phone +
        ", type=" + type +
        ", typeinfo=" + typeinfo +
        ", cardnum=" + cardnum +
        ", principal=" + principal +
        ", contact=" + contact +
        ", email=" + email +
        ", duty=" + duty +
        ", affectedareas=" + affectedareas +
        ", tel=" + tel +
        ", pertainarea=" + pertainarea +
        ", status=" + status +
        ", legalperson=" + legalperson +
        ", legalpersontel=" + legalpersontel +
        ", file=" + file +
        ", nation=" + nation +
        ", sex=" + sex +
        ", birth=" + birth +
        ", address=" + address +
        ", remark=" + remark +
        ", addtime=" + addtime +
        ", system_user_id=" + system_user_id +
        ", assign=" + assign +
        ", fileurl=" + fileurl +
        "}";
    }
}
