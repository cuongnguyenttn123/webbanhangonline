package com.cuongnguyen.ttn.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "danhmucsanpham")
public class DanhMucSanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDanhMuc;
    @Column(name = "tendanhmucsanpham")
    private String tenDanhMuc;
    @Column(name = "hinhdanhmucsanpham")
    private String hinhDanhMuc;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "masanpham")
    private Set<SanPhamEntity> danhSachSanPham;

    public int getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(int maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public String getHinhDanhMuc() {
        return hinhDanhMuc;
    }

    public void setHinhDanhMuc(String hinhDanhMuc) {
        this.hinhDanhMuc = hinhDanhMuc;
    }

    public Set<SanPhamEntity> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(Set<SanPhamEntity> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
