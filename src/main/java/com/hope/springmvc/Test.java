package com.hope.springmvc;

import com.hope.springmvc.controller.HomeController;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Test
 *
 * @author zhougf
 * @date 2019/08/14
 */
public class Test {
    @org.junit.Test
    public void testHomePage() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/home1")).andExpect(view().name("home"));
   }

}
