package com.cuongnguyen.ttn.imp;

import com.cuongnguyen.ttn.entity.DanhMucSanPhamEntity;

import java.util.List;

public interface DanhMucSanPhamImp {
    DanhMucSanPhamEntity getDanhMucSanPhamById(int id);
    List<DanhMucSanPhamEntity> getListDM();
}
