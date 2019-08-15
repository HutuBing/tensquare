package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "tb_follow", schema = "tensquare", catalog = "")
@IdClass(FollowPK.class)
public class Follow {
    private String userid;
    private String targetuser;

    @Id
    @Column(name = "userid", nullable = false, length = 20)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "targetuser", nullable = false, length = 20)
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

        Follow follow = (Follow) o;

        if (userid != null ? !userid.equals(follow.userid) : follow.userid != null) return false;
        if (targetuser != null ? !targetuser.equals(follow.targetuser) : follow.targetuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (targetuser != null ? targetuser.hashCode() : 0);
        return result;
    }
}
