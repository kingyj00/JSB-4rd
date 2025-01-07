package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/one")
    @ResponseBody
    public String index() {
        return "What up SpringBoots? I'm gonna beat u down.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}