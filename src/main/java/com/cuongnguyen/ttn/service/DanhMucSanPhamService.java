package com.cuongnguyen.ttn.service;

import com.cuongnguyen.ttn.dao.DanhMucSanPhamDAO;
import com.cuongnguyen.ttn.entity.DanhMucSPEntity;
import com.cuongnguyen.ttn.entity.DanhMucSanPhamEntity;
import com.cuongnguyen.ttn.imp.DanhMucSanPhamImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class DanhMucSanPhamService implements DanhMucSanPhamImp {
    @Autowired
    DanhMucSanPhamDAO danhMucSanPhamDAO;


    public DanhMucSPEntity getDanhMucSanPhamById(int id) {
        return danhMucSanPhamDAO.getDanhMucSanPhamById(id);
    }

    public List<DanhMucSanPhamEntity> getListDM() {
        return null;
    }
}
