package com.cuongnguyen.ttn.utils.convert;

import com.cuongnguyen.ttn.entity.SanPhamEntity;
import com.cuongnguyen.ttn.pojo.SanPhamPojo;

public class SanPhamConvert {
    public static SanPhamPojo sanPhamEntityconvertPojo(SanPhamEntity sanPhamEntity){
        SanPhamPojo sanPhamPojo = new SanPhamPojo();
        sanPhamPojo.setMaSanPham(sanPhamEntity.getMaSanPham());
        sanPhamPojo.setTenSanPham(sanPhamEntity.getTenSanPham());
        sanPhamPojo.setGiaTien(sanPhamEntity.getGiaTien());
        sanPhamPojo.setMoTaSanPham(sanPhamEntity.getMoTaSanPham());
        sanPhamPojo.setHinhSanPham(sanPhamEntity.getHinhSanPham());
        sanPhamPojo.setDanhCho(sanPhamEntity.getDanhCho());
        return sanPhamPojo;
    }

    public static SanPhamEntity sanPhamEntityconvertPojo(SanPhamPojo sanPhamPojo){
        SanPhamEntity sanPhamEntity = new SanPhamEntity();
        sanPhamEntity.setMaSanPham(sanPhamPojo.getMaSanPham());
        sanPhamEntity.setTenSanPham(sanPhamPojo.getTenSanPham());
        sanPhamEntity.setGiaTien(sanPhamPojo.getGiaTien());
        sanPhamEntity.setMoTaSanPham(sanPhamPojo.getMoTaSanPham());
        sanPhamEntity.setHinhSanPham(sanPhamPojo.getHinhSanPham());
        sanPhamEntity.setDanhCho(sanPhamPojo.getDanhCho());
        return sanPhamEntity;
    }
}
