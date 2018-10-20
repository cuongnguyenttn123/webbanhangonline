package com.cuongnguyen.ttn.pojo;

public class GioHang {
    private int maSanPham;
    private String tenSanPham;
    private int maMau;
    private String tenMau;
    private int maSize;
    private String tenSize;
    private int giaTien;
    private int soLuong;

    public GioHang(int maSanPham, String tenSanPham, int maMau, String tenMau, int maSize, String tenSize, int giaTien, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.maMau = maMau;
        this.tenMau = tenMau;
        this.maSize = maSize;
        this.tenSize = tenSize;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
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

    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
    }

    public int getMaSize() {
        return maSize;
    }

    public void setMaSize(int maSize) {
        this.maSize = maSize;
    }

    public String getTenSize() {
        return tenSize;
    }

    public void setTenSize(String tenSize) {
        this.tenSize = tenSize;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
