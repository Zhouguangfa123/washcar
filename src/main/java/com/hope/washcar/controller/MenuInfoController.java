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
     * getLeftMenu ��ȡ�󲿲˵�������
     *
     * @param session ���������session��Ϣ
     * @return Map
     */
    @RequestMapping("listLevelOneMenuInfoByUserId")
    @ResponseBody
    public Map<String, Object> listLevelOneMenuInfoByUserId(HttpSession session) {
        Map<String, Object> responseMap = new HashMap<String, Object>(4);
        responseMap.put("success",true);
        // ��ȡ��¼��Ϣ��session�й��ڵ�¼���û�����Ϣ
        UserInfoBean userInfoBean = (UserInfoBean) session.getAttribute("loginUserInfo");
        if (userInfoBean == null) {
            responseMap.put("success", false);
            responseMap.put("message", "�޵�¼��Ϣ");
            return responseMap;
        }
        List<MenuInfoBean> menuInfoBeanList = menuInfoService.listLevelOneMenuInfoByUserId(userInfoBean.getUserId());
        // �жϲ鵽�������Ƿ�Ϊ��
        if (menuInfoBeanList.size() == 0) {
            responseMap.put("success", false);
            responseMap.put("message", "���û����޲˵���Ϣ");
            return responseMap;
        }
        responseMap.put("menuInfoBeanList", menuInfoBeanList);
        return responseMap;
    }

    /**
     * showMain �״ε�½��ʾҳ��
     *
     * @return String
     */
    @RequestMapping("showMain")
    public String showMain() {
        // ������ͼ
        return "redirect:/welcome.jsp";
    }
}
