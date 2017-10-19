package ru.danimanu.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public ModelAndView handleRequest() {

        ModelAndView modelAndView = new ModelAndView("Hello");

        MessageDAO dao = new MessageDAO();
        modelAndView.addObject("messages", dao.findAllMessages());

        return modelAndView;

    }
}
