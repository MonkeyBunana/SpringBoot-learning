package com.zll.Controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created by zll on 2018/3/26 0026.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}
