package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.pojo.GioHang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@SessionAttributes("giohang")
@RequestMapping("/thanhtoan")
public class ThanhToanController {

    @GetMapping("/")
    public String getTrangThanhToan(HttpSession httpSession, ModelMap modelMap){
        List<GioHang> gioHangList = (List<GioHang>) httpSession.getAttribute("giohang");
        modelMap.addAttribute("giohangs", gioHangList);
        return "thanhtoan";
    }
}
