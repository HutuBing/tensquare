package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_article", schema = "tensquare", catalog = "")
public class Article {
    private String id;
    private String columnid;
    private String userid;
    private String title;
    private String content;
    private String image;
    private Timestamp createtime;
    private Timestamp updatetime;
    private String ispublic;
    private String istop;
    private Integer visits;
    private Integer thumbup;
    private Integer comment;
    private String state;
    private String channelid;
    private String url;
    private String type;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "columnid", nullable = true, length = 20)
    public String getColumnid() {
        return columnid;
    }

    public void setColumnid(String columnid) {
        this.columnid = columnid;
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
    @Column(name = "image", nullable = true, length = 100)
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
    @Column(name = "ispublic", nullable = true, length = 1)
    public String getIspublic() {
        return ispublic;
    }

    public void setIspublic(String ispublic) {
        this.ispublic = ispublic;
    }

    @Basic
    @Column(name = "istop", nullable = true, length = 1)
    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop;
    }

    @Basic
    @Column(name = "visits", nullable = true)
    public Integer getVisits() {
        return visits;
    }

    public void setVisits(Integer visits) {
        this.visits = visits;
    }

    @Basic
    @Column(name = "thumbup", nullable = true)
    public Integer getThumbup() {
        return thumbup;
    }

    public void setThumbup(Integer thumbup) {
        this.thumbup = thumbup;
    }

    @Basic
    @Column(name = "comment", nullable = true)
    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "channelid", nullable = true, length = 20)
    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != null ? !id.equals(article.id) : article.id != null) return false;
        if (columnid != null ? !columnid.equals(article.columnid) : article.columnid != null) return false;
        if (userid != null ? !userid.equals(article.userid) : article.userid != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (content != null ? !content.equals(article.content) : article.content != null) return false;
        if (image != null ? !image.equals(article.image) : article.image != null) return false;
        if (createtime != null ? !createtime.equals(article.createtime) : article.createtime != null) return false;
        if (updatetime != null ? !updatetime.equals(article.updatetime) : article.updatetime != null) return false;
        if (ispublic != null ? !ispublic.equals(article.ispublic) : article.ispublic != null) return false;
        if (istop != null ? !istop.equals(article.istop) : article.istop != null) return false;
        if (visits != null ? !visits.equals(article.visits) : article.visits != null) return false;
        if (thumbup != null ? !thumbup.equals(article.thumbup) : article.thumbup != null) return false;
        if (comment != null ? !comment.equals(article.comment) : article.comment != null) return false;
        if (state != null ? !state.equals(article.state) : article.state != null) return false;
        if (channelid != null ? !channelid.equals(article.channelid) : article.channelid != null) return false;
        if (url != null ? !url.equals(article.url) : article.url != null) return false;
        if (type != null ? !type.equals(article.type) : article.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (columnid != null ? columnid.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (updatetime != null ? updatetime.hashCode() : 0);
        result = 31 * result + (ispublic != null ? ispublic.hashCode() : 0);
        result = 31 * result + (istop != null ? istop.hashCode() : 0);
        result = 31 * result + (visits != null ? visits.hashCode() : 0);
        result = 31 * result + (thumbup != null ? thumbup.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (channelid != null ? channelid.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
