package org.xman.jeefw.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
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

    @Autowired
    private MessageSource messageSource;

    @RequestMapping
    public ModelAndView root(ModelMap model) {
        ModelAndView view = new ModelAndView("/welcome");

        view.addObject("time", new Date());
        view.addObject("message", "Hello Beetl!");

        String submit = messageSource.getMessage("submit", null, LocaleContextHolder.getLocale());

        model.addAttribute("submit", submit);

        return view;
    }
}
