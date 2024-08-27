package Survey;

import Objects.InviteProvider;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RunTestFlow {



   /* @Test
    public void TestFlow() {
        List<InviteProvider> InviteProviderObj =SetMethod.inviteProvider();
        for (int i = 0; i < InviteProviderObj.size(); i++)
            System.out.print(InviteProviderObj.get(i) + " ");

        Response approveSurveyNominationResponse = inviteAPI.inviteProvider(InviteProviderObj);
        Assert.assertNotNull(approveSurveyNominationResponse, "approveSurveyNomination api returned null response.");
        Assert.assertEquals(approveSurveyNominationResponse.getStatusCode(), 200, "approveSurveyNomination API did not return 200");
    }


    @Test
    public void TestFlow1() {


        Response approveSurveyNominationResponse = inviteAPI.getSeekerByProvider();
        Assert.assertNotNull(approveSurveyNominationResponse, "approveSurveyNomination api returned null response.");
        Assert.assertEquals(approveSurveyNominationResponse.getStatusCode(), 200, "approveSurveyNomination API did not return 200");
    }

    @Test
    public void TestFlow2() {


        Response approveSurveyNominationResponse = inviteAPI.inviteProviderJsonDirectly();
        Assert.assertNotNull(approveSurveyNominationResponse, "approveSurveyNomination api returned null response.");
        Assert.assertEquals(approveSurveyNominationResponse.getStatusCode(), 200, "approveSurveyNomination API did not return 200");
    }*/
}
