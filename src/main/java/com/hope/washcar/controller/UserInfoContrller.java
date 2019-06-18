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

import java.util.List;

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
    @ResponseBody
    public ModelAndView login(ModelAndView model, UserInfoBean user) {
        List<UserInfoBean> userList = userInfoService.checkUser(user);
        if (userList.size() != 1) {
            model.addObject("success",false);
            model.addObject("message","用户或密码错误");
            model.setViewName("error");
            return  model;
        }
        model.addObject("success",true);
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
