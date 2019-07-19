package com.hope.washcar.controller;

import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.common.JsonParse;
import com.hope.washcar.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * DataTableController
 *
 * @author zhougf
 * @date 2019/7/19
 */
@Controller
public class DataTableController {

    @Autowired
    private UserInfoService userInfoService;

    /**
     * getUserInfoLit 获取用户详细信息
     *
     * @return Map
     */
    @RequestMapping("/listUserInfosForData")
    @ResponseBody
    public String listUserInfosForData() {
        String json = JsonParse.GSON.toJson(userInfoService.getUserInfoList(null));
        System.out.println(json);
        return json;
    }
}
