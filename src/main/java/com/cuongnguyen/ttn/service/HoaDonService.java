package com.cuongnguyen.ttn.service;

import com.cuongnguyen.ttn.dao.HoaDonDAO;
import com.cuongnguyen.ttn.entity.HoaDonEntity;
import com.cuongnguyen.ttn.imp.HoaDonImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonService  implements HoaDonImp {
    @Autowired
    HoaDonDAO hoaDonDAO;

    public List<HoaDonEntity> getHoaDon() {
        return hoaDonDAO.getHoaDon();
    }
}
