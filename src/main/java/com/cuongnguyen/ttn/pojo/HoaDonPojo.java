package com.cuongnguyen.ttn.pojo;

import com.cuongnguyen.ttn.entity.ChiTietHoaDonEntity;

import java.util.Set;

public class HoaDonPojo {
    private int maHoaDon;
    private String tenKhachHang;
    private String soDt;
    private String diaChi;
    private int tinhTrang;
    private String ngayMua;
    Set<ChiTietHoaDonEntity> dsChiTietHoaDon;

    public int getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(int maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(String ngayMua) {
        this.ngayMua = ngayMua;
    }

    public Set<ChiTietHoaDonEntity> getDsChiTietHoaDon() {
        return dsChiTietHoaDon;
    }

    public void setDsChiTietHoaDon(Set<ChiTietHoaDonEntity> dsChiTietHoaDon) {
        this.dsChiTietHoaDon = dsChiTietHoaDon;
    }
}
