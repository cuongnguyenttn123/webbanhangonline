package com.cuongnguyen.ttn.entity;

import javax.persistence.*;

@Entity(name = "chitiethoadon")
public class ChiTietHoaDonEntity {
    @EmbeddedId
    ChiTietHoaDonId chiTietHoaDonId;
    @Column(name = "soluong")
    int soLuong;
    @Column(name = "giatien")
    int giaTien;

    public ChiTietHoaDonId getChiTietHoaDonId() {
        return chiTietHoaDonId;
    }

    public void setChiTietHoaDonId(ChiTietHoaDonId chiTietHoaDonId) {
        this.chiTietHoaDonId = chiTietHoaDonId;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }
}
