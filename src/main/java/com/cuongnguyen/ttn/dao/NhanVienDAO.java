package com.cuongnguyen.ttn.dao;

import com.cuongnguyen.ttn.entity.NhanVienEntity;
import com.cuongnguyen.ttn.imp.NhanVienImp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class NhanVienDAO implements NhanVienImp {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public boolean checkLogin(String tendangnhap, String matkhau) {
        Session session = sessionFactory.getCurrentSession().getSession();

        try {
            NhanVienEntity nhanVienEntity = (NhanVienEntity) session.createQuery("from nhanvien where tendangnhap = '" +
                    tendangnhap + "' and matkhau = '" + matkhau + "'").uniqueResult();
            if (nhanVienEntity.getTenDangNhap()!=null) {
                System.out.println(nhanVienEntity.getHoTen() + "\t" + nhanVienEntity.getEmail());
                return true;
            }
        }catch (Exception e){
            return false;
        }
        return false;
    }
}
