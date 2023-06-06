package ApiMethods;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostRequest {
    @Test

    public void posttest(){
        JSONObject obj=new JSONObject();
        obj.put("id", "101");
        obj.put("name", "Vinay");
        obj.put("job", "QA");

        Response res = given().header("Accept", "application/json")
                .body(obj.toString())
                .when()
                .post("https://reqres.in/api/users")
                .then().extract().response();


        System.out.println(res.asPrettyString());
        System.out.println(res.getStatusCode());
        System.out.println(res.getContentType());

        AssertJUnit.assertEquals(res.statusCode(), 201);

    }


    \
}
