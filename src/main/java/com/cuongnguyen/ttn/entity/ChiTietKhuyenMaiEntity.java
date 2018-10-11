package com.cuongnguyen.ttn.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "chitietkhuyenmai")
public class ChiTietKhuyenMaiEntity {
    @Id
    @Column(name = "makhuyenmai")
    private int maKhuyenMai;

    @Column(name = "masanpham")
    private int maSanPham;

    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }
}
