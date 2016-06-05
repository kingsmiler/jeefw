package org.xman.jeefw.web.controller;

import org.springframework.stereotype.Controller;
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
    public ModelAndView root(ModelMap model) {
        ModelAndView view = new ModelAndView("/welcome");

        String message = "Hello, SpringMVC + Beetl";
        view.addObject("message", message);
        view.addObject("time", new Date());
        view.addObject("message", "Hello Beetl!");

        return view;
    }

}
