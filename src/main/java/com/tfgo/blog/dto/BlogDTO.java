package com.tfgo.blog.dto;

import lombok.Data;

@Data
public class BlogDTO {
    private String title;
    private String summary;
    private String author;
    private String createTime;
    private String category;

    public BlogDTO(String title, String summary, String author, String createTime, String category){
        this.title = title;
        this.summary = summary;
        this.author = author;
        this.createTime = createTime;
        this.category = category;
    }
}
