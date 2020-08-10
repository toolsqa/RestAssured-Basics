package requests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VerificationOfResponse {
	
	@Test
	public void verifyGETResponse() {
		RestAssured.baseURI = "http://bookstore.toolsqa.com";

		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET, "/BookStore/v1/Books");
		
		int statusCode = response.getStatusCode();
		Assertions.assertEquals(200, statusCode);
		
		Headers headers = response.getHeaders();
		int countOfHeaders = headers.asList().size();
		Assertions.assertEquals(7,countOfHeaders);
		
		String headerValue = response.getHeader("Content-Type");
		Assertions.assertEquals("application/json; charset=utf-8",headerValue);
		
		String responseBodyAsString = response.getBody().asString();
		Assertions.assertTrue(responseBodyAsString.contains("Git Pocket Guide"));
	}

}
