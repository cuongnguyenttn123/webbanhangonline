package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.SanPhamEntity;
import com.cuongnguyen.ttn.service.ChiTietSanPhamService;
import com.cuongnguyen.ttn.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/chitiet")
public class ChiTietController {
    @Autowired
    ChiTietSanPhamService chiTietSanPhamService;
    @GetMapping("/{masanpham}")
    public String Default(@PathVariable int masanpham , ModelMap modelMap){
        SanPhamEntity sanPhamEntity = chiTietSanPhamService.getChiTietSanPham(masanpham);
        modelMap.addAttribute("sanpham", sanPhamEntity);
        return "chitiet";
    }

}
