<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no">
    <meta http-equiv="Cache-Control" content="no-siteapp">

    <link href="${pageContext.request.contextPath}/static/manage/images/favicon.ico" rel="SHORTCUT ICON">
    <link href="${pageContext.request.contextPath}/static/manage/images/favicon.ico" rel="ICON">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/manage/h-ui/css/H-ui.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/manage/h-ui.admin/css/H-ui.admin.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/manage/lib/Hui-iconfont/1.0.8/iconfont.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/manage/h-ui.admin/skin/blue/skin.css" id="blue">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/manage/h-ui.admin/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/manage/h-ui.admin/common.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/manage/lib/multiple-select/multiple-select.css">
    <link href="${pageContext.request.contextPath}/static/manage/work/css/site.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/manage/lib/layer/2.4/skin/layer.css" id="layui_layer_skinlayercss" style="">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/manage/lib/laydate5.0.9/theme/default/laydate.css" id="layuicss-laydate">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/lib/jquery/1.9.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/lib/layer/2.4/layer.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/h-ui/js/H-ui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/h-ui.admin/js/H-ui.admin.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/lib/Validform/5.3.2/Validform.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/h-ui.admin/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/lib/laydate5.0.9/laydate.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/h-ui/js/H-ui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/manage/lib/template/template.js"></script>
    <title>全控保进件系统</title>
    <style type="text/css">
        a:hover,
        a:focus,
        .maincolor,
        .maincolor a,
        .Hui-aside .menu_dropdown dt,
        .Hui-aside .menu_dropdown dt:hover,
        #menu dd a,
        .navbar-logo-m,
        .navbar-userbar {
            color: #898989;
        }

        .leftIcon {
            margin-right: 2px;
        }

        #menu dd a {
            line-height: 32px;
            text-decoration: none;
            margin-left: 15px;
        }

        #menu dd a:hover {
            text-decoration: none;
        }

        .Hui-tabNav {
            padding: 0;
        }

        .Hui-tabNav .acrossTab li {
            width: 100px;
            box-sizing: border-box;
        }

        .navbar {
            background-color: #fff;
            display: flex;
            flex-direction: row;
        }

        .navbar span,
        .navbar .navbar-logo {
            color: #2F2F2F;
        }

        .navbar>div {
            flex: 9;
        }

        .Hui-aside {
            background: #fff;
            text-align: center;
        }

        .active {
            color: #13B859 !important;
        }

        .Hui-article-box {
            background: #f6f6f6;
            padding: 5px;
        }

        #Hui-tabNav {
            background: #f6f6f6;
            padding: 0 30px;
        }

        .container-fluid {
            padding: 10px 15px;
        }

        .Hui-article-box {
            top: 65px;
        }

        .Hui-tabNav,
        .Hui-tabNav .acrossTab li,
        .Hui-tabNav .acrossTab li em {
            background: none;
        }

        .Hui-tabNav .acrossTab li {
            width: auto;
            padding: 0 3px;
            z-index: 5;
        }

        .acrossTab li em {
            position: initial;
        }

        .Hui-article {
            top: 54px;
        }

        .Hui-aside .menu_dropdown dt {
            border: none;
            height: 50px;
            font-size: 16px;
            line-height: 50px;
        }

        .Hui-aside .menu_dropdown dt span {
            margin: 0 10px;
        }

        .navbar-fixed-top {
            left: 199px;
        }

        .Hui-aside {
            width: 200px;
            top: 0;
        }

        .Hui-aside>img {
            width: 180px;
            height: 60px;
        }

        .acrossTab li {
            font-size: 14px;
        }

        .navbar-slogan a:hover {
            color: #FB724D;
            text-decoration: none;
        }
    </style>
</head>

<body>
<div class="navbar-wrapper">
    <div class="navbar navbar-fixed-top">
        <div class="container-fluid cl">
            <a class="logo navbar-logo f-l mr-10 hidden-xs" href=""> 智能洗车系统</a>
            <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml"></a>
            <span class="logo navbar-slogan f-l mr-10 hidden-xs"> V1.0</span>
            <span class="logo navbar-slogan f-l mr-10 hidden-xs"></span>
            <span class="logo navbar-slogan mr-10 hidden-xs" style="float: right">
                        <span>当前用户：${sessionScope.loginUserInfo.userName}</span>
                    <a href="loginOut" style="margin-left: 20px; margin-right: 60px">退出登录</a>
                    </span>

            <div id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
                <ul class="cl">
                    <li class="dropDown dropDown_hover"></li>
                </ul>
            </div>

        </div>
    </div>
</div>
<div class="Hui-aside">
    <img src="${pageContext.request.contextPath}/static/manage/images/logos.png" />
    <div class="menu_dropdown bk_2" id="menu">
        <script type="text/html" id="asideMenu">
            {{each menuInfoBeanList as val}}
            {{if val.menuPid==0}}
            <dl>
                <dt>
                    <!--<img class="iconImg" src="" alt="" />-->
                    <span>{{val.menuName}}</span>
                    <img class="isshow" src="${pageContext.request.contextPath}/static/manage/images/down.png" alt="" />
                </dt>
                {{each menuInfoBeanList as item}}
                {{if item.menuPid == val.menuId}}
                <dd>
                    <a data-href="{{item.menuUrl}}" data-title="{{item.menuName}}" href="javascript:void(0)">{{item.menuName}}</a>
                </dd>
                {{/if}}
                {{/each}}
            </dl>
            {{/if}}
            {{/each}}
        </script>
    </div>
