Final_Project_MindTeck_Store

A fictitious virtual books, training materials and gifts store

***NOTE***
-Using Jersey and Hybernate at the same time produced an erroras soon as the dependencies ar added to 
the pom.xml 

-So we changed strategies and are implementing "spring MVC"
-The examples we have been using as guide seem to be outdated
 so the first commit of the spring MVC branch is broken with error: 
 ................java.lang.IllegalArgumentException: Cannot find class [main.java.com.mindteck.store.model.Book]
 I am researching how to fix this at this moment 




TODO LIST

-Create navegation bar <*** DONE ***>

<<<<<<< HEAD:README.txt
-Create Dialogs logic, Registration and Login Dialog <*** 90% ***>
	Up to here it was a great exersice to refresh my javascript and jquery, now let's start building the site
	*A few details are still missing from the forms management:
		-forms should transparent to clicks when closed 
	*CenterDialog and ajax still have to be translated to jquery
	*I will keep adding documentation as I progress and find interesting code.

-Create a footer with its own css file <***Done***> 
	Footer was already included in this commit (great job!)
	It is going to need a bit of css to make it visually compatible with
        the rest, but it looks great.  
	*In fact I am going to change the other forms to follow your style.
	*Feel free to make sugestions and even change whatever you want.
	
	
=======
-Create Dialogs logic and Registration Dialog <*** 90% ***>
	up to here it was a great exersice to refresh my javascript and jquery, now let's start building the site

-Decide If we are going to use jsp to build the app, for now plain HTML and javascript can do. Unless we wanted to showcase what we have learned about it, so far.

-*** I am going to refactor all css to follow your design style and a mobile first approach. <>

-Refactor AJAX access function using jquery <>

-Create following POJOS: <80%>

  product

    book <done>

    training material <done>

    <The super class for the gifts is done>
    tshirt

    mug

    keychain

    t-shirt

  category <Category should be a class instead of a string>

    books

    training

    
  user <done>

    customer <done>

    admin 

-Create Data Access Objects for all POJOS (Hibernate) <10%>
	Get all products
	Get products by category 
	update product
	delete product

	user already exist
	get all users
	get user
	update user
	delete user
	get user cart
	get user past orders

-Create services to access the data objects delined above (JSON) <?>

-Decouple architecture (Spring dependency injection) <>

*** Using AJAX ***
-Create a customer Client/Services(Jersey) <> registration login 
	(ideas for how to do authentication are welcomed) add to cart (should be a list property in the customer POJO) checkout (should empty cart, create order and change inventory accordingly)

-Create an admin Client/Services(Jersey) <> Manage Products (
	Add / Edit / Delete products) Manage Users (Add / Edit / Delete users) Manage Orders (Add / Edit /Delete orders)