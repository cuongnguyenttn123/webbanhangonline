package com.cuongnguyen.ttn.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "sanpham")
public class SanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maSanPham;

    @Column(name = "tensanpham")
    private String  tenSanPham;

    @Column(name = "giatien")
    private int giaTien;

    @Column(name = "motasanpham")
    private String moTaSanPham;

    @Column(name = "hinhsanpham")
    private String hinhSanPham;

    @Column(name = "danhcho")
    private String danhCho;

    @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "madanhmucsanpham")
    private DanhMucSPEntity danhMucSPEntity;

    public DanhMucSPEntity getDanhMucSPEntity() {
        return danhMucSPEntity;
    }

    public void setDanhMucSPEntity(DanhMucSPEntity danhMucSPEntity) {
        this.danhMucSPEntity = danhMucSPEntity;
    }

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "masanpham")
    Set<ChiTietSanPhamEntity> danhSachChiTietSanPham;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "chitietkhuyenmai",
            joinColumns = {@JoinColumn(name = "masanpham", referencedColumnName = "masanpham")},
    inverseJoinColumns = {@JoinColumn(name = "makhuyenmai", referencedColumnName = "makhuyenmai")} )
    private Set<KhuyenMaiEntity> dsKhuyenMai;

    public Set<KhuyenMaiEntity> getDanhsachKhuyenMai() {
        return dsKhuyenMai;
    }

    public void setDanhsachKhuyenMai(Set<KhuyenMaiEntity> danhsachKhuyenMai) {
        this.dsKhuyenMai = danhsachKhuyenMai;
    }


    public String getDanhCho() {
        return danhCho;
    }

    public void setDanhCho(String danhCho) {
        this.danhCho = danhCho;
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

    public Set<ChiTietSanPhamEntity> getDanhSachChiTietSanPham() {
        return danhSachChiTietSanPham;
    }

    public void setDanhSachChiTietSanPham(Set<ChiTietSanPhamEntity> danhSachChiTietSanPham) {
        this.danhSachChiTietSanPham = danhSachChiTietSanPham;
    }
}
