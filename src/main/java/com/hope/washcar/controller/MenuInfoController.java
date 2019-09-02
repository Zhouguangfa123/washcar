package com.hope.washcar.controller;

import com.hope.washcar.bean.MenuInfoBean;
import com.hope.washcar.bean.UserInfoBean;
import com.hope.washcar.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MenuInfoController
 *
 * @author zhougf
 * @date 2019/6/24
 */
@Controller
public class MenuInfoController {

    private MenuInfoService menuInfoService;

    @Autowired
    private MenuInfoController (MenuInfoService menuInfoService) {
        this.menuInfoService = menuInfoService;
    }

    /**
     * getLeftMenu 获取左部菜单的数据
     *
     * @param session 容器保存的session信息
     * @return Map
     */
    @RequestMapping("listLevelOneMenuInfoByUserId")
    @ResponseBody
    public Map<String, Object> listLevelOneMenuInfoByUserId(HttpSession session) {
        Map<String, Object> responseMap = new HashMap<String, Object>(4);
        responseMap.put("success",true);
        // 获取登录信息的session中关于登录的用户的信息
        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("loginUserInfo");
        if (userInfoBean == null) {
            responseMap.put("success", false);
            responseMap.put("message", "无登录信息");
            return responseMap;
        }
        List<MenuInfoBean> menuInfoBeanList = menuInfoService.listLevelOneMenuInfoByUserId(userInfoBean.getUserId());
        // 判断查到的数据是否为空
        if (menuInfoBeanList.size() == 0) {
            responseMap.put("success", false);
            responseMap.put("message", "该用户下无菜单信息");
            return responseMap;
        }
        responseMap.put("menuInfoBeanList", menuInfoBeanList);
        return responseMap;
    }

    /**
     * showMain 首次登陆显示页面
     *
     * @return String
     */
    @RequestMapping("showMain")
    public String showMain() {
        // 返回视图
        return "redirect:/welcome.jsp";
    }
}
