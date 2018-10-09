package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.NhanVien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@Controller
@RequestMapping("/trangchu")
public class TrangChuController {
    @Autowired
    SessionFactory sessionFactory;

    @GetMapping
    @Transactional
    public String getTrangChu(){
        return "trangchu";
    }

    @PostMapping
    @Transactional
    public String addTrangChu(){
        Session session = sessionFactory.getCurrentSession();
        String sql= "FROM nhanvien";
        List<NhanVien> list = session.createQuery(sql).getResultList();
        for (NhanVien nhanVien : list){
            System.out.println(nhanVien.getName());
        }
        return "trangchu";
    }



}
