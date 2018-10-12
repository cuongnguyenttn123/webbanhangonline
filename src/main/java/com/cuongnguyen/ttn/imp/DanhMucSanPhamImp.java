package com.cuongnguyen.ttn.imp;

import com.cuongnguyen.ttn.entity.DanhMucSPEntity;

import java.util.List;

public interface DanhMucSanPhamImp {
    DanhMucSPEntity getDanhMucSanPhamById(int id);
    List<DanhMucSPEntity> getListDM();
}
