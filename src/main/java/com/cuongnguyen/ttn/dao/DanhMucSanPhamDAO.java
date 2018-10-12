package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.DanhMucSPEntity;
import com.cuongnguyen.ttn.imp.DanhMucSanPhamImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DanhMucSanPhamDAO implements DanhMucSanPhamImp {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public DanhMucSPEntity getDanhMucSanPhamById(int id) {
        Session session = sessionFactory.getCurrentSession().getSession();
        DanhMucSPEntity danhMucSanPhamEntity = (DanhMucSPEntity) session.createQuery(
                "from danhmucsanpham where madanhmucsanpham = 1").uniqueResult();
        return danhMucSanPhamEntity;
    }

    public List<DanhMucSPEntity> getListDM() {
        return null;
    }
}
