package com.cuongnguyen.ttn.entity;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "danhmucsanpham")
public class DanhMucSPEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maDanhMucSanPham;
    @Column(name = "tendanhmucsanpham")
    private String tenDanhMucSanPham;
    @Column(name = "hinhdanhmucsanpham")
    private String hinhDanhMucSanPham;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "masanpham")
    private Set<SanPhamEntity> danhSachSanPham;

    public Set<SanPhamEntity> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(Set<SanPhamEntity> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }


    public int getMaDanhMucSanPham() {
        return maDanhMucSanPham;
    }

    public void setMaDanhMucSanPham(int maDanhMucSanPham) {
        this.maDanhMucSanPham = maDanhMucSanPham;
    }

    public String getTenDanhMucSanPham() {
        return tenDanhMucSanPham;
    }

    public void setTenDanhMucSanPham(String tenDanhMucSanPham) {
        this.tenDanhMucSanPham = tenDanhMucSanPham;
    }

    public String getHinhDanhMucSanPham() {
        return hinhDanhMucSanPham;
    }

    public void setHinhDanhMucSanPham(String hinhDanhMucSanPham) {
        this.hinhDanhMucSanPham = hinhDanhMucSanPham;
    }
}
