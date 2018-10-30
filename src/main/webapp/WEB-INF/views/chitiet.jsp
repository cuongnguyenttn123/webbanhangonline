<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/29/2018
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <jsp:include page="header.jsp"/>
    <title>Title</title>
</head>
<body>
<div class="nav3-inverse">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container-fluid" id="menu-nav">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="/">CuongNguyenTTN</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav">
                    <li><a href="/">TRANG CHU</a></li>
                    <li><a href="#">SAN PHAM</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Nam</a></li>
                            <li><a href="#">Nu</a></li>
                            <li><a href="#">Phu Kien Di Kiem</a></li>
                        </ul>
                    </li>
                    <li><a href="#">DICH VU</a></li>
                    <li><a href="#">LIEN HE</a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <li><a href="/login/">DANG NHAP</a></li>
                    <li><a href="/login/">DANG KY</a></li>

                </ul>
            </div><!-- /.navbar-collapse -->
        </div>
    </nav>
</div>
<%--den phan chi tiet san pham--%>
<div class="container">
    <div class="row">
        <div class="col-xs-9 col-sm-9 col-md-9 col-lg-9">
            <div class="row">
                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                    <div class="thumbnail wow flipInX ">
                        <img src="../../resources/Image/nu/${sanpham.getHinhSanPham()}.jpg" alt="">
                        <div class="caption text-center">
                            <h3>${sanpham.getTenSanPham()}</h3>
                            <p style="color: red; font-size: 20px;">
                                ${sanpham.getGiaTien()} VND
                            </p>
                        </div>
                    </div>
                </div>

                <div class="col-xs-8 col-sm-8 col-md-8 col-lg-8">
                    <table class="table table-condensed">
                        <thead>
                        <tr>
                            <th>Mã sp</th>
                            <th>Màu</th>
                            <th>Size</th>
                            <th>số lượng</th>
                            <th>Giá tiền</th>
                            <th>Đặt mua</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach var="chitiet" items="${sanpham.getDanhSachChiTietSanPham()}">
                            <tr>
                                <td class="masanpham" data-masanpham="${chitiet.getSanPhamEntity().getMaSanPham()}">${chitiet.getSanPhamEntity().getTenSanPham()}</td>
                                <td class="mausanpham" data-mamau = "${chitiet.getMauSanPhamEntity().getMaMau()}">${chitiet.getMauSanPhamEntity().getTenMauSac()}</td>
                                <td class="masize" data-size="${chitiet.getSizeEntity().getMaSize()}">${chitiet.getSizeEntity().getTenSize()}</td>
                                <td class="soluong" data-soluong="${chitiet.getSoLuong()}">${chitiet.getSoLuong()}</td>
                                <td class="giatien" data-giatien="${chitiet.getSanPhamEntity().getGiaTien()}">${chitiet.getSanPhamEntity().getGiaTien()}</td>
                                <td><button class="muangay btn btn-info">Mua Ngay</button></td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
                <button class="btn btn-warning" id="btn-kiemtra"><a href="/thanhtoan/">Xem Gio Hang</a></button>
                </div>


            </div>
        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
            <h3 style="color: red">Mô Tả Sản Phẩm</h3>
            <span>
                - Chất liệu: 900D PVC + Lót 210D<br/>
                - Đệm PE foam 5mm + Simily PVC<br/>
                - Logo YaMe cao su đính nổi sang chảnh<br/>
                - Dây kéo HHH #5 cách điệu thời trang và lạ mắt.<br/>

                - Thiết kế kiểu dáng đơn giản nhưng trẻ trung với nhiều ngăn nhiều tính năng .<br/>
                + Nhiều màu sắc<br/>
                + Ngăn chính rộng, có ngăn laptop<br/>
                + Ngăn phụ ngoài tiện dụng<br/>
                + Ngăn nhỏ đựng vật tiện lợi: Chìa khóa, tai nghe, đen pin..v.v...<br/>
                + Ngăn hông đựng chai nước.<br/>
                - Kích thước: 40 x 30 x 10<br/>
            </span>
        </div>
    </div>


    </div>
<%-- het phan chi tiet san pham --%>
<div>
    <div class="container text-center">
        <span>DAY LA PHAN FOOTER</span>
    </div>
</div>
<jsp:include page="footer.jsp"/>
</body>
</html>
