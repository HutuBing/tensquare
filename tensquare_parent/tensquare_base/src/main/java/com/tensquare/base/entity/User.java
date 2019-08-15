package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_user", schema = "tensquare", catalog = "")
public class User {
    private String id;
    private String mobile;
    private String password;
    private String nickname;
    private String sex;
    private Timestamp birthday;
    private String avatar;
    private String email;
    private Timestamp regdate;
    private Timestamp updatedate;
    private Timestamp lastdate;
    private Long online;
    private String interest;
    private String personality;
    private Integer fanscount;
    private Integer followcount;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 100)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 100)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nickname", nullable = true, length = 100)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 2)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "birthday", nullable = true)
    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "avatar", nullable = true, length = 100)
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 100)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "regdate", nullable = true)
    public Timestamp getRegdate() {
        return regdate;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
    }

    @Basic
    @Column(name = "updatedate", nullable = true)
    public Timestamp getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Timestamp updatedate) {
        this.updatedate = updatedate;
    }

    @Basic
    @Column(name = "lastdate", nullable = true)
    public Timestamp getLastdate() {
        return lastdate;
    }

    public void setLastdate(Timestamp lastdate) {
        this.lastdate = lastdate;
    }

    @Basic
    @Column(name = "online", nullable = true)
    public Long getOnline() {
        return online;
    }

    public void setOnline(Long online) {
        this.online = online;
    }

    @Basic
    @Column(name = "interest", nullable = true, length = 100)
    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "personality", nullable = true, length = 100)
    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    @Basic
    @Column(name = "fanscount", nullable = true)
    public Integer getFanscount() {
        return fanscount;
    }

    public void setFanscount(Integer fanscount) {
        this.fanscount = fanscount;
    }

    @Basic
    @Column(name = "followcount", nullable = true)
    public Integer getFollowcount() {
        return followcount;
    }

    public void setFollowcount(Integer followcount) {
        this.followcount = followcount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if (mobile != null ? !mobile.equals(user.mobile) : user.mobile != null) return false;
        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        if (nickname != null ? !nickname.equals(user.nickname) : user.nickname != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (birthday != null ? !birthday.equals(user.birthday) : user.birthday != null) return false;
        if (avatar != null ? !avatar.equals(user.avatar) : user.avatar != null) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (regdate != null ? !regdate.equals(user.regdate) : user.regdate != null) return false;
        if (updatedate != null ? !updatedate.equals(user.updatedate) : user.updatedate != null) return false;
        if (lastdate != null ? !lastdate.equals(user.lastdate) : user.lastdate != null) return false;
        if (online != null ? !online.equals(user.online) : user.online != null) return false;
        if (interest != null ? !interest.equals(user.interest) : user.interest != null) return false;
        if (personality != null ? !personality.equals(user.personality) : user.personality != null) return false;
        if (fanscount != null ? !fanscount.equals(user.fanscount) : user.fanscount != null) return false;
        if (followcount != null ? !followcount.equals(user.followcount) : user.followcount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        result = 31 * result + (avatar != null ? avatar.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (regdate != null ? regdate.hashCode() : 0);
        result = 31 * result + (updatedate != null ? updatedate.hashCode() : 0);
        result = 31 * result + (lastdate != null ? lastdate.hashCode() : 0);
        result = 31 * result + (online != null ? online.hashCode() : 0);
        result = 31 * result + (interest != null ? interest.hashCode() : 0);
        result = 31 * result + (personality != null ? personality.hashCode() : 0);
        result = 31 * result + (fanscount != null ? fanscount.hashCode() : 0);
        result = 31 * result + (followcount != null ? followcount.hashCode() : 0);
        return result;
    }
}
