package com.hope.washcar.bean;

import java.math.BigDecimal;

/**
 * ThinkerUserInfoBean
 *
 * @author zhougf
 * @date 2019/05/30
 */
public class ThinkerUserInfoBean {

    private long id;

    /**收款总额*/
    private BigDecimal collectionCount;

    /**使用客户*/
    private long customerUseing;

    /**客户总量*/
    private long customerCount;

    private String hostDate;

    private String submerName;

    public ThinkerUserInfoBean() {}

    public String getHostDate() {
        return hostDate;
    }

    public void setHostDate(String hostDate) {
        this.hostDate = hostDate;
    }

    public String getSubmerName() {
        return submerName;
    }

    public void setSubmerName(String submerName) {
        this.submerName = submerName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCollectionCount(BigDecimal collectionCount) {
        this.collectionCount = collectionCount;
    }

    public void setCustomerUseing(long customerUseing) {
        this.customerUseing = customerUseing;
    }

    public void setCustomerCount(long customerCount) {
        this.customerCount = customerCount;
    }

    public BigDecimal getCollectionCount() {
        return collectionCount;
    }

    public long getCustomerUseing() {
        return customerUseing;
    }

    public long getCustomerCount() {
        return customerCount;
    }
}
