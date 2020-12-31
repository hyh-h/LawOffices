package com.example.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
public class Act_re_procdef implements Serializable {

    private static final long serialVersionUID = 1L;

      private String ID_;

    private Integer REV_;

    private String CATEGORY_;

    private String NAME_;

    private String KEY_;

    private Integer VERSION_;

    private String DEPLOYMENT_ID_;

    private String RESOURCE_NAME_;

    private String DGRM_RESOURCE_NAME_;

    private String DESCRIPTION_;

    private Integer HAS_START_FORM_KEY_;

    private Integer SUSPENSION_STATE_;

    private String TENANT_ID_;

    private Integer HAS_GRAPHICAL_NOTATION_;


    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public Integer getREV_() {
        return REV_;
    }

    public void setREV_(Integer REV_) {
        this.REV_ = REV_;
    }

    public String getCATEGORY_() {
        return CATEGORY_;
    }

    public void setCATEGORY_(String CATEGORY_) {
        this.CATEGORY_ = CATEGORY_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getKEY_() {
        return KEY_;
    }

    public void setKEY_(String KEY_) {
        this.KEY_ = KEY_;
    }

    public Integer getVERSION_() {
        return VERSION_;
    }

    public void setVERSION_(Integer VERSION_) {
        this.VERSION_ = VERSION_;
    }

    public String getDEPLOYMENT_ID_() {
        return DEPLOYMENT_ID_;
    }

    public void setDEPLOYMENT_ID_(String DEPLOYMENT_ID_) {
        this.DEPLOYMENT_ID_ = DEPLOYMENT_ID_;
    }

    public String getRESOURCE_NAME_() {
        return RESOURCE_NAME_;
    }

    public void setRESOURCE_NAME_(String RESOURCE_NAME_) {
        this.RESOURCE_NAME_ = RESOURCE_NAME_;
    }

    public String getDGRM_RESOURCE_NAME_() {
        return DGRM_RESOURCE_NAME_;
    }

    public void setDGRM_RESOURCE_NAME_(String DGRM_RESOURCE_NAME_) {
        this.DGRM_RESOURCE_NAME_ = DGRM_RESOURCE_NAME_;
    }

    public String getDESCRIPTION_() {
        return DESCRIPTION_;
    }

    public void setDESCRIPTION_(String DESCRIPTION_) {
        this.DESCRIPTION_ = DESCRIPTION_;
    }

    public Integer getHAS_START_FORM_KEY_() {
        return HAS_START_FORM_KEY_;
    }

    public void setHAS_START_FORM_KEY_(Integer HAS_START_FORM_KEY_) {
        this.HAS_START_FORM_KEY_ = HAS_START_FORM_KEY_;
    }

    public Integer getSUSPENSION_STATE_() {
        return SUSPENSION_STATE_;
    }

    public void setSUSPENSION_STATE_(Integer SUSPENSION_STATE_) {
        this.SUSPENSION_STATE_ = SUSPENSION_STATE_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    public Integer getHAS_GRAPHICAL_NOTATION_() {
        return HAS_GRAPHICAL_NOTATION_;
    }

    public void setHAS_GRAPHICAL_NOTATION_(Integer HAS_GRAPHICAL_NOTATION_) {
        this.HAS_GRAPHICAL_NOTATION_ = HAS_GRAPHICAL_NOTATION_;
    }

    @Override
    public String toString() {
        return "Act_re_procdef{" +
        "ID_=" + ID_ +
        ", REV_=" + REV_ +
        ", CATEGORY_=" + CATEGORY_ +
        ", NAME_=" + NAME_ +
        ", KEY_=" + KEY_ +
        ", VERSION_=" + VERSION_ +
        ", DEPLOYMENT_ID_=" + DEPLOYMENT_ID_ +
        ", RESOURCE_NAME_=" + RESOURCE_NAME_ +
        ", DGRM_RESOURCE_NAME_=" + DGRM_RESOURCE_NAME_ +
        ", DESCRIPTION_=" + DESCRIPTION_ +
        ", HAS_START_FORM_KEY_=" + HAS_START_FORM_KEY_ +
        ", SUSPENSION_STATE_=" + SUSPENSION_STATE_ +
        ", TENANT_ID_=" + TENANT_ID_ +
        ", HAS_GRAPHICAL_NOTATION_=" + HAS_GRAPHICAL_NOTATION_ +
        "}";
    }
}
