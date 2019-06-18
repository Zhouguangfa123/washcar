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
    <p>
        <strong>${message}</strong>
    </p>
</div>
</body>
</html>
