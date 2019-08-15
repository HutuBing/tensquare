package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pl", schema = "tensquare", catalog = "")
@IdClass(PlPK.class)
public class Pl {
    private String problemid;
    private String labelid;

    @Id
    @Column(name = "problemid", nullable = false, length = 20)
    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
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

        Pl pl = (Pl) o;

        if (problemid != null ? !problemid.equals(pl.problemid) : pl.problemid != null) return false;
        if (labelid != null ? !labelid.equals(pl.labelid) : pl.labelid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = problemid != null ? problemid.hashCode() : 0;
        result = 31 * result + (labelid != null ? labelid.hashCode() : 0);
        return result;
    }
}
