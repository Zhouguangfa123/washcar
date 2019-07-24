package com.hope.annotation.bean;

/**
 * PropertyTest 测试成员变量属性 private ,protected,public作用范围
 *
 * @author zhougf
 * @date 2019/7/23
 */
public class PropertyTest {

    private String privateName = "privateNamess";

    protected String protectedName = "protectedName";

    public String publicName = "publicName";

    private Boolean aBoolean = true;

    private String getPrivateName() {
        return privateName;
    }

    private void setPrivateName(String privateName) {
        this.privateName = privateName;
    }

    protected String getProtectedName() {
        return protectedName;
    }

    protected void setProtectedName(String protectedName) {
        this.protectedName = protectedName;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public Boolean getaBoolean() {
        return aBoolean;
    }

    public void setaBoolean(Boolean aBoolean) {
        this.aBoolean = aBoolean;
    }

    private void privateMethod() {
        System.out.println("this is privateMethod");
    }

    public void publicMethod() {
        System.out.println("this is publicMethod");
    }
}
