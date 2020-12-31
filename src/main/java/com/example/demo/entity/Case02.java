package com.example.demo.entity;

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
public class Case02 implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private LocalDateTime case_creattime;

    private String case_cause;

    private String case_propernum;

    private String case_scope_range;

    private String case_parties;

    private String case_opposite_parties;

    private String case_third_party;

    private String case_seal_applyfor;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCase_creattime() {
        return case_creattime;
    }

    public void setCase_creattime(LocalDateTime case_creattime) {
        this.case_creattime = case_creattime;
    }

    public String getCase_cause() {
        return case_cause;
    }

    public void setCase_cause(String case_cause) {
        this.case_cause = case_cause;
    }

    public String getCase_propernum() {
        return case_propernum;
    }

    public void setCase_propernum(String case_propernum) {
        this.case_propernum = case_propernum;
    }

    public String getCase_scope_range() {
        return case_scope_range;
    }

    public void setCase_scope_range(String case_scope_range) {
        this.case_scope_range = case_scope_range;
    }

    public String getCase_parties() {
        return case_parties;
    }

    public void setCase_parties(String case_parties) {
        this.case_parties = case_parties;
    }

    public String getCase_opposite_parties() {
        return case_opposite_parties;
    }

    public void setCase_opposite_parties(String case_opposite_parties) {
        this.case_opposite_parties = case_opposite_parties;
    }

    public String getCase_third_party() {
        return case_third_party;
    }

    public void setCase_third_party(String case_third_party) {
        this.case_third_party = case_third_party;
    }

    public String getCase_seal_applyfor() {
        return case_seal_applyfor;
    }

    public void setCase_seal_applyfor(String case_seal_applyfor) {
        this.case_seal_applyfor = case_seal_applyfor;
    }

    @Override
    public String toString() {
        return "Case02{" +
        "id=" + id +
        ", case_creattime=" + case_creattime +
        ", case_cause=" + case_cause +
        ", case_propernum=" + case_propernum +
        ", case_scope_range=" + case_scope_range +
        ", case_parties=" + case_parties +
        ", case_opposite_parties=" + case_opposite_parties +
        ", case_third_party=" + case_third_party +
        ", case_seal_applyfor=" + case_seal_applyfor +
        "}";
    }
}
