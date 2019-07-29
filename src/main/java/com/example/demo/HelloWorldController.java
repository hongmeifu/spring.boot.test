package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fuhm
 * @Date: 2019/5/19 16:15
 */
@RestController
public class HelloWorldController {

    @RequestMapping("hellWorld")
    public String hellWorld(){
        return "hellWorld";
    }
}

