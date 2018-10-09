package com.cuongnguyen.ttn.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "sanpham")
public class SanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSanPham;
    private String  tenSanPham;
    private int giaTien;
    private String moTaSanPham;
    private String hinhSanPham;
    @OneToOne
    @JoinColumn(name = "madanhmuc")
    private DanhMucSanPhamEntity danhMucSanPham;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "masanpham")
    Set<ChiTietSanPhamEntity> danhSachChiTietSanPham;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "chitietsanpham",joinColumns = {@JoinColumn(name = "maSanPham",
            referencedColumnName = "masanpham")},
            inverseJoinColumns = {@JoinColumn(name = "maKhuyenMai", referencedColumnName = "makhuyenmai")})
    Set<KhuyenMaiEntity> danhSachKhuyenMai;

    public Set<KhuyenMaiEntity> getDanhSachKhuyenMai() {
        return danhSachKhuyenMai;
    }

    public void setDanhSachKhuyenMai(Set<KhuyenMaiEntity> danhSachKhuyenMai) {
        this.danhSachKhuyenMai = danhSachKhuyenMai;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public String getHinhSanPham() {
        return hinhSanPham;
    }

    public void setHinhSanPham(String hinhSanPham) {
        this.hinhSanPham = hinhSanPham;
    }

    public DanhMucSanPhamEntity getDanhMucSanPham() {
        return danhMucSanPham;
    }

    public void setDanhMucSanPham(DanhMucSanPhamEntity danhMucSanPham) {
        this.danhMucSanPham = danhMucSanPham;
    }

    public Set<ChiTietSanPhamEntity> getDanhSachChiTietSanPham() {
        return danhSachChiTietSanPham;
    }

    public void setDanhSachChiTietSanPham(Set<ChiTietSanPhamEntity> danhSachChiTietSanPham) {
        this.danhSachChiTietSanPham = danhSachChiTietSanPham;
    }
}
