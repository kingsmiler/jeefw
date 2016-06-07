package org.xman.jeefw.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping
    public String root(Model model) {
        String message = "operations:";
        model.addAttribute("message", message);

        return "/home";
    }

    @RequestMapping("welcome")
    public ModelAndView welcome(ModelMap model) {
        ModelAndView view = new ModelAndView("/welcome");

        String message = "Hello, SpringMVC + Beetl";
        view.addObject("message", message);
        view.addObject("time", new Date());
        view.addObject("message", message);

        return view;
    }

}
