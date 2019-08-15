package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tb_ul", schema = "tensquare", catalog = "")
@IdClass(UlPK.class)
public class Ul {
    private String userid;
    private String labelid;

    @Id
    @Column(name = "userid", nullable = false, length = 20)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "labelid", nullable = false, length = 20)
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

        Ul ul = (Ul) o;

        if (userid != null ? !userid.equals(ul.userid) : ul.userid != null) return false;
        if (labelid != null ? !labelid.equals(ul.labelid) : ul.labelid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (labelid != null ? labelid.hashCode() : 0);
        return result;
    }
}
