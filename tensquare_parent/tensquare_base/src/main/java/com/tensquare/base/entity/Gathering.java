package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_gathering", schema = "tensquare", catalog = "")
public class Gathering {
    private String id;
    private String name;
    private String summary;
    private String detail;
    private String sponsor;
    private String image;
    private Timestamp starttime;
    private Timestamp endtime;
    private String address;
    private Timestamp enrolltime;
    private String state;
    private String city;

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
    @Column(name = "summary", nullable = true, length = -1)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Basic
    @Column(name = "detail", nullable = true, length = -1)
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Basic
    @Column(name = "sponsor", nullable = true, length = 100)
    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
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
    @Column(name = "starttime", nullable = true)
    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "endtime", nullable = true)
    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "enrolltime", nullable = true)
    public Timestamp getEnrolltime() {
        return enrolltime;
    }

    public void setEnrolltime(Timestamp enrolltime) {
        this.enrolltime = enrolltime;
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
    @Column(name = "city", nullable = true, length = 20)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gathering gathering = (Gathering) o;

        if (id != null ? !id.equals(gathering.id) : gathering.id != null) return false;
        if (name != null ? !name.equals(gathering.name) : gathering.name != null) return false;
        if (summary != null ? !summary.equals(gathering.summary) : gathering.summary != null) return false;
        if (detail != null ? !detail.equals(gathering.detail) : gathering.detail != null) return false;
        if (sponsor != null ? !sponsor.equals(gathering.sponsor) : gathering.sponsor != null) return false;
        if (image != null ? !image.equals(gathering.image) : gathering.image != null) return false;
        if (starttime != null ? !starttime.equals(gathering.starttime) : gathering.starttime != null) return false;
        if (endtime != null ? !endtime.equals(gathering.endtime) : gathering.endtime != null) return false;
        if (address != null ? !address.equals(gathering.address) : gathering.address != null) return false;
        if (enrolltime != null ? !enrolltime.equals(gathering.enrolltime) : gathering.enrolltime != null) return false;
        if (state != null ? !state.equals(gathering.state) : gathering.state != null) return false;
        if (city != null ? !city.equals(gathering.city) : gathering.city != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (detail != null ? detail.hashCode() : 0);
        result = 31 * result + (sponsor != null ? sponsor.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (enrolltime != null ? enrolltime.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
