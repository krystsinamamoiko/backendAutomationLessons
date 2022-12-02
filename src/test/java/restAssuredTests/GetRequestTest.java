package restAssuredTests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import data.GetResponseBody;
import data.User;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;

public class GetRequestTest {

    @Test
    public void testGetRequest() {
        int pageId = 1;

        RequestSpecification reqSpec = new RequestSpecBuilder()
            .setBaseUri("https://reqres.in/")
            .setBasePath("api/users")
            .build();

        ResponseSpecification respSpec = new ResponseSpecBuilder()
            .expectStatusCode(200)
            .expectContentType(ContentType.JSON)
            .build();

        GetResponseBody responseBody =
        given()
            //.baseUri("https://reqres.in/")
            //.basePath("api/users?page={page}")
            .queryParam("page", pageId)
            .spec(reqSpec)
            .log().all()
        .when()
            .get()
        .then()
            //.contentType(ContentType.JSON)
            //.statusCode(200)
            .spec(respSpec)
            .extract()
            .body()
            .as(GetResponseBody.class);

        //assertThat(responseBody.getData(), is(pageId));

        for(User user : responseBody.getData()) {
            System.out.println(user.getEmail());
            assertThat(user.getEmail().contains("reqres.in"), is(true));
        }
    }
}
