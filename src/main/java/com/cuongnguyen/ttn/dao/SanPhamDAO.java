package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.SanPhamEntity;
import com.cuongnguyen.ttn.imp.SanPhamImp;
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
public class SanPhamDAO  implements SanPhamImp {
    @Autowired
    SessionFactory sessionFactory;
    @Transactional
    public List<SanPhamEntity> getListSanPham(int sobatdau) {
        Session session = sessionFactory.getCurrentSession().getSession();
        List<SanPhamEntity> sanPhamEntities =(List<SanPhamEntity>) session.createQuery("from sanpham").setFirstResult(sobatdau).setMaxResults(20).getResultList();
        return sanPhamEntities;
    }
    @Transactional
    public SanPhamEntity getSanPhamById(int id) {
        Session session = sessionFactory.getCurrentSession().getSession();
        SanPhamEntity sanPhamEntity = (SanPhamEntity) session.createQuery("from sanpham where masanpham = '"+id+"'").uniqueResult();
        return sanPhamEntity;
    }

}
