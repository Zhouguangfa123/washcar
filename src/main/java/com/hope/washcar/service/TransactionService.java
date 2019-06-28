package com.hope.washcar.service;

/**
 * TransactionService
 *
 * @author zhougf
 * @date 2019/6/28
 */
public interface TransactionService {
    /**
     *  updateUser 只针对事务测试与业务无关
     * @return  int
     * */
    int updateUser();

    /**
     *  createException 只针对事务测试与业务无关
     * @return  int
     * */
    void createException();
}
