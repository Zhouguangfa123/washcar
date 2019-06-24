package com.hope.washcar.serviceimpl;

import com.hope.washcar.bean.MenuInfoBean;
import com.hope.washcar.dao.MenuInfoBeanMapper;
import com.hope.washcar.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * MenuInfoServiceImpl
 *
 * @author zhougf
 * @date 2019/6/24
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService {

    @Autowired
    private MenuInfoBeanMapper menuInfoBeanMapper;

    @Override
    public List<MenuInfoBean> listLevelOneMenuInfoByUserId(Integer userId) {
        return menuInfoBeanMapper.listLevelOneMenuInfoByUserId(userId);
    }
}
