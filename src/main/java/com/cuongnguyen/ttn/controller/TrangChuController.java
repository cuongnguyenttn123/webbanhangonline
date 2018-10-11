package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.*;
import com.cuongnguyen.ttn.service.ChiTietSanPhamService;
import com.cuongnguyen.ttn.service.HoaDonService;
import com.cuongnguyen.ttn.service.KhuyenMaiService;
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

    @Autowired
    ChiTietSanPhamService chiTietSanPhamService;

    @Autowired
    KhuyenMaiService khuyenMaiService;

    @Autowired
    HoaDonService hoaDonService;

    @GetMapping
    @Transactional
    public String getTrangChu(ModelMap modelMap){
        List<ChiTietKhuyenMaiEntity> khuyenMaiEntities = khuyenMaiService.getChiTiet();
        List<HoaDonEntity> list12 = hoaDonService.getHoaDon();
        List<ChiTietSanPhamEntity> chiTietSanPhamEntities = chiTietSanPhamService.getChiTietSanPham();
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
