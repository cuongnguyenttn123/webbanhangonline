package com.cuongnguyen.ttn.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MauSanPhamDAO {
    @Autowired
    SessionFactory sessionFactory;
}
