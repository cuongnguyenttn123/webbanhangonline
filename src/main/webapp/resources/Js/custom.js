$(document).ready(function () {
    $("#btn-kiemtra").click(function () {
        $.ajax({
            url: "/api/kiemtra",
            type:"get",

        }).done(function () {
        })
    });

    $(".muangay").click(function () {
        var masanpham = $(this).closest("tr").find(".masanpham").attr("data-masanpham");
        var tensanpham = $(this).closest("tr").find(".masanpham").text();
        var mamau = $(this).closest("tr").find(".mausanpham").attr("data-mamau");
        var tenmau = $(this).closest("tr").find(".mausanpham").text();
        var masize = $(this).closest("tr").find(".masize").attr("data-size");
        var tensize = $(this).closest("tr").find(".masize").text();
        var soluong = $(this).closest("tr").find(".soluong").attr("data-soluong");
        var giatien = $(this).closest("tr").find(".giatien").attr("data-giatien");
        $.ajax({
            url: "/api/xuly",
            type:"get",
            data:{
                maSanPham: masanpham,
                tenSanPham: tensanpham,
                maMau : mamau,
                tenMau : tenmau,
                maSize : masize,
                tenSize : tensize,
                soLuong : soluong,
                giaTien : giatien
            }
        }).done(function () {
        })
    });
})