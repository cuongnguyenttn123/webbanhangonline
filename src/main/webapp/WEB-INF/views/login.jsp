<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 10/2/2018
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Login</title>
    <jsp:include page="header.jsp"/>
</head>
<body id="body-id">


    <div id="body-flex-login">
        <div id="container-login">
            <div id="container-login-left">
                <div class="container-login-left-header" id="left-header">
                    <span id="welcome">Welcome</span> <br/>
                    <span id="tuade">Hay tao nen phong cach cua ban cung MiniShop !</span>
                </div>
                <div id="container-login-left-leader">
                    <p><span class="login-bottom">Luon tao cam giac thoai mai khi mua sam</span></p>
                    <p><span class="login-bottom">Giam 50% tat ca cac mat hang cho khac vip</span></p>
                    <p><span class="login-bottom">Chung toi la su tin cay tuyet doi danh cho ban</span></p>
                </div>

            </div>
            <div id="container-login-right">
                <div class="container-login-left-header" id="active">
                    <span id="dangnhap">Dang Nhap</span> / <span>Dang Ky</span>


                    <form action="" method="post">

                        ${error}

                        <div id="form-dang-nhap">
                            <input class="nhap" type="text" name="tendangnhap"><br/>
                            <input class="nhap" type="text" name="matkhau"><br/>
                            <input id="login" type="submit" value="Dang Nhap">
                        </div>
                    </form>
                </div>



                <div>
                    <IMG src="<c:url value="/resources/Image/" />">
                </div>



            </div>
        </div>

    </div>
</form>

</body>
</html>
