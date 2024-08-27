package surveyApp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class populateData {

    ArrayList<AddProvidersListRequest> populateParticipantList(int n) {   // Expecting a array with type <AddProvidersListRequest>
        String providerNameLoopA = "provider" + this.randomString(6).toLowerCase();
        String providerEmailLoopA = "provider" + this.randomString(6).toLowerCase() + "@yopmail.com";
        String providerNameLoopB = "provider" + this.randomString(6).toLowerCase();
        String providerEmailLoopB = "provider" + this.randomString(6).toLowerCase() + "@yopmail.com";

        System.out.println(providerNameLoopA + "space" + providerEmailLoopA + "Space" + providerNameLoopB + "space" + providerEmailLoopB);
        ArrayList<AddProvidersListRequest> returnList = new ArrayList<AddProvidersListRequest>();  // hence created a arrayList with sametype.

        while (n-- != 0) {
            String seekerNameLoop = "seeker" + this.randomString(6).toLowerCase();
            String seekerEmailLoop = "seeker" + this.randomString(6).toLowerCase() + "@yopmail.com";
            returnList.add(new AddProvidersListRequest(seekerNameLoop, seekerEmailLoop, seekerNameLoop, seekerEmailLoop, "Self"));
            returnList.add(new AddProvidersListRequest(seekerNameLoop, seekerEmailLoop, providerNameLoopA, providerEmailLoopA, "Peer"));
            returnList.add(new AddProvidersListRequest(seekerNameLoop, seekerEmailLoop, providerNameLoopB, providerEmailLoopB, "Peer"));

        }

        return returnList; // ArrayList with 3 objects are sent here.


    }


    public String randomString(int len) {
        String AB = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }

    public void verifyTestMLFlow(ArrayList<AddProvidersListRequest> participantData) {

    Set<String> uniqueSeekers = new HashSet<>();
    ArrayList<AddProvidersListRequest> participantDataIterative = (ArrayList<AddProvidersListRequest>) participantData.stream().collect(Collectors.toList());
        participantDataIterative.removeIf(p ->!uniqueSeekers.add(p.getSeekerEmail()));
    int j = 0;

        for(
    AddProvidersListRequest seekerItr :participantDataIterative)

    {
      System.out.println(seekerItr);
      System.out.println(seekerItr.getProviderEmail() + seekerItr.getProviderName() + seekerItr.getscheduler() + seekerItr.getSeekerName()+ seekerItr.getSeekerEmail() + seekerItr.getRelation());
    }

}


    public static void main(String[] args) {

        populateData d = new populateData();
        ArrayList<AddProvidersListRequest> ad= d.populateParticipantList(1);
        d.verifyTestMLFlow(ad);

    }
}
