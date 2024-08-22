# Spring Boot + Angular demo - Zigmunds
Spring Boot backend with Angular frontend demo

Requirements:
- JDK Development Kit 17 or higher, MySQL Database (MySQL Database Server and MySQL Workbench)
- Angular CLI: 14.0.7, Node: 20.10.0, npm 10.2.3, typescript 4.6.4

Before Running application you need to setup MySQL database(check sql-script folder):
1) In 1.create-use.sql file you can create database user, you can change it if you want.(where "IDENTIFIED BY" is the users password.) You can also use your own.
   By default just run this script first.
2) In application.properties file you can setup username and password for database. (change it if you changed anything in 1. section or have your own user)
3) Then run 2. and 3. and 4. scripts in order

Before you run the application if you want functionality for stripe payment (with card) and login with okta 
then in application.properties(\Core-Customization\src\main\resources) add your stripe.key.secret for stripe 
and in my-app-config.ts (js-storefront\angular-ecommerce\src\app\config) file add your clientId and issuer.

To run the application:

For BackEnd (you can do one of these): 
1) Need an IDE, for example IntelliJ, open the project in Core-Customization and run SpringdemoApplication.java
2) (Windows) In CMD cd in directory of project in /Core-Customization, run "mvnw package", then run "java -jar target\springdemo-0.0.1-SNAPSHOT.jar" or "mvnw spring-boot:run"

For FrontEnd:
1) (Windows) In CMD cd in directory of project in /js-storefront/angular-ecommerce, run "npm start"

Then you should be able to access it under https://localhost:4200/ and see homepage or https://localhost:8443/api for api list.

Functionalities implemented:
- Homepage where anyone can access and can login.
- Navigation bar has links to Product categories(dynamic).
- Each category has product list with pagination where you can add to cart and see their name, picture and price.
- When you click on name or picture it redirects to product details page where it also adds description field and a link to go back to Product list.
- There's a search bar where you can search products by a keyword and results are also paginated.
- There's a login option powered with okta and when you are logged in you can logout and there are 2 links members 
and orders that only logged in users can see. In members it's just a page saying thank you for being a member but for orders it shows the list of orders done by you.
- There are shopping cart functionality where you can see how many products are in your cart and total price(top right on page).
- When you click on shopping cart(top right) you can see cart details page where you can remove a product or increase/decrease product quantity.
- You can do a checkout/purchase the products by completing the form. The form has a validation functionality. 
(can't be only Whitespace, correct email, minimum 2 characters and so on depending on field) 
There's a checkbox to make shipping address same as billing address for ease of use and credit/debit card fields powered by stripe. 
After you purchase the order data is saved(you can check it in Orders page if you login with same email).
- There's a footer with links but no functionality implemented yet for them.
