package com.hope.washcar.bean;

import java.util.Date;

/**
 * UserInfoBean
 *
 * @author zhougf
 * @date 2019/05/29
 */
public class MenuInfoBean {
    private Integer menuId;

    private String menuUrl;

    private Integer menuPid;

    private Integer menuOrder;

    private String menuShow;

    private Date createTime;

    private Date updateTime;

    private String menuName;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getMenuPid() {
        return menuPid;
    }

    public void setMenuPid(Integer menuPid) {
        this.menuPid = menuPid;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getMenuShow() {
        return menuShow;
    }

    public void setMenuShow(String menuShow) {
        this.menuShow = menuShow;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}