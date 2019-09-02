/*
package com.hope.springmvc.controller;

import com.hope.springmvc.bean.HomeBean;
import com.hope.springmvc.exception.SpringMvcException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

*/
/**
 * HomeController
 *
 * @author zhougf
 * @date 2019/08/14
 *//*

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/getHome", method = GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/saveHome", method = POST)
    public String saveHome(HomeBean homeBean,
                           @RequestPart(value = "profilePicture", required = false) MultipartFile profilePicture) throws IOException {
        System.out.println("saveHome");
        profilePicture.transferTo(new File("D:/tmp/" + profilePicture.getOriginalFilename()));
        List<String> list = null;
        list.size();
        return "home";
    }

//    @ExceptionHandler(Exception.class)
//    public String homControllerException() {
//        return "error";
//    }

}
*/
