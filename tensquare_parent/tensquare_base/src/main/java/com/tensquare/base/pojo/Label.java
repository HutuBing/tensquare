package com.tensquare.base.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "tb_label")
public class Label implements Serializable {

    @Id
    private String id;
    private String labelName;
    private String state;
    private Long count;
    private Long fans;
    private String recommend;

}
