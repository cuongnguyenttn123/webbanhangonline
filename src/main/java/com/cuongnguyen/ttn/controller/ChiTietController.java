package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.NhanVien;
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
    @PostMapping
    public String getChiTietNhanVien(@ModelAttribute NhanVien nv, ModelMap modelMap){
        modelMap.addAttribute("nv", nv);
        return "chitiet";
    }

}
