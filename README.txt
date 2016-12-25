Final_Project_MindTeck_Store

A fictitious virtual books, training materials and gifts store

TODO LIST

-Create navegation bar <*** DONE ***>

-Create Dialogs logic and Registration Dialog <*** 90% ***>
	up to here it was a great exersice to refresh my javascript and jquery, now let's start building the site

-Create a footer with its own css file <>

-Decide If we are going to use jsp to build the app, for now plain HTML and javascript can do. Unless we wanted to showcase what we have learned about it, so far.

-Create following POJOS: <>

  product

    book

    training material

    tshirt

    mug

    keychain

  category

    books

    training

    gifts  

  user

    customer

    admin
-Create Data Access Objects for all POJOS (Hibernate) <>

-Decouple architecture (Spring dependency injection) <>

-Create a customer Client/Services(Jersey) <> registration login (ideas for how to do authentication are welcomed) add to cart (should be a list property in the customer POJO) checkout (should empty cart, create order and change inventory accordingly)

-Create an admin Client/Services(Jersey) <> Manage Products (Add / Edit / Delete products) Manage Users (Add / Edit / Delete users) Manage Orders (Add / Edit /Delete orders)