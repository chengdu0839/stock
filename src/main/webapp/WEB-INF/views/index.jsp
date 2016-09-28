<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>json交互测试</title>
<link rel="stylesheet" type="text/css"
	href="./js/bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="./js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="./js/easyui/themes/icon.css">
<link rel="stylesheet" type="text/css" href="./css/main.css">
<link rel="stylesheet" href="./css/bootstrap-addtabs.css" type="text/css" media="screen"/>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2">
				<div class="navbar navbar-duomi navbar-static-top" role="navigation">
					<div class="container-fluid">
						<div class="navbar-header">
							<a class="navbar-brand img-logo" href="#" id="logo">金融数据分析 </a>
						</div>
					</div>
				</div>
				<ul id="left-nav" class="topbar main-nav nav nav-tabs nav-stacked" style="">
					<li class="active"><a href="#" data-addtab="mail22" url="firm/crawl"> <i class="glyphicon glyphicon-th-large"></i>
							首页
					</a></li>
					
					<li><a href="#" data-addtab="mail2" url="firm/crawl"> <i class="glyphicon glyphicon-fire"></i>
							关于系统 <span class="badge pull-right">1</span>
					</a></li>
					
					
					<li><a href="#systemSetting" class="nav-header collapsed"
						data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>
							系统管理 <span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
					</a>
						<ul id="systemSetting" class="nav nav-list secondmenu collapse"
							style="height: 0px;">
							<li><a href="#"><i class="glyphicon glyphicon-user"></i>&nbsp;用户管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>&nbsp;菜单管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-asterisk"></i>&nbsp;角色管理</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-edit"></i>&nbsp;修改密码</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-eye-open"></i>&nbsp;日志查看</a></li>
						</ul></li>
					<li><a href="#configSetting" class="nav-header collapsed"
						data-toggle="collapse"> <i
							class="glyphicon glyphicon-credit-card"></i> 配置管理 <span
							class="pull-right glyphicon  glyphicon-chevron-toggle"></span>
					</a>
						<ul id="configSetting" class="nav nav-list secondmenu collapse in">
							<li><a href="#"><i
									class="glyphicon glyphicon-globe"></i>&nbsp;全局缺省配置</a></li>
							<li><a href="#"><i
									class="glyphicon glyphicon-star-empty"></i>&nbsp;未开通用户配置</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-star"></i>&nbsp;退订用户配置</a></li>
							<li><a href="#"><i
									class="glyphicon glyphicon-text-width"></i>&nbsp;试用用户配置</a></li>
							<li><a href="#"><i class="glyphicon glyphicon-ok-circle"></i>&nbsp;开通用户配置</a></li>
						</ul></li>

					<li><a href="#disSetting" class="nav-header collapsed"
						data-toggle="collapse"> <i class="glyphicon glyphicon-globe"></i>
							分发配置 <span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
					</a>
						<ul id="disSetting" class="nav nav-list secondmenu collapse">
							<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>&nbsp;分发包配置</a></li>
						</ul></li>

					<li><a href="#dicSetting" class="nav-header collapsed"
						data-toggle="collapse"> <i class="glyphicon glyphicon-bold"></i>
							字典配置 <span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
					</a>
						<ul id="dicSetting" class="nav nav-list secondmenu collapse">
							<li><a href="#"><i
									class="glyphicon glyphicon-text-width"></i>&nbsp;关键字配置</a></li>
						</ul></li>
					<li><a href="#"> <i class="glyphicon glyphicon-fire"></i>
							关于系统 <span class="badge pull-right">1</span>
					</a></li>

				</ul>
			</div>
			<div class="col-md-10">
<!-- 			<header class="topbar admin-header">
    <div class="topbar-collapse">
        Button group
        <div class="btn-group" role="group" aria-label="...">
            <button type="button" class="btn btn-default" data-addtab="mail" url="firm/crawl">
                <i class="glyphicon glyphicon-envelope"></i>我的邮件
            </button>
            <button type="button" class="btn btn-default" data-addtab="profile" url="/admin/profile">
                <i class="glyphicon glyphicon-user"></i>我的属性
            </button>
            <button type="button" class="btn btn-default" data-addtab="message" url="/admin/message" content="指定内容">
                <i class="glyphicon glyphicon-bullhorn"></i>指定内容
            </button>
            <button type="button" class="btn btn-default" data-addtab="setting" url="/admin/setting" title="指定标题">
                <i class="glyphicon glyphicon-cog"></i>指定标题
            </button>
            <button type="button" class="btn btn-default" data-addtab="ajax" url="/admin/profiles" ajax='true'>
                <i class="glyphicon glyphicon-user"></i>使用AJAX
            </button>
            <button type="button" class="btn btn-default" onclick="Addtabs.closeAll();">
                <i class="glyphicon glyphicon-remove"></i>关闭所有
            </button>
        </div>
    </div>
</header> -->

<div class="main" style="margin-left:-25px;">
    <div id="tabs">
        <!-- Nav tabs -->
        <ul class="nav nav-pills" role="tablist">
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
        </div>

    </div>

</div>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript" src="./js/jquery/jquery-3.1.1.js"></script>
<script type="text/javascript" src="./js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./js/bootstrap/js/bootstrap.js"></script>
    <script src="./js/bootstrap-addtabs.js"></script>
<script type="text/javascript">

$(function () {
    $('#tabs').addtabs({monitor: '.topbar'});
})

    $("#left-nav li").click(function (e) {
    	e.preventDefault();
    	$("#left-nav").find("li.active").removeClass("active");
    	if (!$(this).is(':has(li)')) {
    		$(this).addClass('active');
    	}
    })
</script>
</html>