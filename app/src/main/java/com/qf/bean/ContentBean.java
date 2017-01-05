package com.qf.bean;

/**
 * Created by Administrator on 2016/12/16.
 */

public class ContentBean {


    private String content;
    private String image;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ContentBean(String content, String image) {
        this.content = content;
        this.image = image;
    }


}
