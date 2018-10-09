package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.entity.Login;
import com.cuongnguyen.ttn.entity.NhanVien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    SessionFactory sessionFactory;
    @GetMapping
    public String getPageLogin(){
        return "login";
    }
    @PostMapping
    @Transactional
    public String Login(@ModelAttribute Login login, ModelMap modelMap){
        if (login.getUserName().equals("cuongnguyenttn123")&&login.getPassWord().equals("123456")){

            Session session = sessionFactory.getCurrentSession().getSession();
            NhanVien xeko = (NhanVien) session.createQuery("FROM nhanvien WHERE id = 2").uniqueResult();
            xeko.setTuoi("18");
            session.update(xeko);
            return "/trangchu";
        }else {
            modelMap.addAttribute("error", "Username or Password not true");
            return "login";
        }
    }
}
