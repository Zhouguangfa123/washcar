/*
package com.hope.springmvc.controller;

import com.hope.springmvc.service.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

*/
/**
 * SpittleController
 *
 * @author zhougf
 * @date 2019/08/15
 *//*

@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    @RequestMapping(method= RequestMethod.GET)
    public String spittles(RedirectAttributes model) {
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        model.addAttribute("ss",spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        model.addFlashAttribute("xx",spittleRepository);
        return "redirect:/spittles";
    }


}
*/
