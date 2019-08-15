package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FollowPK implements Serializable {
    private String userid;
    private String targetuser;

    @Column(name = "userid", nullable = false, length = 20)
    @Id
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "targetuser", nullable = false, length = 20)
    @Id
    public String getTargetuser() {
        return targetuser;
    }

    public void setTargetuser(String targetuser) {
        this.targetuser = targetuser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FollowPK followPK = (FollowPK) o;

        if (userid != null ? !userid.equals(followPK.userid) : followPK.userid != null) return false;
        if (targetuser != null ? !targetuser.equals(followPK.targetuser) : followPK.targetuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (targetuser != null ? targetuser.hashCode() : 0);
        return result;
    }
}
