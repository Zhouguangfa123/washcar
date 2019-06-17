package com.hope.washcar.controller;

import com.google.gson.JsonObject;
import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.common.JsonParse;
import com.hope.washcar.common.RedisUtil;
import com.hope.washcar.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * UserInfoContrller
 *
 * @author zhougf
 * @date 2019/6/11
 */
@Controller
public class UserInfoContrller {

    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private RedisUtil redisUtil;

    /**
     * login 登录
     *
     * @param  model 视图
     * @return ModelAndView
     */
    @RequestMapping("/login")
    public ModelAndView login(ModelAndView model) {
        redisUtil.set("y","y");
        System.out.println(redisUtil.get("y"));
        model.setViewName("userInfoList");
        return model;
    }

    /**
     * getUserInfoLit 获取用户详细信息
     *
     * @return Map
     */
    @RequestMapping("/getUserInfoLit")
    @ResponseBody
    public String getUserInfoLit(UserInfoBean user) {
        System.out.println(user);
        String jsonStr = JsonParse.GSON.toJson(userInfoService.getUserInfoList(user));
        return jsonStr;
    }

}
