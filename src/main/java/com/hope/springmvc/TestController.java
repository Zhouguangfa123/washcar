/*
package com.hope.springmvc;

import com.hope.springmvc.bean.Spittle;
import com.hope.springmvc.controller.SpittleController;
import com.hope.springmvc.service.SpittleRepository;
import org.junit.Test;
import com.hope.springmvc.controller.HomeController;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

*/
/**
 * Test
 *
 * @author zhougf
 * @date 2019/08/14
 *//*

public class TestController {

    public void testSpitter() {
    }
    @Test
    public void testHomePage() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = standaloneSetup(homeController).build();
        mockMvc.perform(get("/home/getHome")).andExpect(view().name("home"));
   }

   public void shouldShowRecentSpittles() throws Exception {
       List<Spittle> expectedSpittles = createSpittleList(20);
       SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
       SpittleController controller = new SpittleController(mockRepository);
        MockMvc mockMvc = standaloneSetup(controller).setSingleView(new
                InternalResourceView("/WEB-INF/views/spittles.jsp")).build();
        mockMvc.perform(get("/spittles")).andExpect(view().name("spittles"));

   }

   private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<>(32);
        for (int i = 0; i < count; i++) {
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }
        return spittles;
   }



}
*/
