package com.cuongnguyen.ttn.pojo;

import com.cuongnguyen.ttn.entity.ChiTietSanPhamEntity;
import com.cuongnguyen.ttn.entity.DanhMucSPEntity;
import com.cuongnguyen.ttn.entity.KhuyenMaiEntity;

import java.util.Set;

public class SanPhamPojo {
    private int maSanPham;
    private String  tenSanPham;

    private int giaTien;
    private String moTaSanPham;

    private String hinhSanPham;

    private String danhCho;

    private DanhMucSPPojo danhMucSPPojo;

    private Set<ChiTietSanPhamPojo> danhSachChiTietSanPham;

    private Set<KhuyenMaiPojo> dsKhuyenMai;

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

    public String getDanhCho() {
        return danhCho;
    }

    public void setDanhCho(String danhCho) {
        this.danhCho = danhCho;
    }

    public DanhMucSPPojo getDanhMucSPPojo() {
        return danhMucSPPojo;
    }

    public void setDanhMucSPPojo(DanhMucSPPojo danhMucSPPojo) {
        this.danhMucSPPojo = danhMucSPPojo;
    }

    public Set<ChiTietSanPhamPojo> getDanhSachChiTietSanPham() {
        return danhSachChiTietSanPham;
    }

    public void setDanhSachChiTietSanPham(Set<ChiTietSanPhamPojo> danhSachChiTietSanPham) {
        this.danhSachChiTietSanPham = danhSachChiTietSanPham;
    }

    public Set<KhuyenMaiPojo> getDsKhuyenMai() {
        return dsKhuyenMai;
    }

    public void setDsKhuyenMai(Set<KhuyenMaiPojo> dsKhuyenMai) {
        this.dsKhuyenMai = dsKhuyenMai;
    }
}
