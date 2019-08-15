package com.tensquare.base.entity;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_label", schema = "tensquare", catalog = "")
public class Label implements Serializable {

    @Id
    private String id;
    private String labelName;
    private String state;
    private Long count;
    private Long fans;
    private String recommend;

    @Id
    @Column(name = "id", nullable = false, length = 20)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "label_name", nullable = true, length = 100)
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
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
    @Column(name = "count", nullable = true)
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Basic
    @Column(name = "fans", nullable = true)
    public Long getFans() {
        return fans;
    }

    public void setFans(Long fans) {
        this.fans = fans;
    }

    @Basic
    @Column(name = "recommend", nullable = true, length = 1)
    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Label label = (Label) o;

        if (id != null ? !id.equals(label.id) : label.id != null) return false;
        if (labelName != null ? !labelName.equals(label.labelName) : label.labelName != null) return false;
        if (state != null ? !state.equals(label.state) : label.state != null) return false;
        if (count != null ? !count.equals(label.count) : label.count != null) return false;
        if (fans != null ? !fans.equals(label.fans) : label.fans != null) return false;
        if (recommend != null ? !recommend.equals(label.recommend) : label.recommend != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (labelName != null ? labelName.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (recommend != null ? recommend.hashCode() : 0);
        result = 31 * result + (fans != null ? fans.hashCode() : 0);
        return result;
    }
}
