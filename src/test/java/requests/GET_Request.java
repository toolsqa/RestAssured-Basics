package requests;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GET_Request {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://bookstore.toolsqa.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET, "/BookStore/v1/Books");
		
		int statusCode = response.getStatusCode();
		System.out.println("Response status code is "+statusCode);
		
		Headers header = response.getHeaders();
		System.out.println("Headers of the response body are "+header);
		
		ResponseBody body = response.getBody();
		body.prettyPrint();
		//System.out.println("Response Body is "+body.asString());
		
	}

}
