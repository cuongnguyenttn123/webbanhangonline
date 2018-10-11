package com.cuongnguyen.ttn.imp;

import com.cuongnguyen.ttn.entity.DanhMucSanPhamEntity;

import java.util.List;

public interface DanhMucSanPhamIml {
    DanhMucSanPhamEntity getDanhMucSanPhamById(int id);
    List<DanhMucSanPhamEntity> getListDM();
}
