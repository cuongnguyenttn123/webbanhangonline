package com.cuongnguyen.ttn.dao;


import com.cuongnguyen.ttn.entity.SanPhamEntity;
import com.cuongnguyen.ttn.imp.ChiTietSanPhamImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ChiTietSanPhamDAO implements ChiTietSanPhamImp {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional()
    public SanPhamEntity getChiTietSanPham(int id) {
        Session session = sessionFactory.getCurrentSession().getSession();
        String sql = "from sanpham where masanpham="+id;
        SanPhamEntity sanPham = (SanPhamEntity) session.createQuery(sql).uniqueResult();
        return sanPham;
    }
}
