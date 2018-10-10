package com.cuongnguyen.ttn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
    @GetMapping
    public String Default(){
        return "chitiet";
    }

}
