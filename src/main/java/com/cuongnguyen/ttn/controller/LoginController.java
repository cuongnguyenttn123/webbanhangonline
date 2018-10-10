package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.NhanVienEntity;
import com.cuongnguyen.ttn.service.NhanVienService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@Controller
@RequestMapping("login/")
public class LoginController {
    @Autowired
    NhanVienService nhanVienService;


    @GetMapping
    public String getPageLogin(){
        return "login";
    }
    @PostMapping
    @Transactional
    public String Login(@RequestParam String tendangnhap, @RequestParam String matkhau , ModelMap modelMap){
        if (nhanVienService.checkLogin(tendangnhap, matkhau)){
            return "redirect:/trangchu";
        }else {
            modelMap.addAttribute("error", "username or password not true");
            return "login";
        }
    }
}
