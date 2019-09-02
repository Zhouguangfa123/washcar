package com.hope.springmvc.bean;

/**
 * HomeBean
 *
 * @author zhougf
 * @date 2019/08/16
 */
public class HomeBean {
    private String homeName;

    private int homeSize;

    private byte[] profilePicture;

    public HomeBean() {}

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public int getHomeSize() {
        return homeSize;
    }

    public void setHomeSize(int homeSize) {
        this.homeSize = homeSize;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }
}
