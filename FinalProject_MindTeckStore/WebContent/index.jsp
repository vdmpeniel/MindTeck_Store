<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>AJAX in action</title>

<!-- BOOSTRAP -->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<!-- CUSTOM CSS -->
<link rel="stylesheet" href="css/fonts.css">
<link rel="stylesheet" href="css/main.css">
<link rel="stylesheet" href="css/navigationBar.css">
<link rel="stylesheet" href="css/jumbotron.css">
<link rel="stylesheet" href="css/dialog.css">


<!-- JAVASCRIPT -->
<script src="javascript/UIController.js" type="text/javascript"></script>
<script src="javascript/ajax.js" type="text/javascript"></script>
<script src="javascript/Forms.js" type="text/javascript"></script>
<script src="javascript/userInterface.js" type="text/javascript"></script>

</head>

<body>

	<!-- Fixed navbar -->
	<nav class="navbar navbar-inverse">
		<div class="container">
		
		
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<!--brand name-->
				<a class="navbar-brand" href="#"> <span class="title logo"><strong>MINDTECK</strong>
						ACADEMY</span>
					<div class="title verticalBar"></div> <span class="title name">STORE</span>
				</a>
			</div>
			
			
			
			
			
			
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
					<li><a href="#contact">Contact</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Categories <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#books">Books</a></li>
							<li><a href="#gifts">Gifts</a></li>
							<li><a href="#training">Training</a></li>
						</ul>
					</li>
				</ul>
				
				<ul class="nav navbar-nav navbar-right">
					<li>
						<a id="SignUp" href="#"><span class="glyphicon glyphicon-user"></span>Sign Up</a>
					</li>
					<li class="active">
						<a href="#">
							<span class="glyphicon glyphicon-log-in"></span> Login 
							<spanclass="sr-only">(current)</span>
						</a>
					</li>
				</ul>
				
				
				<ul>
					<li>
						<form class="navbar-form navbar-right">

							<div class="input-group">
								<input type="text" class="form-control" placeholder="Search">
								<div class="input-group-btn">
									<button class="btn btn-default" type="submit">
										<i class="glyphicon glyphicon-search"></i>
									</button>
								</div>
							</div>
						</form>
					</li>
				</ul>
				
				
			</div>
			<!--/.nav-collapse -->
		</div>
	</nav>























	<header class="jumbotron">

		<!-- Main component for a primary marketing message or call to action -->

		<div class="container">
			<div class="row row-header">

				<div class="col-xs-12 col-sm-2">
					<p style="padding: 20px;"></p>
					<div class="backgroundImage"></div>
					<div class="textMesage" id="about">
						<h1>
							<strong>MINDTECK</strong> ACADEMY
						</h1>
						<p>The most comprehensive learning platform out there...</p>
					</div>

					<div class="col-xs-12 col-sm-4"></div>
				</div>
			</div>
	</header>




	<div class="container-fluid">
		<div class="mainContent">

			<section>
				<div class="page-header" id="books">
					<h2>
						Books<small>This is the books section.</small>
					</h2>

					<table class="table table-striped table-hover">
						<thead>
							<tr class="bg-success">
							    <th></th>
								<th>Book Name</th>
								<th>Book Category</th>
								<th>Book Condition</th>
								<th>Price</th>
							</tr>
						</thead>
						<c:forEach items="${books}" var="books">
							<tr>
								<td><img src="#" alt="image" /></td>
								<td>${book.bookName}</td>
								<td>${book.bookCategory}</td>
								<td>${book.bookCondition}</td>
								<td>${book.bookPrice}USD</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</section>

			<section>
				<div class="page-header" id="gifts">
					<h2>Gifts<small>This is the gifts section.</small></h2>
					<table class="table table-striped table-hover">
						<thead>
							<tr class="bg-success">
							    <th></th>
								<th>Gift Name</th>
								<th>Gift Category</th>
								<th>Gift Condition</th>
								<th>Price</th>
							</tr>
						</thead>
						<c:forEach items="${gifts}" var="gifts">
							<tr>
								<td><img src="#" alt="image" /></td>
								<td>${gift.giftName}</td>
								<td>${gift.giftCategory}</td>
								<td>${gift.giftCondition}</td>
								<td>${gift.giftPrice}USD</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</section>

			<section>
				<div class="page-header" id="training">
					<h2>Training<small>This is the training section.</small></h2>
					<table class="table table-striped table-hover">
						<thead>
							<tr class="bg-success">
							    <th></th>
								<th>Training Name</th>
								<th>Training Category</th>
								<th>Training Condition</th>
								<th>Price</th>
							</tr>
						</thead>
						<c:forEach items="${trainings}" var="trainings">
							<tr>
								<td><img src="#" alt="image" /></td>
								<td>${training.trainingName}</td>
								<td>${training.trainingCategory}</td>
								<td>${training.trainingCondition}</td>
								<td>${training.trainingPrice}USD</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</section>

		</div>
	</div>

	<!-- DIALOGS -->
	<div id="Dialogs"></div>

	<!-- CUSTOM JAVASCRIPT -->
	<script src="javascript/mainUI.js" type="text/javascript"></script>

</body>
</html>