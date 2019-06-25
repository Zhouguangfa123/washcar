package com.hope.washcar.controller;

import com.hope.washcar.bean.MenuInfoBean;
import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.common.JsonParse;
import com.hope.washcar.common.RedisUtil;
import com.hope.washcar.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
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
     * login 登录
     *
     * @param  session 浏览器session
     * @param  user 登录用户
     * @return ModelAndView
     */
    @RequestMapping("/login")
    @ResponseBody
    public Map<String, Object> login(HttpSession session, UserInfoBean user) {
        Map<String, Object> responseMap = new HashMap<String, Object>(8);
        /**校验用户是否存在*/
        List<UserInfoBean> userList = userInfoService.checkUser(new UserInfoBean(user.getUserName(),null));
        if (userList.size() == 0) {
            responseMap.put("success",false);
            responseMap.put("message","用户不存在");
            return responseMap;
        }

        /**校验用户密码*/
        userList = userInfoService.checkUser(user);
        if (userList.size() != 1) {
            responseMap.put("success",false);
            responseMap.put("message","密码错误");
            return responseMap;
        }
        responseMap.put("success",true);
        //放入session
        session.setAttribute("loginUserInfo", userList.get(0));
        return responseMap;
    }

    /**
     * getUserInfoLit 获取用户详细信息
     *
     * @return Map
     */
    @RequestMapping("/listUserInfos")
    @ResponseBody
    public String getUserInfoLit(UserInfoBean user) {
        System.out.println(user);
        String jsonStr = JsonParse.GSON.toJson(userInfoService.getUserInfoList(user));
        return jsonStr;
    }

    /**
     * getUserInfoLit 获取用户详细信息
     * @return Map
     */
    @RequestMapping("/userInfoList")
    public String userInfoList() {
        return "userInfoList";
    }
}
