package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-01.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public ModelAndView getIndexPage() {
        return new ModelAndView("index");
    }
}
