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
    <div id="header" class="nav3-inverse">
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
                    <a class="navbar-brand" href="/trangchu">CuongNguyenTTN</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-ex1-collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="/trangchu">TRANG CHU</a></li>
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
                        <li><a href="login/">DANG NHAP</a></li>
                        <li><a href="login/">DANG KY</a></li>

                    </ul>
                </div><!-- /.navbar-collapse -->
            </div>
        </nav>
        <div class="event_header text-center container wow bounceIn">
            <span>Ngay 10/10/2018</span><br/>
            <span style="font-size: 50px">Mua 1 tang 1</span><br/>
            <button type="button" class="btn btn-info">Xem Ngay</button>
        </div>

    </div>
<%--den phan san pham noi bat--%>
    <div class="container">
        <hr class="thegach">
        <div class="row">
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow fadeInLeft" data-wow-duration="500">
                <div class="thumbnail canchuan">
                    <img class="tag_icon" src="../../resources/Image/chatluong.png" alt="">
                    <div class="caption text-center">
                        <h3>Chat Luong</h3>
                        <p>
                            Chung toi cam ket mang den cho ban chat luong tot nhat
                        </p>
                    </div>
                </div>
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow fadeInDown" data-wow-duration="500">
                <div class="thumbnail canchuan">
                    <img class="tag_icon" src="../../resources/Image/chiphi.png" alt="">
                    <div class="caption text-center">
                        <h3>Tiet Kiem Chi Phi</h3>
                        <p>
                            Cam ket gia re nhat viet nam giup ban tiet kiem 20% chi phi
                        </p>

                    </div>
                </div>
            </div>
            <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4 wow fadeInRight" data-wow-duration="500">
                <div class="thumbnail canchuan">
                    <img class="tag_icon" src="../../resources/Image/vanchuyen.png" alt="">
                    <div class="caption text-center">
                        <h3>Giao Hang</h3>
                        <p>
                            Chung toi cam ket giao hang trong ngay. Quy khach se hai long voi dich vu cua chung toi
                        </p>

                    </div>
                </div>
            </div>

        </div>

        <hr class="thegach">
        <h1 class="text-center thegach">San Pham Hot</h1>


        <%--san pham hot--%>



        <div class="row">
            <c:forEach var = "sanpham" items="${list}">

                <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                    <div class="thumbnail wow flipInX ">
                        <img src="../../resources/Image/nu/${sanpham.getHinhSanPham()}.jpg" alt="">
                        <div class="caption text-center">
                            <h3>${sanpham.getTenSanPham()}</h3>
                            <p>
                            </p>
                            <p>
                                <a href="#" class="btn btn-primary">Mua Hang</a>
                                <a href="#" class="btn btn-default">Xem chi tiet</a>
                            </p>
                        </div>
                    </div>
                </div>

            </c:forEach>



        </div>

    </div>


    <div>



    </div>





    <jsp:include page="footer.jsp"/>
</body>



</html>
