package com.cuongnguyen.ttn.entity;

import javax.persistence.*;

@Entity(name = "chucvu")
public class ChucVuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maChucVu;
    @Column(name = "tenchucvu")
    private String tenChucVu;

    public int getMaChucVu() {
        return maChucVu;
    }

    public void setMaChucVu(int maChucVu) {
        this.maChucVu = maChucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }
}
