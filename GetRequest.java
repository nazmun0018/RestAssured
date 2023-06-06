public class GetRequest {
    @Test
    public void getrequest(){
        Response  res=given().header("Accept","application/json")
                .when()
                .get("https://reqres.in/api/users?page=2")
                .then().extract().response();
    }
    System.out.p
}
