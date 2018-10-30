package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.pojo.GioHang;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/xuly")
    @ResponseBody
    public String xuLyDonHang(@RequestParam int maSanPham,@RequestParam String tenSanPham, @RequestParam int maSize,
                              @RequestParam String tenSize,@RequestParam int maMau, @RequestParam String tenMau,
                              @RequestParam int soLuong,@RequestParam int giaTien){
        System.out.println("cuong nguyen");
        GioHang gioHang = new GioHang(maSanPham, tenSanPham, maMau, tenMau, maSize, tenSize, giaTien, soLuong );
        System.out.println(gioHang);
        return "cuong";
    }
}
