package com.zll;

import com.zll.pojo.ZllProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zll on 2018/3/19 0019.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter1ApplicationTests2 {

    @Autowired
    private ZllProperties zllProperties;


    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(zllProperties.getName(), "zll");
        Assert.assertEquals(zllProperties.getTitle(), "Spring Boot教程");
        Assert.assertEquals(zllProperties.getDesc(), "zll正在努力写《Spring Boot教程》");
    }

}
