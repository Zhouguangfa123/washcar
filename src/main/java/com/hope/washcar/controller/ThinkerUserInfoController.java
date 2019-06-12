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
     * getUserInfoLit 获取用户详细信息
     *
     * @return Map
     */
    @RequestMapping("/getThinkerUserInfoLit")
    @ResponseBody
    public Map<String, ThinkerUserInfoBean> getUserInfoLit(HttpServletRequest request,ThinkerUserInfoBean thinkerUserInfoBean) {
        userInfoService.countCustomer();
        userInfoService.getUserInfoLit(thinkerUserInfoBean).get("userInfo").getCustomerUseing();
        System.out.println("xxxthinker-dev");
//        return userInfoService.getUserInfoLit(userInfoBean);
        return null;
    }



}
