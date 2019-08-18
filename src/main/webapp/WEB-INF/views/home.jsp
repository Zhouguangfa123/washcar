<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/14
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
<a href="<c:url value="/spittles"/>">spitter</a>
<a href="<c:url value="/spittles" />">register</a>
<div>
    <form id="form" action="saveHome" method="post" enctype="multipart/form-data">
        <div><input type="text" name="homeName">房屋名称</div>
        <div><input type="number" name="homeSize">房屋大小</div>
        <div><input type="file" name="profilePicture" accept="image/gif, image/png">房屋照片</div>
        <div><input type="submit">保存</div>
    </form>
</div>
</body>
</html>
