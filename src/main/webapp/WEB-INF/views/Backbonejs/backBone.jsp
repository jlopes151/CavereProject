<!doctype html>
<html lang="en" data-framework="backbonejs">
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<title>Backbone.js • Project</title>
		<link rel="stylesheet" href="resources/css/Backbonejs/base.css">
		<link rel="stylesheet" href="resources/css/Backbonejs/main.css">
		<title>Backbone Proto Using Handlebar JS</title>
	</head>
	<body>
		<script src="resources/js/Backbonejs/lib/jquery-2.0.3.js"></script>
		<script src="resources/js/Backbonejs/lib/underscore-min.js"></script>
		<script src="resources/js/Backbonejs/lib/handlebars-v1.3.0.js"></script>
		<script src="resources/js/Backbonejs/lib/backbone-min.js"></script>
		<script src="resources/js/Backbonejs/lib/backbone.localStorage.js"></script>
		<script src="resources/js/Backbonejs/models/todo.js"></script>
		<script src="resources/js/Backbonejs/collections/todos.js"></script>
		<script src="resources/js/Backbonejs/views/todo-view.js"></script>
		<script src="resources/js/Backbonejs/views/app-view.js"></script>
		<script src="resources/js/routers/router.js"></script>
		<script src="resources/js/Backbonejs/app.js"></script>
		<div id="todoapp">
			<div id="header">
				<div id="banner" class="bannerClass">
					<img src="resources/images/Backbonejs/emoticonCool.gif">
				</div>
				<div id="mainMenu">
					<a href=#>One</a>
					<a href=#>Two</a>
					<a href=#>Three</a>
				</div>
			</div>
			<div id="content">
				<script type="text/template" id="mainpage-template">
				<div id="main">{{title}}</div>
			</script>
			</div>
			<div id="footer">
				<label style="float: left">Status</label>
				<label style="float: right">Date Time</label>
			</div>
		</div>
	</body>
</html>

