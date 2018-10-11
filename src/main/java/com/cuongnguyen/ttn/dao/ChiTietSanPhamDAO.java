package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.ChiTietSanPhamEntity;
import com.cuongnguyen.ttn.imp.ChiTietSanPhamImp;
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
public class ChiTietSanPhamDAO implements ChiTietSanPhamImp {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<ChiTietSanPhamEntity> getChiTietSanPham() {
        Session session = sessionFactory.getCurrentSession().getSession();
        List<ChiTietSanPhamEntity> chiTietSanPhamEntities = session.createQuery(
                "from chitietsanpham where 1=1").getResultList();
        return chiTietSanPhamEntities;
    }
}
