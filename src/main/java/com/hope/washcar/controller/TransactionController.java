package com.hope.washcar.controller;

import com.hope.washcar.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TransactionController �������Controller��ҵ���߼��޹�
 *
 * @author zhougf
 * @date 2019/6/28
 */
@Controller
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    /**
     *  updateUser ����user��Ϣ
     *
     * @return String
     **/
    @RequestMapping("/transaction")
    @ResponseBody
    public String updateUser() {
        transactionService.updateUser();
        return "true";
    }
}
