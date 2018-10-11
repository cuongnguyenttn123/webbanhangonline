package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.SanPhamEntity;
import com.cuongnguyen.ttn.service.SanPhamService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/")
public class TrangChuController {
    @Autowired
    SessionFactory sessionFactory;

    @Autowired
    SanPhamService sanPhamService;

    @GetMapping
    @Transactional
    public String getTrangChu(ModelMap modelMap){
        List<SanPhamEntity> list = sanPhamService.getListSanPham(0);
        modelMap.addAttribute("list", list);
        return "trangchu";
    }

    @PostMapping
    @Transactional
    public String addTrangChu(){

        return "trangchu";
    }



}
