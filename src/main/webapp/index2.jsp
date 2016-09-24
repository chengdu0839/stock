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
<script type="text/javascript" src="./js/jquery/jquery-3.1.1.js"></script>
<script type="text/javascript" src="./js/easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="./js/bootstrap/js/bootstrap.js"></script>
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
				<ul id="main-nav" class="main-nav nav nav-tabs nav-stacked" style="">
					<li><a href="#"> <i class="glyphicon glyphicon-th-large"></i>
							首页
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
							<li class="active"><a href="#"><i
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
				<nav class="navbar navbar-default" role="navigation">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">Brand</a>
					</div>

					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Link</a></li>
							<li><a href="#">Link</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Dropdown <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
									<li class="divider"></li>
									<li><a href="#">One more separated link</a></li>
								</ul></li>
						</ul>
						<form class="navbar-form navbar-left" role="search">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
						<ul class="nav navbar-nav navbar-right">
							<li><a href="#">Link</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Dropdown <span class="caret"></span></a>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Action</a></li>
									<li><a href="#">Another action</a></li>
									<li><a href="#">Something else here</a></li>
									<li class="divider"></li>
									<li><a href="#">Separated link</a></li>
								</ul></li>
						</ul>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid --> </nav>
			</div>
		</div>
	</div>
</body>
</html>