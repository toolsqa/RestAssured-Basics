package requests;


import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTRequest {
	
	@Test
	public void createUserTest() {
		RestAssured.baseURI = "http://bookstore.toolsqa.com";
		
		String payload = "{\r\n" + 
				"  \"userName\": \"POST_Request\",\r\n" + 
				"  \"password\": \"POSTRequest@@12345\"\r\n" + 
				"}";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		httpRequest.header("Content-Type","application/json");
		
		Response response = httpRequest.body(payload).post("/Account/v1/User");
		
		int statusCode = response.getStatusCode();
		System.out.println("Response status code is "+statusCode);

	}
	
}
