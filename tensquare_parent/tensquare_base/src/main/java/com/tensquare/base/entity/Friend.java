package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table(name = "tb_friend", schema = "tensquare", catalog = "")
@IdClass(FriendPK.class)
public class Friend {
    private String userid;
    private String friendid;
    private String islike;

    @Id
    @Column(name = "userid", nullable = false, length = 20)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Id
    @Column(name = "friendid", nullable = false, length = 20)
    public String getFriendid() {
        return friendid;
    }

    public void setFriendid(String friendid) {
        this.friendid = friendid;
    }

    @Basic
    @Column(name = "islike", nullable = true, length = 1)
    public String getIslike() {
        return islike;
    }

    public void setIslike(String islike) {
        this.islike = islike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Friend friend = (Friend) o;

        if (userid != null ? !userid.equals(friend.userid) : friend.userid != null) return false;
        if (friendid != null ? !friendid.equals(friend.friendid) : friend.friendid != null) return false;
        if (islike != null ? !islike.equals(friend.islike) : friend.islike != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (friendid != null ? friendid.hashCode() : 0);
        result = 31 * result + (islike != null ? islike.hashCode() : 0);
        return result;
    }
}
