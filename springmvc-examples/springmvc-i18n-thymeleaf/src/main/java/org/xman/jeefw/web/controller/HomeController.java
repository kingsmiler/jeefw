package org.xman.jeefw.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping
    public String root() {
        return "redirect:index.html";
    }

    @RequestMapping(path = {"index.html"}, method = RequestMethod.GET)
    public String index(ModelMap model) {
        String message = "Hello, Spring Boot + Thymeleaf 3";

        model.addAttribute("message", message);
        String submit = messageSource.getMessage("submit", null, LocaleContextHolder.getLocale());

        model.addAttribute("submit", submit);

        return "index";
    }

}
