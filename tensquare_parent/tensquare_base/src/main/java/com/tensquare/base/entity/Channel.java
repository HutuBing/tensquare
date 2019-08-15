package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;

@Entity
@Table(name = "tb_channel", schema = "tensquare", catalog = "")
public class Channel {
    private String id;
    private String name;
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
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

        Channel channel = (Channel) o;

        if (id != null ? !id.equals(channel.id) : channel.id != null) return false;
        if (name != null ? !name.equals(channel.name) : channel.name != null) return false;
        if (state != null ? !state.equals(channel.state) : channel.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        return result;
    }
}
