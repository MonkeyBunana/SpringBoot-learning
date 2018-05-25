package com.zll.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by zll on 2018/3/19 0019.
 */
@Component
public class ZllProperties implements Serializable {

    /**
     * @value 调用application中设定的值
     */
    @Value("${com.zll.name}")
    private String name;
    @Value("${com.zll.title}")
    private String title;
    @Value("${com.zll.desc}")
    private String desc;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
