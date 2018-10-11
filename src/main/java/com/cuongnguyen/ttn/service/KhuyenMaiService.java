package com.cuongnguyen.ttn.service;

import com.cuongnguyen.ttn.dao.KhuyenMaiDAO;
import com.cuongnguyen.ttn.entity.ChiTietKhuyenMaiEntity;
import com.cuongnguyen.ttn.entity.KhuyenMaiEntity;
import com.cuongnguyen.ttn.imp.KhuyenMaiImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhuyenMaiService implements KhuyenMaiImp {
    @Autowired
    KhuyenMaiDAO khuyenMaiDAO;


    public List<KhuyenMaiEntity> getKhuyenMai() {
        return khuyenMaiDAO.getKhuyenMai();
    }

    public List<ChiTietKhuyenMaiEntity> getChiTiet(){
        return khuyenMaiDAO.getChiTietKhuyenMai();
    }
}
