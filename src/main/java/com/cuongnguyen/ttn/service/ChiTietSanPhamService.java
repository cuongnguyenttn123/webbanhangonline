package com.cuongnguyen.ttn.service;

import com.cuongnguyen.ttn.dao.ChiTietSanPhamDAO;
import com.cuongnguyen.ttn.entity.ChiTietSanPhamEntity;
import com.cuongnguyen.ttn.imp.ChiTietSanPhamImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiTietSanPhamService implements ChiTietSanPhamImp {
    @Autowired
    ChiTietSanPhamDAO chiTietSanPhamDAO;

    public List<ChiTietSanPhamEntity> getChiTietSanPham() {
        return chiTietSanPhamDAO.getChiTietSanPham();
    }
}
