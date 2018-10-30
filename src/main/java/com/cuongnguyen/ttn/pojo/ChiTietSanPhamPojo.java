package com.cuongnguyen.ttn.pojo;

public class ChiTietSanPhamPojo {
    private int maChiTietSanPham;
    private SanPhamPojo sanPhamPojo;
    private SizePojo sizePojo;
    private MauSanPhamPojo mauSanPhamPojo;
    private int soLuong;
    private String ngayNhap;

    public int getMaChiTietSanPham() {
        return maChiTietSanPham;
    }

    public void setMaChiTietSanPham(int maChiTietSanPham) {
        this.maChiTietSanPham = maChiTietSanPham;
    }

    public SanPhamPojo getSanPhamPojo() {
        return sanPhamPojo;
    }

    public void setSanPhamPojo(SanPhamPojo sanPhamPojo) {
        this.sanPhamPojo = sanPhamPojo;
    }

    public SizePojo getSizePojo() {
        return sizePojo;
    }

    public void setSizePojo(SizePojo sizePojo) {
        this.sizePojo = sizePojo;
    }

    public MauSanPhamPojo getMauSanPhamPojo() {
        return mauSanPhamPojo;
    }

    public void setMauSanPhamPojo(MauSanPhamPojo mauSanPhamPojo) {
        this.mauSanPhamPojo = mauSanPhamPojo;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
}
