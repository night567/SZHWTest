package com.example.szhw.entity;

public class Book {
    private Long id;
    private String name;
    private String type;
    
    public Long getId() {
        return id;
    }
// test Merge
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
// 测试合并冲突问题 ywf
    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    private String describe;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
