package com.hope.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * HomeController
 *
         * @author zhougf
        * @date 2019/08/14
        */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/getHome", method=GET)
    public String home() {
        return "home";
    }
}
