package com.cuongnguyen.ttn.service;

import com.cuongnguyen.ttn.dao.NhanVienDAO;
import com.cuongnguyen.ttn.imp.NhanVienImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienService implements NhanVienImp {

    @Autowired
    NhanVienDAO nhanVienDAO;

    public boolean checkLogin(String tendangnhap, String matkhau) {
        return nhanVienDAO.checkLogin(tendangnhap, matkhau);
    }
}
