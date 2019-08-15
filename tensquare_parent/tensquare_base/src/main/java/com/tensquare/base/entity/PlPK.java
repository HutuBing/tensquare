package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PlPK implements Serializable {
    private String problemid;
    private String labelid;

    @Column(name = "problemid", nullable = false, length = 20)
    @Id
    public String getProblemid() {
        return problemid;
    }

    public void setProblemid(String problemid) {
        this.problemid = problemid;
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

        PlPK plPK = (PlPK) o;

        if (problemid != null ? !problemid.equals(plPK.problemid) : plPK.problemid != null) return false;
        if (labelid != null ? !labelid.equals(plPK.labelid) : plPK.labelid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = problemid != null ? problemid.hashCode() : 0;
        result = 31 * result + (labelid != null ? labelid.hashCode() : 0);
        return result;
    }
}
