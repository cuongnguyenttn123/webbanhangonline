package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.HoaDonEntity;
import com.cuongnguyen.ttn.imp.HoaDonImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class HoaDonDAO implements HoaDonImp {
    @Autowired
    SessionFactory sessionFactory;

    public List<HoaDonEntity> getHoaDon() {
        Session session = sessionFactory.getCurrentSession().getSession();
        List<HoaDonEntity> list = (List<HoaDonEntity>) session.createQuery(
                "from hoadon").getResultList();
        return list;
    }
}
