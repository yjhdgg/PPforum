package com.anan.ppforum.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @创建人 anan
 * @创建时间 2022/8/6
 * @描述
 */

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
        return "greeting";
    }

}
