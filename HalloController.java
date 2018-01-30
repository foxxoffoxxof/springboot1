package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Administrator on 2018/1/25.
 */
@RestController
public class HalloController {

    @RequestMapping("/hallo")
    public String say()
    {
        return "你好!";
    }
}
