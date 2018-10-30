package com.cuongnguyen.ttn.pojo;

import com.cuongnguyen.ttn.entity.SanPhamEntity;

import java.util.Set;

public class DanhMucSPPojo {
    private int maDanhMucSanPham;
    private String tenDanhMucSanPham;
    private String hinhDanhMucSanPham;
    private Set<SanPhamPojo> danhSachSanPham;

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

    public Set<SanPhamPojo> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(Set<SanPhamPojo> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
