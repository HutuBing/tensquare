package com.tensquare.base.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_column", schema = "tensquare", catalog = "")
public class Column {
    private String id;
    private String name;
    private String summary;
    private String userid;
    private Timestamp createtime;
    private Timestamp checktime;
    private String state;

    @Id
    @javax.persistence.Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @javax.persistence.Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @javax.persistence.Column(name = "summary", nullable = true, length = 1000)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @javax.persistence.Column(name = "userid", nullable = true, length = 20)
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    @Basic
    @javax.persistence.Column(name = "createtime", nullable = true)
    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    @Basic
    @javax.persistence.Column(name = "checktime", nullable = true)
    public Timestamp getChecktime() {
        return checktime;
    }

    public void setChecktime(Timestamp checktime) {
        this.checktime = checktime;
    }

    @Basic
    @javax.persistence.Column(name = "state", nullable = true, length = 1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Column column = (Column) o;

        if (id != null ? !id.equals(column.id) : column.id != null) return false;
        if (name != null ? !name.equals(column.name) : column.name != null) return false;
        if (summary != null ? !summary.equals(column.summary) : column.summary != null) return false;
        if (userid != null ? !userid.equals(column.userid) : column.userid != null) return false;
        if (createtime != null ? !createtime.equals(column.createtime) : column.createtime != null) return false;
        if (checktime != null ? !checktime.equals(column.checktime) : column.checktime != null) return false;
        if (state != null ? !state.equals(column.state) : column.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (checktime != null ? checktime.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
