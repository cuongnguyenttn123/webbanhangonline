package com.cuongnguyen.ttn.controller;

import com.cuongnguyen.ttn.pojo.GioHang;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api")
@SessionAttributes("giohang")
public class ApiController {
    @GetMapping("/xuly")
    @ResponseBody
    public String xuLyDonHang(@RequestParam int maSanPham, @RequestParam String tenSanPham, @RequestParam int maSize,
                              @RequestParam String tenSize, @RequestParam int maMau, @RequestParam String tenMau,
                              @RequestParam int soLuong, @RequestParam int giaTien, HttpSession httpSession){
        GioHang gioHang = new GioHang(maSanPham, tenSanPham, maMau, tenMau, maSize, tenSize, giaTien, 1 );
        if (null == httpSession.getAttribute("giohang")){
            List<GioHang> gioHangList = new ArrayList<GioHang>();
            gioHangList.add(gioHang);
            httpSession.setAttribute("giohang", gioHangList);
        }else{
            List<GioHang> gioHangList = (List<GioHang>) httpSession.getAttribute("giohang");
            int index = kiemTraGioHang(httpSession, gioHang);
            if (index==-1){
                gioHangList.add(gioHang);
            }else {
                int i=gioHangList.get(index).getSoLuong();
                gioHangList.get(index).setSoLuong(i+1);
            }
        }

        return "cuong";
    }


    public static int kiemTraGioHang(HttpSession httpSession, GioHang gioHang){
        List<GioHang> gioHangList = (List<GioHang>) httpSession.getAttribute("giohang");
        for (int x = 0; x<gioHangList.size(); x++){
            if (gioHangList.get(x).getMaSanPham()==gioHang.getMaSanPham()&& gioHangList.get(x).getMaMau()==gioHang.getMaMau()
            &&gioHangList.get(x).getMaSize()==gioHang.getMaSize()){
                return x;
            }
        }
        return -1;
    };

    @GetMapping("/kiemtra")
    public String testGioHang(HttpSession httpSession){
        List<GioHang> gioHangList = (List<GioHang>) httpSession.getAttribute("giohang");
        for (GioHang x : gioHangList){
            System.out.println(x);
        }
        return "cuongnguyen";
    }

}
