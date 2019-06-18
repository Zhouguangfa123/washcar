package com.hope.washcar.controller;

import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.common.JsonParse;
import com.hope.washcar.common.RedisUtil;
import com.hope.washcar.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
    public Map<String, Object> login(ModelAndView model, UserInfoBean user) {
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
        responseMap.put("userInfo",userList.get(0));
        return responseMap;
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
