package com.hope.washcar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserInfoContrller
 *
 * @author zhougf
 * @date 2019/6/11
 */
@Controller
public class UserInfoContrller {
    /**
     * login µÇÂ¼
     *
     * @param  model ÊÓÍ¼
     * @return ModelAndView
     */
    @RequestMapping("/login")
    public ModelAndView login(ModelAndView model) {
        model.setViewName("userInfoList");
        return model;
    }

}
