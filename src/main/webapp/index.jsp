<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <title>washCar</title>
    <!-- 引入 Bootstrap -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style type="text/css">
        .head {

            background-image: url('${pageContext.request.contextPath}/static/images/index.jpg');
            background-size:cover;
        }
        .form{
            width: 400px;
            position: absolute;
            right: 200px;
            bottom: 200px;
        }
    </style>
</head>
<body>
<div class="head" style="height: 100%; width: 100%">
    <form role="form" method="post" action="${pageContext.request.contextPath}/login" class="form">
        <div class="form-group">
            <label for="userName">用户名</label>
            <input type="text" class="form-control" name="userName" id="userName" placeholder="请输入名称" required>
        </div>
        <div class="form-group">
            <label for="userPassword">密码</label>
            <input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="请输入密码" required>
        </div>
        <div class="form-group">
            <input type="button" class="btn" value="登录">
        </div>
    </form>
</div>
<script>
    $(".btn").click(function () {
        $.ajax({
            type: "post",
            url: $(".form").attr("action"),
            data: $("form").serialize(),
            dataType:"json",
            success : function(res) {
                if (res.success()){
                }
            }
        })
    });
</script>
</body>
</html>
