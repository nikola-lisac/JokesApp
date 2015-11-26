<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="js/script.js"></script>
<title>JokesApp</title>
</head>
<body>
	<div id="header" class="text-center">
		<h1>InstantLaugh</h1>
	</div>
	<div id="emptySpace"></div>
	<div class="container-fluid">
		<div class="jumbotron">
				<div class="col-md-2 col-md-offset-5 text-center" id="button">
					<button id="jokebtn" class="btn btn-default">Random Joke</button>
				</div>
			<div class="col-md-6 col-md-offset-3">
				<div id="emptySpace"></div>
				<div id="joke"></div>
			</div>
		</div>
	</div>
</body>
</html>