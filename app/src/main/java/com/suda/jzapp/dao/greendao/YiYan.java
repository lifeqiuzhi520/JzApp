package com.suda.jzapp.dao.greendao;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "YI_YAN".
 */
@Entity
public class YiYan {
    private String content;

    @Generated(hash = 2136910826)
    public YiYan() {
    }

    @Generated(hash = 339308486)
    public YiYan(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
