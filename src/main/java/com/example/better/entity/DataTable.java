package com.example.better.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
public class DataTable {

    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private long id;

    @NotEmpty(message = "表名不能为空")
    @Size(min = 1,max = 20)
    @Column(nullable = false,length = 20)
    private String name;

    @NotEmpty(message = "表描述不能为空")
    @Size(min = 1,max = 200)
    @Column(nullable = false,length = 20)
    private String description;

    @NotEmpty(message = "表定义不能为空")
    @Size(min = 1,max = 200)
    @Column(nullable = false,length = 20)
    private String definition;

    @Column(nullable = false)
    @org.hibernate.annotations.CreationTimestamp
    private Timestamp createTime;

    @NotNull(message = "父项目不能为空")
    private long projectId;

    public DataTable(){}
    public DataTable(String name,String description,String definition,long projectId){
        this.name=name;
        this.description=description;
        this.definition=definition;
        this.projectId=projectId;
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

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString(){
        return (
                "{\nname:"+name
                +"\ndescription:"+description
                +"\ndefinition:"+definition
                +"}\n"
                );
    }
}
