package com.example.better.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Relation {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private long id;

    @NotEmpty(message = "关系名不能为空")
    @Size(min = 1,max = 20)
    @Column(nullable = false,length = 20)
    private String name;

    @NotEmpty(message = "关系描述不能为空")
    @Size(min = 1,max = 200)
    @Column(nullable = false,length = 20)
    private String description;

    @NotNull(message = "from不能为空")
    private long fromTableId;

    @NotNull(message = "to不能为空")
    private long toTableId;

    public Relation(){}
    public Relation(String name,String description,long fromTableId,long toTableId){
        this.name=name;
        this.description=description;
        this.fromTableId=fromTableId;
        this.toTableId=toTableId;
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

    public long getFromTableId() {
        return fromTableId;
    }

    public void setFromTableId(long fromTableId) {
        this.fromTableId = fromTableId;
    }

    public long getToTableId() {
        return toTableId;
    }

    public void setToTableId(long toTableId) {
        this.toTableId = toTableId;
    }
}
