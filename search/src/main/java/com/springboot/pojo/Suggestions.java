package com.springboot.pojo;

public class Suggestions {
    private Long id;

    private String qt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQt() {
        return qt;
    }

    public void setQt(String qt) {
        this.qt = qt == null ? null : qt.trim();
    }
}