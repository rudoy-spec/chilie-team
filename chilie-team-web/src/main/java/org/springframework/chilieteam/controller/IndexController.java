package org.springframework.chilieteam.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexController {

    @GetMapping({"", "/", "/index", "/index.html"})
    public String index() {
        return "index";
    }


    @RequestMapping("/oups")
    public String oupsHandler() {
        return "notimplemented";
    }
}
