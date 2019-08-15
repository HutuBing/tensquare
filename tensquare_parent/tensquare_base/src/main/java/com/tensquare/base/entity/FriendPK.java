package com.tensquare.base.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FriendPK implements Serializable {
    private String userid;
    private String friendid;

    @Column(name = "userid", nullable = false, length = 20)
    @Id
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Column(name = "friendid", nullable = false, length = 20)
    @Id
    public String getFriendid() {
        return friendid;
    }

    public void setFriendid(String friendid) {
        this.friendid = friendid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FriendPK friendPK = (FriendPK) o;

        if (userid != null ? !userid.equals(friendPK.userid) : friendPK.userid != null) return false;
        if (friendid != null ? !friendid.equals(friendPK.friendid) : friendPK.friendid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (friendid != null ? friendid.hashCode() : 0);
        return result;
    }
}