</div>
<div class="page-bootstrap"></div>
<div class="dislpayArrow hidden-xs">
    <a class="pngfix" href="javascript:void(0);" onclick="displaynavbar(this)"></a>
</div>
<div class="Hui-article-box">
    <div id="Hui-tabNav" class="Hui-tabNav hidden-xs">
        <div class="Hui-tabNav-wp">
            <ul id="min_title_list" class="acrossTab cl">
                <li class="active">
                    <span class="tabfirst">我的桌面</span>
                    <b style="font-weight: 400;"></b>
                    <em></em>
                </li>
            </ul>
        </div>
    </div>
    <div id="iframe_box" class="Hui-article">
        <div class="show_iframe">
            <div style="display:none" class="loading"></div>
            <iframe scrolling="yes" id="iframe1" style="border:none" src="showMain"></iframe>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">

    var menuOne;//书签页父级菜单
    //          var iconArr = ["ywgk", "jjsh", "ywgl", "mdgl", "yhgl", "gsgl", "xtpz", "dzyw", "cpgl"];
    //          var activeIcon = ["yw", "jj", "yg", "md", "yh", "gs", "xt", "dz", "cp"];
    var imgPath = "${pageContext.request.contextPath}/static/manage/images/";
    var EventUtil = {
        addHandler: function(element, type, handler) {
            if(element.addEventListener) {
                element.addEventListener(type, handler, false);
            } else if(element.attachEvent) {
                element.attachEvent("on" + type,handler);
            } else {
                element["on" + type] = handler;
            }
        }
    };
    EventUtil.addHandler(document, "DOMContentLoaded", function(event) {});

    //当侧边栏隐藏时头部的left:0，显示时left:199px;
    $(".pngfix").on("click",function(){
        if($(this).hasClass("open")){
            $(".navbar-fixed-top").css("left",0);
        }else{
            $(".navbar-fixed-top").css("left","199px");
        }
    });

    getMent();
    //侧边栏
    function getMent(){
        $.ajax({
            url: "listLevelOneMenuInfoByUserId",
            type: "post",
            dataType: "json",
            success: function(data) {
                console.log(data.menuInfoBeanList);
                    var menuText = template("asideMenu", data);
                    console.log(menuText);
                    $("#menu").html(menuText);
//                      iconArr.forEach(function(item, index) {
//                          $("#menu").find(".iconImg").eq(index).attr("src", imgPath + item + ".png")
//                      });
            }
        })
    }

    //$(".Hui-aside").find('#menu').find("dl").eq("0").find("dd").show();
    //一级菜单
    $(".Hui-aside").on("click", "dt", function() {
        menuOne = $(this).find("span").html();
        menu1 = $(this).parents("dl").index();
        menu2 = 0;
        var iconindex=$(".Hui-aside").find("dt").index(this);
//              iconArr.forEach(function(item, index) {
//                  $(".Hui-aside").find(".iconImg").eq(index).attr("src", imgPath + item + ".png")
//              });
//              $(this).find(".iconImg").attr("src", imgPath + activeIcon[iconindex] + ".png");
        //设置this样式
        $(this).parents("dl").siblings().find("dd").hide();

        $(this).css("color", "#2F2F2F");
        $(this).find(".isshow").css("transform", "rotate(180deg)");
        //this的siblings样式
        $(this).parents("dl").siblings().find("dt").css("color", "#898989");
        $(this).parents("dl").siblings().find("dt").find(".isshow").css("transform", "rotate(0)");
        $(this).siblings("dd").show();
        $(this).parents("dl").siblings().find("dd").hide();
        $(this).siblings("dd").find("a").css("color", "13B859");
        $(this).siblings("dd").eq("0").find("a").click();
        bookmark(menuOne);
    });
    $(".Hui-aside").on("click", "dd", function() {
        menu2 = $(this).index();
        $(this).find("a").css("color", "#13B859");
        $(this).siblings("dd").find("a").css("color", "#898989");
        bookmark(menuOne);
    })

    $("#min_title_list").on("click", "li", function() {
        return false;
    })
    //书签页
    function bookmark(t) {
        $(".acrossTab li").find("i").hide();
        $(".acrossTab li").eq(0).find("b").html("&gt;");
        $(".acrossTab li").find(".tabfirst").html(t);
        $(".acrossTab li").map(function(index, item) {
            if(index != "0" && index != $(".acrossTab li").length - 1) {
                $(".acrossTab li").eq(index).remove();
            } else {
                var hideText = $(".acrossTab li").eq($(".acrossTab li").length - 1).find("span").html();
                if(hideText == "门店列表" || hideText == "用户列表" || hideText == "用户组管理" || hideText == "公司列表" || hideText == "菜单列表" || hideText == "产品列表") {
                    $("#Hui-tabNav").hide();
                    $("#iframe_box").css("top", "0");
                } else {
                    $("#Hui-tabNav").show();
                    $("#iframe_box").css("top", "54px");
                }

            }
        })
    };
</script>

</html>