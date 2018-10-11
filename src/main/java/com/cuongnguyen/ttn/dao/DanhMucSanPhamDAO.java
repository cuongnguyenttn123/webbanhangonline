package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.DanhMucSanPhamEntity;
import com.cuongnguyen.ttn.imp.DanhMucSanPhamImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public class DanhMucSanPhamDAO implements DanhMucSanPhamImp {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public DanhMucSanPhamEntity getDanhMucSanPhamById(int id) {
        Session session = sessionFactory.getCurrentSession().getSession();
        DanhMucSanPhamEntity danhMucSanPhamEntity = (DanhMucSanPhamEntity) session.createQuery("from danhmucsanpham where madanhmucsanpham = 1").uniqueResult();
        return danhMucSanPhamEntity;
    }

    public List<DanhMucSanPhamEntity> getListDM() {
        return null;
    }
}
