package com.cuongnguyen.ttn.imp;

import com.cuongnguyen.ttn.entity.SanPhamEntity;

import java.util.List;

public interface SanPhamImp{
    List<SanPhamEntity> getListSanPham(int sobatdau);
    SanPhamEntity getSanPhamById(int id);
}
