package com.hope.washcar.controller;

import com.google.gson.JsonObject;
import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.common.JsonParse;
import com.hope.washcar.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

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

    /**
     * login ��¼
     *
     * @param  model ��ͼ
     * @return ModelAndView
     */
    @RequestMapping("/login")
    public ModelAndView login(ModelAndView model) {
        model.setViewName("userInfoList");
        return model;
    }

    /**
     * getUserInfoLit ��ȡ�û���ϸ��Ϣ
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
