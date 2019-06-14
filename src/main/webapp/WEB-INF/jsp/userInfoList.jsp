<html>
<head>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <title>washCar</title>
    <!-- 引入 Bootstrap 样式-->
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <!-- 引入bootstrap-table样式 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.css">
    <!-- jquery -->
    <script src="${pageContext.request.contextPath}/static/js/jquery/1.9.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- bootstrap-table.min.js -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/bootstrap-table.min.js"></script>
    <!-- 引入中文语言包 -->
    <script src="https://cdn.bootcss.com/bootstrap-table/1.11.1/locale/bootstrap-table-zh-CN.min.js"></script>
</head>
<body>
<div class="head" style="height: 100%; width: 100%">
    <div class="tableBody">
        <div class="panel panel-default">
            <div class="panel-heading">
                查询条件
            </div>
            <div class="panel-body form-group" style="margin-bottom:0px;" id="queryParams">
                <label class="col-sm-2 control-label" style="text-align: right; margin-top:5px">用户名：</label>
                <div class="col-sm-2">
                    <input type="text" class="form-control" name="userName" id="userName"/>
                </div>
                <label class="col-sm-2 control-label" style="text-align: right; margin-top:5px">日期：</label>
                <div class="col-sm-2">
                    <input type="date" class="form-control" name="userSystem" id="userSystem"/>
                </div>
                <div class="col-sm-2 pull-left">
                    <button class="btn btn-primary" onclick="getUserInfoLit()" id="searchBtn">查询</button>
                </div>
            </div>
            <div>
                   <table id="table"></table>
            </div>
        </div>
    </div>
</div>
</div>
<script>
    var table;
    function initMainTable() {
        var rows = 10;
        //记录页面bootstrap-table全局变量$table，方便应用
        var queryUrl = 'getUserInfoLit';
        table = $('#table').bootstrapTable({
            url: queryUrl,                      //请求后台的URL（*）
            method: 'POST',                      //请求方式（*）
            //toolbar: '#toolbar',              //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: true,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
            // sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
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
            uniqueId: "userId",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                   //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                  //是否显示父子表
            //得到查询的参数
            queryParams: function (params) {
                //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
                console.log('参数打印');
                console.log(params.limit);
                console.log(params.offset);
                console.log(params.sort);
                console.log(params.order);
                var temp = {
                    rows: params.limit,                         //页面大小
                    // page: (params.offset / params.limit) + 1,   //页码
                    sort: params.sort,      //排序列名
                    sortOrder: params.order ,//排位命令（desc，asc）
                };
                return temp;
            },
            columns: [{
                checkbox: true,
                visible: true                  //是否显示复选框
            }, {
                field: 'userId',
                title: '用户ID',
                sortable: true
            }, {
                field: 'userName',
                title: '用户名',
                sortable: true
            } ,],
            onLoadSuccess: function (res) {
                console.info("加载成功");
                console.log(res)
            },
            onLoadError: function () {
                // showTips("数据加载失败！");
                 alert("数据加载失败！");
            },
            onDblClickRow: function (row, $element) {
                // var id = row.ID;
                // EditViewById(id, 'view');
            },
            // responseHandler:function(res){
            //     return  $.parseJSON(res)
            // },
        })
    };
    //默认加载数据
   $(document).ready(function () {
       initMainTable();
   });
   //点击查询按钮
   function getUserInfoLit(){
         var queryParams = {userName: $('#userName').val()}
        console.log(queryParams);
        $.ajax({
            type: "post",
            url: "getUserInfoLit",
            data: queryParams,
            dataType:"json",
            success : function(json) {
                $("#table").bootstrapTable('load', json);
            }
        });
    }


</script>
</body>
</html>
