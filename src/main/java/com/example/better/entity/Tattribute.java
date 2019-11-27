package com.example.better.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Tattribute {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增
    private long id;

    @NotEmpty(message = "属性名不能为空")
    @Size(min = 1,max = 20)
    @Column(nullable = false,length = 20)
    private String name;

    @NotEmpty(message = "属性描述不能为空")
    @Size(min = 1,max = 200)
    @Column(nullable = false,length = 20)
    private String description;

    @NotEmpty(message = "属性类型不能为空")
    @Size(min = 1,max = 20)
    @Column(nullable = false,length = 20)
    private String type;

    @NotEmpty(message = "属性默认值不能为空")
    @Size(min = 1,max = 20)
    @Column(nullable = false,length = 20)
    private String defaultValue;

    @NotNull(message = "主键属性不能为空")
    private Boolean ifPrimary;

    @NotNull(message = "外键不能为空")
    private long ifForeign;

    @NotNull(message = "父表不能为空")
    private long tableId;

    public Tattribute(){}

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getIfPrimary() {
        return ifPrimary;
    }

    public void setIfPrimary(Boolean ifPrimary) {
        this.ifPrimary = ifPrimary;
    }

    public long getIfForeign() {
        return ifForeign;
    }

    public void setIfForeign(long ifForeign) {
        this.ifForeign = ifForeign;
    }

    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }
}
