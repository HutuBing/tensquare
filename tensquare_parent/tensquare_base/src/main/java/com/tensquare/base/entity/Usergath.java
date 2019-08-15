package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_usergath", schema = "tensquare", catalog = "")
@IdClass(UsergathPK.class)
public class Usergath {
    private String userid;
    private String gathid;
    private Timestamp exetime;

    @Id
    @Column(name = "userid", nullable = false, length = 20)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "gathid", nullable = false, length = 20)
    public String getGathid() {
        return gathid;
    }

    public void setGathid(String gathid) {
        this.gathid = gathid;
    }

    @Basic
    @Column(name = "exetime", nullable = true)
    public Timestamp getExetime() {
        return exetime;
    }

    public void setExetime(Timestamp exetime) {
        this.exetime = exetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usergath usergath = (Usergath) o;

        if (userid != null ? !userid.equals(usergath.userid) : usergath.userid != null) return false;
        if (gathid != null ? !gathid.equals(usergath.gathid) : usergath.gathid != null) return false;
        if (exetime != null ? !exetime.equals(usergath.exetime) : usergath.exetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (gathid != null ? gathid.hashCode() : 0);
        result = 31 * result + (exetime != null ? exetime.hashCode() : 0);
        return result;
    }
}
