package com.jason.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Jason, Moon
 * @since 2017-03-02.
 */
@Controller
public class TableController {

    @GetMapping("tables")
    public ModelAndView getTablePage() {
        return new ModelAndView("tables");
    }
}
