<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <title>washCar</title>
    <!-- 引入 Bootstrap -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- 引入 toastr样式 提示框-->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/toastr/toastr.min.css">
    <link href="https://cdn.bootcss.com/Ladda/1.0.6/ladda.min.css" rel="stylesheet">
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- 引入 lodda.js 锁屏-->
    <!-- 引入 toastr.js 提示框-->
    <script src="${pageContext.request.contextPath}/static/js/toastr/toastr.js"></script>
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
    <form role="form" method="post" action="login" class="form">
        <div class="form-group">
            <label for="userName">用户名</label>
            <input type="text" class="form-control" name="userName" id="userName" placeholder="请输入用户名">
        </div>
        <div class="form-group">
            <label for="userPassword">密码</label>
            <input type="password" class="form-control" name="userPassword" id="userPassword" placeholder="请输入密码">
        </div>
        <div class="form-group">
            <input type="button" class="btn" value="登录">
        </div>
    </form>
</div>
<script>
    $(".btn").click(function () {
        var loading = this;
        console.log(loading);
        if($("#userName").val() == '') {
            toastr.warning("请输入用户名");
            return ;
        }

        if($("#userPassword").val() == '') {
            toastr.warning("请输入密码");
            return ;
        }
        $(".btn").attr('disabled', 'disabled');
        $(".btn").val('登录中...');
        $.ajax({
            type: "post",
            url: $(".form").attr("action"),
            data: $("form").serialize(),
            dataType:"json",
            success : function(res) {
                if(res.success) {
                    window.location.href = "main";
                } else {
                    toastr.error(res.message);
                    window.location.reload();
                }
            },
            error:function (res) {
                loading.removeAttr('disabled', 'disabled');
                toastr.error("登录错误请联系管理员");
                window.location.reload();
            }
        })
    });
</script>
</body>
</html>
