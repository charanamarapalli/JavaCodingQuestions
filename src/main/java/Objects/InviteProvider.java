package Objects;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class InviteProvider {

    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("scheduleKey")
    @Expose
    private String scheduleKey;
    @SerializedName("mettlAssessmentId")
    @Expose
    private Integer mettlAssessmentId;
    @SerializedName("endDate")
    @Expose
    private String endDate;
    @SerializedName("surveyId")
    @Expose
    private Integer surveyId;
    @SerializedName("clientId")
    @Expose
    private Integer clientId;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("seekerEmail")
    @Expose
    private String seekerEmail;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScheduleKey() {
        return scheduleKey;
    }

    public void setScheduleKey(String scheduleKey) {
        this.scheduleKey = scheduleKey;
    }

    public Integer getMettlAssessmentId() {
        return mettlAssessmentId;
    }

    public void setMettlAssessmentId(Integer mettlAssessmentId) {
        this.mettlAssessmentId = mettlAssessmentId;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Integer surveyId) {
        this.surveyId = surveyId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getSeekerEmail() {
        return seekerEmail;
    }

    public void setSeekerEmail(String seekerEmail) {
        this.seekerEmail = seekerEmail;
    }

}