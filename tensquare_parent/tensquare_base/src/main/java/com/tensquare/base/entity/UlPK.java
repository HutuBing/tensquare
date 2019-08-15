package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UlPK implements Serializable {
    private String userid;
    private String labelid;

    @Column(name = "userid", nullable = false, length = 20)
    @Id
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "labelid", nullable = false, length = 20)
    @Id
    public String getLabelid() {
        return labelid;
    }

    public void setLabelid(String labelid) {
        this.labelid = labelid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UlPK ulPK = (UlPK) o;

        if (userid != null ? !userid.equals(ulPK.userid) : ulPK.userid != null) return false;
        if (labelid != null ? !labelid.equals(ulPK.labelid) : ulPK.labelid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (labelid != null ? labelid.hashCode() : 0);
        return result;
    }
}
