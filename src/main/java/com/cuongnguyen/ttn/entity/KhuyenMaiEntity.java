package com.cuongnguyen.ttn.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "khuyenmai")
public class KhuyenMaiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maKhuyenMai;
    @Column(name = "giagiam")
    private int giagiam;
    @Column(name = "tenkhuyenmai")
    private String tenKhuyenMai;
    @Column(name = "thoigianbatdau")
    private String thoiGianBatDau;
    @Column(name = "thoigianketthuc")
    private String thoiGianKetThuc;
    @Column(name = "mota")
    private String moTa;
    @Column(name = "hinhkhuyenmai")
    private String hinhKhuyenMai;
    @ManyToMany
    @JoinTable(name = "chitietkhuyenmai",
            joinColumns = {@JoinColumn(name = "makhuyenmai", referencedColumnName = "makhuyenmai")},
            inverseJoinColumns = {@JoinColumn(name = "masanpham", referencedColumnName = "masanpham")} )
    private Set<SanPhamEntity> dsSanPham;

    public Set<SanPhamEntity> getDsKhuyenMai() {
        return dsSanPham;
    }

    public void setTenKhuyenMai(String tenKhuyenMai) {
        this.tenKhuyenMai = tenKhuyenMai;
    }

    public void setDsKhuyenMai(Set<SanPhamEntity> dsKhuyenMai) {
        this.dsSanPham = dsKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return tenKhuyenMai;
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
