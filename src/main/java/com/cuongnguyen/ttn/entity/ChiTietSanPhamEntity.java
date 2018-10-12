package com.cuongnguyen.ttn.entity;

import org.hibernate.annotations.Proxy;

import javax.persistence.*;

@Entity(name = "chitietsanpham")
@Proxy(lazy = false)
public class ChiTietSanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maChiTietSanPham;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "masanpham")
    private SanPhamEntity sanPhamEntity;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "masize")
    private SizeEntity sizeEntity;

    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "mamau")
    private MauSanPhamEntity mauSanPhamEntity;
    @Column(name = "soluong")
    private int soLuong;

    @Column(name = "ngaynhap")
    private String ngayNhap;

    public int getMaChiTietSanPham() {
        return maChiTietSanPham;
    }

    public void setMaChiTietSanPham(int maChiTietSanPham) {
        this.maChiTietSanPham = maChiTietSanPham;
    }

    public SanPhamEntity getSanPhamEntity() {
        return sanPhamEntity;
    }

    public void setSanPhamEntity(SanPhamEntity sanPhamEntity) {
        this.sanPhamEntity = sanPhamEntity;
    }

    public SizeEntity getSizeEntity() {
        return sizeEntity;
    }

    public void setSizeEntity(SizeEntity sizeEntity) {
        this.sizeEntity = sizeEntity;
    }

    public MauSanPhamEntity getMauSanPhamEntity() {
        return mauSanPhamEntity;
    }

    public void setMauSanPhamEntity(MauSanPhamEntity mauSanPhamEntity) {
        this.mauSanPhamEntity = mauSanPhamEntity;
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
