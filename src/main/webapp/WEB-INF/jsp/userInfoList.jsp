<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <title>washCar</title>
    <!-- 引入 Bootstrap -->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery/1.9.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="head" style="height: 100%; width: 100%">
    <div class="tableBody">
        <div class="panel panel-default">
            <div class="panel-heading">
                查询条件
            </div>
            <div class="panel-body form-group" style="margin-bottom:0px;">
                <label class="col-sm-2 control-label" style="text-align: right; margin-top:5px">用户名：</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" name="userName" id="userName"/>
                </div>
                <label class="col-sm-2 control-label" style="text-align: right; margin-top:5px">日期：</label>
                <div class="col-sm-2">
                    <input type="date" class="form-control" name="userSystem" id="userSystem"/>
                </div>
                <div class="col-sm-2 pull-left">
                    <button class="btn btn-primary" id="searchBtn">查询</button>
                </div>
            </div>
            <div>
                <table data-toggle="table" data-url="data1.json" id="table">
                    <thead>
                    <tr>
                        <th data-field="id">Item ID</th>
                        <th data-field="name">Item Name</th>
                        <th data-field="price">Item Price</th>
                    </tr>
                    </thead>
                </table>
            </div>
        </div>
    </div>
</div>
</div>
<script>
    var table;
    function initMainTable () {
        debugger;
        //记录页面bootstrap-table全局变量$table，方便应用
        var queryUrl = '/TestUser/FindWithPager?rnd=' + Math.random()
        table = $('#table').bootstrapTable({
            url: queryUrl,                      //请求后台的URL（*）
            method: 'GET',                      //请求方式（*）
            //toolbar: '#toolbar',              //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: true,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1,                      //初始化加载第一页，默认第一页,并记录
            pageSize: rows,                     //每页的记录行数（*）
            pageList: [10, 25, 50, 100],        //可供选择的每页的行数（*）
            search: false,                      //是否显示表格搜索
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列（选择显示的列）
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            //height: 500,                      //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "ID",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                  //是否显示父子表
            //得到查询的参数
            queryParams: function (params) {
                //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                var temp = {
                    rows: params.limit,                         //页面大小
                    page: (params.offset / params.limit) + 1,   //页码
                    sort: params.sort,      //排序列名
                    sortOrder: params.order //排位命令（desc，asc）
                };
                return temp;
            },
            columns: [{
                checkbox: true,
                visible: true                  //是否显示复选框
            }, {
                field: 'Name',
                title: '姓名',
                sortable: true
            }, {
                field: 'Mobile',
                title: '手机',
                sortable: true
            }, {
                field: 'Email',
                title: '邮箱',
                sortable: true,
                formatter: emailFormatter
            }, {
                field: 'Homepage',
                title: '主页',
                formatter: linkFormatter
            }, {
                field: 'Hobby',
                title: '兴趣爱好'
            }, {
                field: 'Gender',
                title: '性别',
                sortable: true
            }, {
                field: 'Age',
                title: '年龄'
            }, {
                field: 'BirthDate',
                title: '出生日期',
                formatter: dateFormatter
            }, {
                field: 'Height',
                title: '身高'
            }, {
                field: 'Note',
                title: '备注'
            }, {
                field: 'ID',
                title: '操作',
                width: 120,
                align: 'center',
                valign: 'middle',
                formatter: actionFormatter
            },],
            onLoadSuccess: function () {
            },
            onLoadError: function () {
                showTips("数据加载失败！");
            },
            onDblClickRow: function (row, $element) {
                var id = row.ID;
                EditViewById(id, 'view');
            },
        })
    }

    //默认加载数据
   $(document).ready(function () {
       initMainTable();
   })
</script>
</body>
</html>
