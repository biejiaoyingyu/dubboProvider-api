package com.cxf.dubbo.entities;

import java.io.Serializable;

public class Book implements Serializable{
    public Book(String name, int version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Book() {
    }

    private String name;
    private int version;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", version=" + version +
                '}';
    }
}
