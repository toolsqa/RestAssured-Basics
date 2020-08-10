
package requests;

import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETERequest {
	
	@Test
	public void removeBookFromUser() {
		
		RestAssured.baseURI = "https://bookstore.toolsqa.com";
		
		RequestSpecification request = RestAssured.given();
		
		String removeBookDetails = "{\r\n" + 
				"  \"userId\": \"a178a104-e3c0-4f50-bbd5-3e4919f063e8\",\r\n" + 
				"  \"isbn\": \"9781449325862\"\r\n" + 
				"}";
		
		String credentials = "TOOLSQA-Test:Test@@123";
		
		byte[] encodedCredentials = Base64.encodeBase64(credentials.getBytes());
		
		String encodedCredentialsAsString = new String(encodedCredentials);
		
		request.header("Authorization","Basic "+encodedCredentialsAsString)
			   .header("Content-Type","application/json");
		
		Response response = request.body(removeBookDetails).delete("/BookStore/v1/Book");
		
		System.out.println("Response Status Code is "+response.getStatusCode());
		
		Assertions.assertEquals(204, response.getStatusCode());

		
	}
	

}
