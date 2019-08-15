package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UsergathPK implements Serializable {
    private String userid;
    private String gathid;

    @Column(name = "userid", nullable = false, length = 20)
    @Id
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "gathid", nullable = false, length = 20)
    @Id
    public String getGathid() {
        return gathid;
    }

    public void setGathid(String gathid) {
        this.gathid = gathid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsergathPK that = (UsergathPK) o;

        if (userid != null ? !userid.equals(that.userid) : that.userid != null) return false;
        if (gathid != null ? !gathid.equals(that.gathid) : that.gathid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (gathid != null ? gathid.hashCode() : 0);
        return result;
    }
}
