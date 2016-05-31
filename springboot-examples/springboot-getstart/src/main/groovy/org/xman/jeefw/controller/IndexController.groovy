package org.xman.jeefw.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping('/')
class IndexController {

    @RequestMapping
    String root() {
        "redirect:index.html";
    }

    @RequestMapping("index.html")
    String index(ModelMap model) {
        String message = "Hello, Spring Boot + Thymeleaf 3"
        model.addAttribute("message", message)

        "index";
    }
}
