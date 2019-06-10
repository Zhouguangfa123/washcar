package com.hope.washcar.controller;

import com.hope.washcar.bean.ThinkerUserInfoBean;
import com.hope.washcar.service.ThinkerUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ThinkerUserInfoController {
    @Autowired
    private ThinkerUserInfoService userInfoService;

    /**
     * login 登录
     *
     * @param  model 视图
     * @return ModelAndView
     */
    @RequestMapping("/login")
    public ModelAndView login(ModelAndView model) {
        model.setViewName("thinker");
//        DecimalFormat df = new DecimalFormat("0");
//        Double d = new Double("1.397545871E10");
//        System.out.println(df.format(d));
//        model.addObject("userInfo",userInfoService.getUserInfoLit(null).get("userInfo"));
        return model;
    }

    /**
     * getUserInfoLit 获取用户详细信息
     *
     * @return Map
     */
    @RequestMapping("/getUserInfoLit")
    @ResponseBody
    public Map<String, ThinkerUserInfoBean> getUserInfoLit(HttpServletRequest request,ThinkerUserInfoBean thinkerUserInfoBean) {
        userInfoService.countCustomer();
//        userInfoService.getUserInfoLit(userInfoBean).get("userInfo").getCollectionCount();
//        userInfoService.getUserInfoLit(userInfoBean).get("userInfo").getCustomerUseing();
//        return userInfoService.getUserInfoLit(userInfoBean);
        return null;
    }



}
