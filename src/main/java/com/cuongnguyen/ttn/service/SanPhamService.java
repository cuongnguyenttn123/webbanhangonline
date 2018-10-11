package com.cuongnguyen.ttn.service;

import com.cuongnguyen.ttn.dao.SanPhamDAO;
import com.cuongnguyen.ttn.entity.SanPhamEntity;
import com.cuongnguyen.ttn.imp.SanPhamImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SanPhamService implements SanPhamImp {
    @Autowired
    SanPhamDAO sanPhamDAO;

    public List<SanPhamEntity> getListSanPham(int sobatdau) {
        return sanPhamDAO.getListSanPham(sobatdau);
    }

    public SanPhamEntity getSanPhamById(int id) {
        return sanPhamDAO.getSanPhamById(id);
    }
}
