package surveyApp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddProvidersListRequest {


    @SerializedName("seekerName")
    @Expose
    private String seekerName;
    @SerializedName("seekerEmail")
    @Expose
    private String seekerEmail;
    @SerializedName("providerName")
    @Expose
    private String providerName;
    @SerializedName("providerEmail")
    @Expose
    private String providerEmail;
    @SerializedName("relation")
    @Expose
    private String relation;
    @SerializedName("scheduler")
    @Expose
    private String scheduler;


    public AddProvidersListRequest() {
    }

    public AddProvidersListRequest(String seekerName, String seekerEmail, String providerName,
                                   String providerEmail, String relation) {
        super();
        this.seekerName = seekerName;
        this.seekerEmail = seekerEmail;
        this.providerName = providerName;
        this.providerEmail = providerEmail;
        this.relation = relation;
    }

    public AddProvidersListRequest(String seekerName, String seekerEmail, String providerName,
                                   String providerEmail, String relation, String scheduler) {
        super();
        this.seekerName = seekerName;
        this.seekerEmail = seekerEmail;
        this.providerName = providerName;
        this.providerEmail = providerEmail;
        this.relation = relation;
        this.scheduler = scheduler;
    }

    public String getSeekerName() {
        return seekerName;
    }

    public void setSeekerName(String seekerName) {
        this.seekerName = seekerName;
    }

    public String getscheduler() {
        return scheduler;
    }

    public void setscheduler(String scheduler) {
        this.scheduler = scheduler;
    }

    public String getSeekerEmail() {
        return seekerEmail;
    }

    public void setSeekerEmail(String seekerEmail) {
        this.seekerEmail = seekerEmail;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderEmail() {
        return providerEmail;
    }

    public void setProviderEmail(String providerEmail) {
        this.providerEmail = providerEmail;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

}


