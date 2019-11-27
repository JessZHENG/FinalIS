package com.example.better.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
public class Project {

    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private long id;

    @NotEmpty(message = "项目名不能为空")
    @Size(min = 1,max = 20)
    @Column(nullable = false,length = 20)
    private String name;

    @NotEmpty(message = "项目描述不能为空")
    @Size(min = 1,max = 200)
    @Column(nullable = false,length = 20)
    private String description;

    @Column(nullable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Timestamp createTime;

    public Project(){}
    public Project(String name,String description){
        this.name=name;
        this.description=description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }
}
