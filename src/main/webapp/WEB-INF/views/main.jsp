<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Music App</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-
		awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="resources/css/style.css" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.js"
	type="text/javascript"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-resource.js"
	type="text/javascript"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-resource.min.js"
	type="text/javascript"></script>

<!-- 		<script src="resources/angular/User/user.controller.js"></script> -->
<!-- 		<script src="resources/angular/User/user.dataservice.js"></script> -->
<script src="resources/angular/playlist/playlist.controller.js"
	type="text/javascript"></script>
<!-- <script src="resources/angular/playlist/playlist.tmpl.html" -->
<!-- 	type="text/javascript"></script> -->
<script src="resources/angular/playlist/playlist.dataservice.js"
	type="text/javascript"></script>
	<script src="resources/angular/playlist/playlist.module.js"
	type="text/javascript"></script>
<script src="resources/angular/playlist/playlist.component.js" type="text/javascript"></script>
<script src="resources/angular/musicapp.module.js"
	type="text/javascript"></script>


</head>

<body background="resources/music.jpg" ng-app="musicapp">

 	<header class="title">Welcome</header>
	<div class="topnav">
		<a class="active" href="home">Home</a>

	</div>

			<div>
			<br>
			<form ng-submit="searchInput()" action="">
	    		<input type="text" ng-model="input" size="50" placeholder="Search for a song or artist"/>
	    		<input type="submit" value="Search"/>
			</form>
		
			<br><br><br>
			<div>
			<button ng-click="createNewPlaylist()" ng-model="playlist">Create New Playlist</button>
			<div ng-repeat="playlist in playlist">
	        <h3>{{playlist.title}}</h3>
			</div>
	    </div>
	    </div>
</body>
</html>