package cn.edu.jit.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用于数据展示
 *
 * @author: xutiankai
 * @date: 12/1/2021 11:40 AM
 * @version: 1.0
 */
@Controller
public class ClientController {
    @RequestMapping(value = "/")
    public ModelAndView page() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
