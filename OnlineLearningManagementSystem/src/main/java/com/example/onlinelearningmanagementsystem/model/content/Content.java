package com.example.onlinelearningmanagementsystem.model.content;

public abstract class Content {
    private Long id;
    private String name;
    private String publishDate;
    private String endDate;
    private Integer successRatio;

    public abstract void calculateSuccess();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getSuccessRatio() {
        return successRatio;
    }

    public void setSuccessRatio(Integer successRatio) {
        this.successRatio = successRatio;
    }
}
