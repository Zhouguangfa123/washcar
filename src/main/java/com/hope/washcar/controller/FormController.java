package com.hope.washcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * FormController
 *
 * @author zhougf
 * @date 2019/6/18
 */
@Controller
public class FormController {
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        // ¶¯Ì¬Ìø×ªÒ³Ãæ
        return formName;
    }
}
