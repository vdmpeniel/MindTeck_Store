<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>


		<!-- JUMBOTRON -->
		<div class="customJumbotron">	
			<div class="backgroundImage"></div>	
			<div class="textMesage">	
		  		<h1><strong>MINDTECK</strong> ACADEMY </h1> 
		  		<p>The most comprehensive learning platform out there...</p> 
	  		</div>  			
		</div>
		<!-- END JUMBOTRON -->

		<!-- USER RECOGNITION BAR -->
		<div class="container-fluid" id="UserRecognitionBar">
			<div class="recognitionContainer">
				<div class="recognitionBox col-sm-2" id="Profile">
					<div class="profileAvatar"></div>	
					<h4>Hello, Dan!</h4>							
				</div>				

				<div class="recognitionBox col-sm-2" id="Orders">
					<p class="title">Your orders</p>
					<p class="value">142 Items</p>
				</div>

				<div class="recognitionBox col-sm-2" id="Recommended">
					<p class="title">Recommended for you</p>
					<p class="value">XBOX One</p>
				</div>
			</div>
		</div>
		<!-- END USER RECOGNITION BAR -->


		<!-- MAIN CONTENT -->
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
		<!-- END MAIN CONTENT -->
		
		
		<!-- DIALOGS -->
		<div id="Dialogs">
			<!-- REGISTRATION DIALOG -->
			<div class="dialogBox" id="RegistrationDialog" >
				<h2>User Registration</h2>
				<a class="closeDialog" id="CloseDialog" href=# ><span class="glyphicon glyphicon-remove-circle"></span></a>

				<form class="form-horizontal" id="RegistrationForm" action="">
					<!-- Inputs -->
					<div class="form-group">
						<label class="col-sm-3 control-label" for="NameInput">Name:</label>
						<div class="col-sm-7">
							<input class="form-control" id="NameInput" type="text" name="name" value="Enter name here.">
							<span></span>
						</div>
					</div>	
					<div class="form-group">
						<label class="col-sm-3 control-label" for="LastNameInput">Last name:</label>
						<div class="col-sm-7">
							<input class="form-control" id="LastNameInput" type="text" name="lastName" value="Enter last name here.">
							<span></span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" for="EmailInput">Email:</label>
						<div class="col-sm-7">
							<input class="form-control" id="EmailInput" type="text" name="email" value="Email goes here.">
							<span></span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" for="PhoneInput">Phone:</label>
						<div class="col-sm-7">
							<input class="form-control" id="PhoneInput" type="text" name="phone" value="(000)-000-0000">
							<span></span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" for="PasswordInput">Password:</label>
						<div class="col-sm-7">
							<input class="form-control" id="PasswordInput" type="password" name="password" value="">
							<span></span>
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-3 control-label" for="PasswordRetypeInput">Password:</label>
						<div class="col-sm-7">
							<input class="form-control" id="PasswordRetypeInput" type="password" name="passwordRetype" value="">
							<span></span>
						</div>
					</div>


					<!-- Submit -->
					<div class="form-group">
						<div class="col-sm-3"></div>
						<div class="col-sm-3">				
							<button class="btn btn-block btn-primary" type="submit" name="submit" >Submit</button>					
						</div>
					</div>
				</form>

				<!-- Warnings -->
				<div id="RegistrationWarnings" class="warning">
					<h3><span class="glyphicon glyphicon-exclamation-sign"></span> Ups! Something went wrong. </h3>
					<ul></ul>
				</div>
			</div>
			<!-- END REGISTRATION DIALOG -->


			<!-- LOGIN DIALOG -->
			<div class="dialogBox" id="LoginDialog" >
				<h2>User Login</h2>
				<a class="closeDialog" id="CloseDialog" href=# ><span class="glyphicon glyphicon-remove-circle"></span></a>

				<form class="form-horizontal" id="LoginForm" action="">
					<!-- Inputs -->
					<div class="form-group">
						<label class="col-sm-3 control-label" for="LoginEmailInput" >Email:</label>
						<div class="col-sm-7">
							<input class="form-control" id="LoginEmailInput" type="text" name="name" value="Email address goes here.">
							<span></span>
						</div>
					</div>	
					<div class="form-group">
						<label class="col-sm-3 control-label" for="LoginPasswordInput" >Password:</label>
						<div class="col-sm-7">
							<input class="form-control" id="LoginPasswordInput" type="password" name="password" value="">
							<span></span>
						</div>
					</div>

					<!-- Submit -->
					<div class="form-group">
						<div class="col-sm-3"></div>
						<div class="col-sm-3">				
							<button class="btn btn-block btn-primary" type="submit" name="submit" >Submit</button>					
						</div>
					</div>
				</form>	

				<!-- Warnings -->
				<div id="LoginWarnings" class="warning">
					<h3><span class="glyphicon glyphicon-exclamation-sign"></span> Ups! Something went wrong. </h3>
					<ul></ul>
				</div>
			</div>
			<!-- END LOGIN DIALOG --> 
		</div>		
		<!-- END DIALOGS -->