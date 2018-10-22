package com.cuongnguyen.ttn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uploadsanpham")
public class UploadSanPhamController {
    @GetMapping
    public String getUpload(){
        return "uploadmotsanphamdemo";
    }

}
