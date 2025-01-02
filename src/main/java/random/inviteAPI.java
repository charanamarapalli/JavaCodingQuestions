package random;

import Objects.InviteProvider;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Reporter;

import java.util.List;

public class inviteAPI {

    protected static RequestSpecification requestSpecification = new RequestSpecBuilder().setRelaxedHTTPSValidation()
            //.log(LogDetail.ALL)
            .setBaseUri("https://mettl.pro").
            addHeader("Content-Type", "application/json").build();


    //********************** Delete All Participants By SurveyId - self nomination flow****************************/
    public static Response inviteProvider(List<InviteProvider> invite) {
        try {
            return RestAssured.given().spec(requestSpecification).queryParam("language","en")
                    .body(new com.google.gson.Gson().toJson(invite)).log().all()
                    .post("/360feedback/survey-api/invite-provider");
        } catch (Exception e) {
            Reporter.log("Delete All Participant By Survey Id Failed" + e.getMessage());
            return null;
        }
    }

    public static Response env() {
        try {
            return RestAssured.given().spec(requestSpecification)
                    .get("/360feedback/env");
        } catch (Exception e) {
            Reporter.log("Delete All Participant By Survey Id Failed" + e.getMessage());
            return null;
        }
    }

    public static Response getSeekerByProvider () {
        try {
            return RestAssured.given().spec(requestSpecification).log().all()
                    .post("/360feedback/survey-api/getSeekerByProvider/tinyCode?secCode=69JC5XYp6PkLzFSV7zTgFA&timezoneStr=Asia/Calcutta");
        } catch (Exception e) {
            Reporter.log("Delete All Participant By Survey Id Failed" + e.getMessage());
            return null;
        }
    }

    public static Response inviteProviderJsonDirectly() {
        try {
            return RestAssured.given().spec(requestSpecification).queryParam("language","en")
                    .body("{\n" +
                            "        \"email\": \"user@yopmail.com\",\n" +
                            "        \"name\": \"user\",\n" +
                            "        \"scheduleKey\": \"4x7qmab1ts\",\n" +
                            "        \"mettlAssessmentId\": 767591,\n" +
                            "        \"endDate\": \"Tue Oct 25 2022 20:00:40 GMT+0530 (India Standard Time)\",\n" +
                            "        \"surveyId\": 26394,\n" +
                            "        \"clientId\": 34890,\n" +
                            "        \"role\": \"Peer\",\n" +
                            "        \"timeZone\": \"Asia/Kolkata\",\n" +
                            "        \"seekerEmail\": \"ikl@ikl\"\n" +
                            "    }").log().all()
                    .post("/360feedback/survey-api/invite-provider");
        } catch (Exception e) {
            Reporter.log("Delete All Participant By Survey Id Failed" + e.getMessage());
            return null;
        }
    }



}
