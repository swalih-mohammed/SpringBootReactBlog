package com.swalih.springBootBlog.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "blogs")
public class Blog {
    private String title;
    private String subtitle;
    private String content;

    public Blog() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
