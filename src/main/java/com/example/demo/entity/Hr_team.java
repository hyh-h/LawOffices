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
public class Hr_team implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String team_name;

    private String team_principal;

    private String team_member;

    private String team_intro;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_principal() {
        return team_principal;
    }

    public void setTeam_principal(String team_principal) {
        this.team_principal = team_principal;
    }

    public String getTeam_member() {
        return team_member;
    }

    public void setTeam_member(String team_member) {
        this.team_member = team_member;
    }

    public String getTeam_intro() {
        return team_intro;
    }

    public void setTeam_intro(String team_intro) {
        this.team_intro = team_intro;
    }

    @Override
    public String toString() {
        return "Hr_team{" +
        "id=" + id +
        ", team_name=" + team_name +
        ", team_principal=" + team_principal +
        ", team_member=" + team_member +
        ", team_intro=" + team_intro +
        "}";
    }
}
