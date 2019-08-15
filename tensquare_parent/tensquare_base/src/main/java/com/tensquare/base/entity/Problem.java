package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_problem", schema = "tensquare", catalog = "")
public class Problem {
    private String id;
    private String title;
    private String content;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String userid;
    private String nickname;
    private Long visits;
    private Long thumbup;
    private Long reply;
    private String solve;
    private String replyname;
    private Timestamp replytime;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "createtime", nullable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "updatetime", nullable = true)
    public Timestamp getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Timestamp updatetime) {
        this.updatetime = updatetime;
    }

    @Basic
    @Column(name = "userid", nullable = true, length = 20)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
    @Column(name = "visits", nullable = true)
    public Long getVisits() {
        return visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    @Basic
    @Column(name = "thumbup", nullable = true)
    public Long getThumbup() {
        return thumbup;
    }

    public void setThumbup(Long thumbup) {
        this.thumbup = thumbup;
    }

    @Basic
    @Column(name = "reply", nullable = true)
    public Long getReply() {
        return reply;
    }

    public void setReply(Long reply) {
        this.reply = reply;
    }

    @Basic
    @Column(name = "solve", nullable = true, length = 1)
    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve;
    }

    @Basic
    @Column(name = "replyname", nullable = true, length = 100)
    public String getReplyname() {
        return replyname;
    }

    public void setReplyname(String replyname) {
        this.replyname = replyname;
    }

    @Basic
    @Column(name = "replytime", nullable = true)
    public Timestamp getReplytime() {
        return replytime;
    }

    public void setReplytime(Timestamp replytime) {
        this.replytime = replytime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Problem problem = (Problem) o;

        if (id != null ? !id.equals(problem.id) : problem.id != null) return false;
        if (title != null ? !title.equals(problem.title) : problem.title != null) return false;
        if (content != null ? !content.equals(problem.content) : problem.content != null) return false;
        if (createtime != null ? !createtime.equals(problem.createtime) : problem.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(problem.updatetime) : problem.updatetime != null) return false;
        if (userid != null ? !userid.equals(problem.userid) : problem.userid != null) return false;
        if (nickname != null ? !nickname.equals(problem.nickname) : problem.nickname != null) return false;
        if (visits != null ? !visits.equals(problem.visits) : problem.visits != null) return false;
        if (thumbup != null ? !thumbup.equals(problem.thumbup) : problem.thumbup != null) return false;
        if (reply != null ? !reply.equals(problem.reply) : problem.reply != null) return false;
        if (solve != null ? !solve.equals(problem.solve) : problem.solve != null) return false;
        if (replyname != null ? !replyname.equals(problem.replyname) : problem.replyname != null) return false;
        if (replytime != null ? !replytime.equals(problem.replytime) : problem.replytime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (nickname != null ? nickname.hashCode() : 0);
        result = 31 * result + (visits != null ? visits.hashCode() : 0);
        result = 31 * result + (thumbup != null ? thumbup.hashCode() : 0);
        result = 31 * result + (reply != null ? reply.hashCode() : 0);
        result = 31 * result + (solve != null ? solve.hashCode() : 0);
        result = 31 * result + (replyname != null ? replyname.hashCode() : 0);
        result = 31 * result + (replytime != null ? replytime.hashCode() : 0);
        return result;
    }
}
