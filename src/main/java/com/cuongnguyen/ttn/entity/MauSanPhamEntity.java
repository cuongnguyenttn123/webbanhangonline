package com.cuongnguyen.ttn.entity;

import javax.persistence.*;

@Entity(name = "mausanpham")
public class MauSanPhamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maMau;

    @Column(name = "tenmausac")
    private String tenMauSac;

    public int getMaMau() {
        return maMau;
    }

    public void setMaMau(int maMau) {
        this.maMau = maMau;
    }

    public String getTenMauSac() {
        return tenMauSac;
    }

    public void setTenMauSac(String tenMauSac) {
        this.tenMauSac = tenMauSac;
    }
}
