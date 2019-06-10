<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <title>washCar</title>
    <!-- 引入 Bootstrap -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery/1.9.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <style>
        .col-center-block {
            float: none;
            display: block;
            margin-left: auto;
            margin-right: auto;
        }
    </style>
</head>
<body>
<div class="head" style="height: 100%; width: 100%">
    <div class="tableBody">
        <div class="panel panel-default">
            <div class="panel-heading">
                查询条件
            </div>
            <div class="panel-body form-group" style="margin-bottom:0px;">
                <label class="col-sm-2 control-label" style="text-align: right; margin-top:5px">商户名简称：</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" name="submerName" id="submerName"/>
                </div>
                <label class="col-sm-2 control-label" style="text-align: right; margin-top:5px">日期：</label>
                <div class="col-sm-2">
                    <input type="date" class="form-control" name="hostDate" id="hostDate"/>
                </div>
                <div class="col-sm-2 pull-left">
                    <button class="btn btn-primary" id="searchBtn">查询</button>
                </div>
            </div>
        </div>
    </div>
    <div class="col-center-block">
    <div>
        <strong>收款总额</strong><input readonly="readonly" value="${userInfo.collectionCount}" id="collectionCount">
    </div>
    <div>
        <strong>使用客户总量</strong><input readonly="readonly" value="${userInfo.customerUseing}" id="customerUseing">
    </div>
    </div>
</div>
</div>
<script>
    // 查询user信息
    function getUserInfoLit() {
        const submerName = $('#submerName').val();
        const hostDate = $('#hostDate').val();
        $.ajax({
            type: "post",
            async: false, //同步请求
            url: "${pageContext.request.contextPath}/getUserInfoLit",
            data: {submerName:submerName, hostDate:hostDate},
            dataType: "json",
            success: function(data) {
                console.log(data)
            },
            error: function() {
            }
        });
    }
    $("#searchBtn").click( function () {
        getUserInfoLit();
        }
    );

</script>
</body>
</html>
