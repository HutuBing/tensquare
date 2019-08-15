package com.tensquare.base.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_enterprise", schema = "tensquare", catalog = "")
public class Enterprise {
    private String id;
    private String name;
    private String summary;
    private String address;
    private String labels;
    private String coordinate;
    private String ishot;
    private String logo;
    private Integer jobcount;
    private String url;

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
    @Column(name = "summary", nullable = true, length = 1000)
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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
    @Column(name = "labels", nullable = true, length = 100)
    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    @Basic
    @Column(name = "coordinate", nullable = true, length = 100)
    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }

    @Basic
    @Column(name = "ishot", nullable = true, length = 1)
    public String getIshot() {
        return ishot;
    }

    public void setIshot(String ishot) {
        this.ishot = ishot;
    }

    @Basic
    @Column(name = "logo", nullable = true, length = 100)
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Basic
    @Column(name = "jobcount", nullable = true)
    public Integer getJobcount() {
        return jobcount;
    }

    public void setJobcount(Integer jobcount) {
        this.jobcount = jobcount;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Enterprise that = (Enterprise) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (summary != null ? !summary.equals(that.summary) : that.summary != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (labels != null ? !labels.equals(that.labels) : that.labels != null) return false;
        if (coordinate != null ? !coordinate.equals(that.coordinate) : that.coordinate != null) return false;
        if (ishot != null ? !ishot.equals(that.ishot) : that.ishot != null) return false;
        if (logo != null ? !logo.equals(that.logo) : that.logo != null) return false;
        if (jobcount != null ? !jobcount.equals(that.jobcount) : that.jobcount != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (labels != null ? labels.hashCode() : 0);
        result = 31 * result + (coordinate != null ? coordinate.hashCode() : 0);
        result = 31 * result + (ishot != null ? ishot.hashCode() : 0);
        result = 31 * result + (logo != null ? logo.hashCode() : 0);
        result = 31 * result + (jobcount != null ? jobcount.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }
}
