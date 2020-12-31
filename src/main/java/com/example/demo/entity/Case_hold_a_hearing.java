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
public class Case_hold_a_hearing implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String case_law_id;

    private String hearing_consignor;

    private String hearing_approval_procedure;

    private LocalDate hearing_accreditation_time;

    private LocalDate hearing_hold_a_cout_time;

    private LocalDate hearing_acquit_time;

    private LocalDate hearing_appeal_time;

    private String hearing_office;

    private String hearing_court;

    private String hearing_hold_a_cout_status;

    private String hearing_jude;

    private String hearing_judge_tel;

    private String hearing_court_clerk;

    private String hearing_court_clerk_tel;

    private String hearing_remark;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCase_law_id() {
        return case_law_id;
    }

    public void setCase_law_id(String case_law_id) {
        this.case_law_id = case_law_id;
    }

    public String getHearing_consignor() {
        return hearing_consignor;
    }

    public void setHearing_consignor(String hearing_consignor) {
        this.hearing_consignor = hearing_consignor;
    }

    public String getHearing_approval_procedure() {
        return hearing_approval_procedure;
    }

    public void setHearing_approval_procedure(String hearing_approval_procedure) {
        this.hearing_approval_procedure = hearing_approval_procedure;
    }

    public LocalDate getHearing_accreditation_time() {
        return hearing_accreditation_time;
    }

    public void setHearing_accreditation_time(LocalDate hearing_accreditation_time) {
        this.hearing_accreditation_time = hearing_accreditation_time;
    }

    public LocalDate getHearing_hold_a_cout_time() {
        return hearing_hold_a_cout_time;
    }

    public void setHearing_hold_a_cout_time(LocalDate hearing_hold_a_cout_time) {
        this.hearing_hold_a_cout_time = hearing_hold_a_cout_time;
    }

    public LocalDate getHearing_acquit_time() {
        return hearing_acquit_time;
    }

    public void setHearing_acquit_time(LocalDate hearing_acquit_time) {
        this.hearing_acquit_time = hearing_acquit_time;
    }

    public LocalDate getHearing_appeal_time() {
        return hearing_appeal_time;
    }

    public void setHearing_appeal_time(LocalDate hearing_appeal_time) {
        this.hearing_appeal_time = hearing_appeal_time;
    }

    public String getHearing_office() {
        return hearing_office;
    }

    public void setHearing_office(String hearing_office) {
        this.hearing_office = hearing_office;
    }

    public String getHearing_court() {
        return hearing_court;
    }

    public void setHearing_court(String hearing_court) {
        this.hearing_court = hearing_court;
    }

    public String getHearing_hold_a_cout_status() {
        return hearing_hold_a_cout_status;
    }

    public void setHearing_hold_a_cout_status(String hearing_hold_a_cout_status) {
        this.hearing_hold_a_cout_status = hearing_hold_a_cout_status;
    }

    public String getHearing_jude() {
        return hearing_jude;
    }

    public void setHearing_jude(String hearing_jude) {
        this.hearing_jude = hearing_jude;
    }

    public String getHearing_judge_tel() {
        return hearing_judge_tel;
    }

    public void setHearing_judge_tel(String hearing_judge_tel) {
        this.hearing_judge_tel = hearing_judge_tel;
    }

    public String getHearing_court_clerk() {
        return hearing_court_clerk;
    }

    public void setHearing_court_clerk(String hearing_court_clerk) {
        this.hearing_court_clerk = hearing_court_clerk;
    }

    public String getHearing_court_clerk_tel() {
        return hearing_court_clerk_tel;
    }

    public void setHearing_court_clerk_tel(String hearing_court_clerk_tel) {
        this.hearing_court_clerk_tel = hearing_court_clerk_tel;
    }

    public String getHearing_remark() {
        return hearing_remark;
    }

    public void setHearing_remark(String hearing_remark) {
        this.hearing_remark = hearing_remark;
    }

    @Override
    public String toString() {
        return "Case_hold_a_hearing{" +
        "id=" + id +
        ", case_law_id=" + case_law_id +
        ", hearing_consignor=" + hearing_consignor +
        ", hearing_approval_procedure=" + hearing_approval_procedure +
        ", hearing_accreditation_time=" + hearing_accreditation_time +
        ", hearing_hold_a_cout_time=" + hearing_hold_a_cout_time +
        ", hearing_acquit_time=" + hearing_acquit_time +
        ", hearing_appeal_time=" + hearing_appeal_time +
        ", hearing_office=" + hearing_office +
        ", hearing_court=" + hearing_court +
        ", hearing_hold_a_cout_status=" + hearing_hold_a_cout_status +
        ", hearing_jude=" + hearing_jude +
        ", hearing_judge_tel=" + hearing_judge_tel +
        ", hearing_court_clerk=" + hearing_court_clerk +
        ", hearing_court_clerk_tel=" + hearing_court_clerk_tel +
        ", hearing_remark=" + hearing_remark +
        "}";
    }
}
