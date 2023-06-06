package ApiMethods;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {
    @Test

    public void puttest() {
        JSONObject obj=new JSONObject();
        obj.put("id", "102");
        obj.put("name", "Vinay");
        obj.put("job", "SDET");

        Response res = given().header("Accept", "application/json")
                .body(obj.toString())
                .when()
                .put("https://reqres.in/api/users/2")
                .then().extract().response();


        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusCode());
        System.out.println(res.getContentType());

        AssertJUnit.assertEquals(res.statusCode(), 200);
    }
}
