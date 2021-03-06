package com.cuongnguyen.ttn.entity;

import javax.persistence.*;

@Entity(name = "nhanvien")
public class NhanVienEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int maNhanVien;

    @Column(name = "hoten")
    private String hoTen;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "gioitinh")
    private int gioiTinh;

    @Column(name = "cmnd")
    private String chungMinhnd;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "machucvu")
    private ChucVuEntity chucVu;

    @Column(name = "email")
    private String email;

    @Column(name = "tendangnhap")
    private String tenDangNhap;

    @Column(name = "matkhau")
    private String matKhau;

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getChungMinhnd() {
        return chungMinhnd;
    }

    public void setChungMinhnd(String chungMinhnd) {
        this.chungMinhnd = chungMinhnd;
    }

    public ChucVuEntity getChucVu() {
        return chucVu;
    }

    public void setChucVu(ChucVuEntity chucVu) {
        this.chucVu = chucVu;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
