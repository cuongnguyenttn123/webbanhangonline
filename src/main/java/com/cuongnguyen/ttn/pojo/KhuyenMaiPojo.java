package com.cuongnguyen.ttn.pojo;

import java.util.Set;

public class KhuyenMaiPojo {
    private int maKhuyenMai;
    private int giagiam;
    private String tenKhuyenMai;
    private String thoiGianBatDau;
    private String thoiGianKetThuc;
    private String moTa;
    private String hinhKhuyenMai;
    private Set<SanPhamPojo> dsSanPham;


    public Set<SanPhamPojo> getDsSanPham() {
        return dsSanPham;
    }

    public void setDsSanPham(Set<SanPhamPojo> dsSanPham) {
        this.dsSanPham = dsSanPham;
    }

    public KhuyenMaiPojo() {
    }


    public int getMaKhuyenMai() {
        return maKhuyenMai;
    }

    public void setMaKhuyenMai(int maKhuyenMai) {
        this.maKhuyenMai = maKhuyenMai;
    }

    public int getGiagiam() {
        return giagiam;
    }

    public void setGiagiam(int giagiam) {
        this.giagiam = giagiam;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getHinhKhuyenMai() {
        return hinhKhuyenMai;
    }

    public void setHinhKhuyenMai(String hinhKhuyenMai) {
        this.hinhKhuyenMai = hinhKhuyenMai;
    }
}
