package com.cuongnguyen.ttn.entity;

import javax.persistence.*;

@Entity(name = "nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "tuoi")
    private String tuoi;

    public NhanVien(String name, String tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

    public NhanVien() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
}
