package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


//given()-content type,set cookies,add auth,param
//when()-get,post,put,delete
//then()-validate sattus code,extract response


public class HTTPrequest {
	@Test
	void getUsers() {
		
		given()
		//https://reqres.in/api/users/2
		.when()
		   .get("https://reqres.in/api/users?page=2")
		
		.then()
		   .statusCode(200)
		   .body("page",equalTo(2))
		   .log().all();
		   
	}

}
