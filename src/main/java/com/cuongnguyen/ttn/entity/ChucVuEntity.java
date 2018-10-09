package com.cuongnguyen.ttn.entity;

import javax.persistence.*;

@Entity(name = "chucvu")
public class ChucVuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chucVu;
    @Column(name = "tenchucvu")
    private String tenChucVu;

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public String getTenChucVu() {
        return tenChucVu;
    }

    public void setTenChucVu(String tenChucVu) {
        this.tenChucVu = tenChucVu;
    }
}
