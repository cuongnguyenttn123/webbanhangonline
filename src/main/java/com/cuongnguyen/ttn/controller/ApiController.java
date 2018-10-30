package com.cuongnguyen.ttn.controller;
import com.cuongnguyen.ttn.pojo.GioHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
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
    }

    @Autowired
    ServletContext context;
    @PostMapping("/xulyupload")
    @ResponseBody
    public String upLoadHinhAnh(MultipartHttpServletRequest request){
        String path_file_save = context.getRealPath("/resources/Image/sanpham");
        Iterator<String> listName = request.getFileNames();
        MultipartFile mpf = request.getFile(listName.next());
        File file_name = new File(path_file_save + mpf.getOriginalFilename());
        System.out.println(file_name);
        try {
            mpf.transferTo(file_name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "cuongnguyen";
    }

    @PostMapping("/cuongnguyen")
    @ResponseBody
    public String getTrangChu(@RequestParam String x){
        System.out.println(x);
        return "trangchu";
    }




}
