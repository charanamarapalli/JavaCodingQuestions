package random;

import Objects.InviteProvider;

import java.util.ArrayList;

public class SetMethod {

    public static ArrayList<InviteProvider> inviteProvider() {

        InviteProvider inviteProvider = new InviteProvider();
        inviteProvider.setEmail("user@yopmail.com");
        inviteProvider.setClientId(34890);
        inviteProvider.setEndDate("Tue Oct 25 2022 20:00:40 GMT+0530 (India Standard Time)");
        inviteProvider.setMettlAssessmentId(767591);
        inviteProvider.setName("user");
        inviteProvider.setScheduleKey("4x7qmab1ts");
        inviteProvider.setSeekerEmail("ikl@ikl");
        inviteProvider.setSurveyId(26394);
        inviteProvider.setRole("Peer");
        //inviteProvider.setTimeZone("Asia/Kolkata");


        ArrayList<InviteProvider> postMethod = new ArrayList<InviteProvider>();
        postMethod.add(inviteProvider);


        return postMethod;


    }

}
