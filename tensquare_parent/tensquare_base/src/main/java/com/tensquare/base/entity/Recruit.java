package com.tensquare.base.entity;

import javax.persistence.*;
import javax.persistence.Column;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_recruit", schema = "tensquare", catalog = "")
public class Recruit {
    private String id;
    private String jobname;
    private String salary;
    private String condition;
    private String education;
    private String type;
    private String address;
    private String eid;
    private Timestamp createtime;
    private String state;
    private String url;
    private String label;
    private String content1;
    private String content2;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "jobname", nullable = true, length = 100)
    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    @Basic
    @Column(name = "salary", nullable = true, length = 100)
    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Basic
    @Column(name = "condition", nullable = true, length = 100)
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Basic
    @Column(name = "education", nullable = true, length = 100)
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "type", nullable = true, length = 1)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
    @Column(name = "eid", nullable = true, length = 20)
    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
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
    @Column(name = "state", nullable = true, length = 1)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
    @Column(name = "label", nullable = true, length = 100)
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Basic
    @Column(name = "content1", nullable = true, length = 100)
    public String getContent1() {
        return content1;
    }

    public void setContent1(String content1) {
        this.content1 = content1;
    }

    @Basic
    @Column(name = "content2", nullable = true, length = 100)
    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recruit recruit = (Recruit) o;

        if (id != null ? !id.equals(recruit.id) : recruit.id != null) return false;
        if (jobname != null ? !jobname.equals(recruit.jobname) : recruit.jobname != null) return false;
        if (salary != null ? !salary.equals(recruit.salary) : recruit.salary != null) return false;
        if (condition != null ? !condition.equals(recruit.condition) : recruit.condition != null) return false;
        if (education != null ? !education.equals(recruit.education) : recruit.education != null) return false;
        if (type != null ? !type.equals(recruit.type) : recruit.type != null) return false;
        if (address != null ? !address.equals(recruit.address) : recruit.address != null) return false;
        if (eid != null ? !eid.equals(recruit.eid) : recruit.eid != null) return false;
        if (createtime != null ? !createtime.equals(recruit.createtime) : recruit.createtime != null) return false;
        if (state != null ? !state.equals(recruit.state) : recruit.state != null) return false;
        if (url != null ? !url.equals(recruit.url) : recruit.url != null) return false;
        if (label != null ? !label.equals(recruit.label) : recruit.label != null) return false;
        if (content1 != null ? !content1.equals(recruit.content1) : recruit.content1 != null) return false;
        if (content2 != null ? !content2.equals(recruit.content2) : recruit.content2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (jobname != null ? jobname.hashCode() : 0);
        result = 31 * result + (salary != null ? salary.hashCode() : 0);
        result = 31 * result + (condition != null ? condition.hashCode() : 0);
        result = 31 * result + (education != null ? education.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (eid != null ? eid.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (content1 != null ? content1.hashCode() : 0);
        result = 31 * result + (content2 != null ? content2.hashCode() : 0);
        return result;
    }
}
