package com.tensquare.base.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_admin", schema = "tensquare", catalog = "")
public class Admin {
    private String id;
    private String loginname;
    private String password;
    private String state;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "loginname", nullable = true, length = 100)
    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
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
    @Column(name = "state", nullable = true, length = 1)
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

        Admin admin = (Admin) o;

        if (id != null ? !id.equals(admin.id) : admin.id != null) return false;
        if (loginname != null ? !loginname.equals(admin.loginname) : admin.loginname != null) return false;
        if (password != null ? !password.equals(admin.password) : admin.password != null) return false;
        if (state != null ? !state.equals(admin.state) : admin.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loginname != null ? loginname.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
