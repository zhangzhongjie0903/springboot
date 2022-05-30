package com.zzj.fmod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @program: demo
 * @description: firstrequest
 * @date 2022-05-12 20:09:52
 */
@Controller
@RequestMapping("/first")
public class FirstTestController {
    @GetMapping("/suc")
    public String reqFirst(){
        System.out.println("1");
        System.out.println("2");
        return "index";
    }
}
