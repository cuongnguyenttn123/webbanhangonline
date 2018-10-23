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
        <form id="form-nguoimua" action="">
            <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                <h3>Thông Tin Người Mua/Nhận:</h3>

                <div class="form-group">
                    <label for="tennguoimua">Tên Người Mua/Nhân: </label>
                    <input class="form-control" name="tennguoimua" id="tennguoimua">

                    <label for="sodienthoailienlac">So dien thoai lien lac: </label>
                    <input class="form-control" name="sodienthoai" id="sodienthoailienlac">
                    <div class="radio">
                        <label><input type="radio" name="dhinhthuc" value="giaohangtannoi">Giao Hàng Tận Nơi</label>
                    </div>
                    <div class="radio">
                        <label><input type="radio" name="dhinhthuc" value="nhanocuahang" >Nhận Hàng Tại Cửa Hàng</label>
                    </div>

                    <input type="file" name="hinhanh" id="hinhanh" class="form-control">

                    <label for="diachi">Địa Chỉ Nhận Hàng: </label>
                    <textarea class="form-control" name="diachi" id="diachi"></textarea>

                    <label for="ghichu">Ghi Chú Thêm Thông Tin: </label>
                    <textarea class="form-control" name="ghichu" id="ghichu"></textarea>

                    <button id="themthongtin">Thêm Thông Tin Người Nhận</button>
                </div>
            </div>
        </form>
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
