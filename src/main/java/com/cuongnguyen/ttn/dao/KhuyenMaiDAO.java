package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.ChiTietKhuyenMaiEntity;
import com.cuongnguyen.ttn.entity.KhuyenMaiEntity;
import com.cuongnguyen.ttn.imp.KhuyenMaiImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class KhuyenMaiDAO  implements KhuyenMaiImp {
    @Autowired
    SessionFactory sessionFactory;

    public List<KhuyenMaiEntity> getKhuyenMai() {
        Session session = sessionFactory.getCurrentSession().getSession();
        List<KhuyenMaiEntity> khuyenMaiEntities = session.createQuery(
                "from khuyenmai").getResultList();
        return khuyenMaiEntities;
    }

    public List<ChiTietKhuyenMaiEntity> getChiTietKhuyenMai(){
        Session session = sessionFactory.getCurrentSession().getSession();
        List<ChiTietKhuyenMaiEntity> khuyenMaiEntities = session.createQuery(
                "from chitietkhuyenmai").getResultList();
        return khuyenMaiEntities;
    }
}
