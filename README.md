![Rest-Assured Logo](http://rest-assured.io/img/logo-transparent.png)                     
# RestAssured-Basics
Rest Assured Basics - Video Course

## About
This Repository is a compilation of the coding exercises covered for API Testing using Rest Assured Library. It walks through the simple ways of composing HTTP requests in Rest Assured. The repository is to be used as a learning supplement to the code exercises covered in the video series. It will be fruitful if the code is tried out first and then referred in case the output doesn't match the expected values.

## Rest Assured
Rest Assured Tutorial which is one of the most used library for REST API Automation Testing. Rest-Assured is a Java-based library that is used to test RESTful Web Services. This library behaves like a headless Client to access REST web services. We can create highly customize-able HTTP Requests to send to the Restful server. This enables us to test a wide variety of Request combinations and in turn test different combinations of core business logic.

Rest-Assured library also provides the ability to validate the HTTP Responses received from the server. For e.g. we can verify the Status code, Status message, Headers and even the Body of the response. This makes Rest-Assured a very flexible library that can be used for testing.

More information in this webpage: <http://rest-assured.io/>

Rest Assured Github repository: <https://github.com/rest-assured/rest-assured>


## Pre-requisites:
* [Java 8 installed](https://www.toolsqa.com/selenium-webdriver/install-java/)
* Maven Installed : [Windows Installation](https://www.toolsqa.com/java/maven/how-to-install-maven-on-windows/) OR [Mac Installation](https://www.toolsqa.com/java/maven/how-to-install-maven-on-mac/)
* [Eclipse / IntelliJ IDE installed](https://www.toolsqa.com/mobile-automation/appium/install-eclipse-ide-and-set-up-a-project/)
* [Create Maven project in Eclipse](https://www.toolsqa.com/java/maven/create-new-maven-project-eclipse/)


## API
The APIs used for these classes to practice is based on very easy to use [Book Store API](https://bookstore.toolsqa.com/swagger/).
It gives a real world live project experience while using the sandbox environment of swagger tool to test the APIs.

### Endpoints

##### Account
* **POST**  /Account/v1/Authorized
* **POST**  /Account/v1/GenerateToken
* **POST**  /Account/v1/User

##### BookStore
* **GET**  /BookStore/v1/Books
* **POST**  /BookStore/v1/Books
* **DELETE**  /BookStore/v1/Book
* **PUT**  /BookStore/v1/Books/{ISBN}

## Framework

### Structure

This project is a standard Maven Java project with src folders and pom.xml

### Tests

`src/test/java/`  package request package which hosts all the tests discussed in the video series.

### Installation
`mvn clean install` To install the project and it's dependencies 

## Help
If you got any questions don't hesitate to contact me: [LinkedIn-Yashraj Gore](https://www.linkedin.com/in/yashrajgore/) 