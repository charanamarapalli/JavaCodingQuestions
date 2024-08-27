package Objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class EnvObj {

    @SerializedName("production")
    @Expose
    private Boolean production;
    @SerializedName("baseUrl")
    @Expose
    private String baseUrl;
    @SerializedName("serverUrl")
    @Expose
    private String serverUrl;
    @SerializedName("fileUrl")
    @Expose
    private String fileUrl;
    @SerializedName("surveyReportUrl")
    @Expose
    private String surveyReportUrl;
    @SerializedName("surveyReportUrlOld")
    @Expose
    private String surveyReportUrlOld;
    @SerializedName("mettlServerUrl")
    @Expose
    private String mettlServerUrl;
    @SerializedName("mettlServerTestUrl")
    @Expose
    private String mettlServerTestUrl;
    @SerializedName("enableGTM")
    @Expose
    private Boolean enableGTM;
    @SerializedName("isBulkDownloadOldUrl")
    @Expose
    private Boolean isBulkDownloadOldUrl;

    public Boolean getProduction() {
        return production;
    }

    public void setProduction(Boolean production) {
        this.production = production;
    }

    public EnvObj withProduction(Boolean production) {
        this.production = production;
        return this;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public EnvObj withBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public EnvObj withServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public EnvObj withFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }

    public String getSurveyReportUrl() {
        return surveyReportUrl;
    }

    public void setSurveyReportUrl(String surveyReportUrl) {
        this.surveyReportUrl = surveyReportUrl;
    }

    public EnvObj withSurveyReportUrl(String surveyReportUrl) {
        this.surveyReportUrl = surveyReportUrl;
        return this;
    }

    public String getSurveyReportUrlOld() {
        return surveyReportUrlOld;
    }

    public void setSurveyReportUrlOld(String surveyReportUrlOld) {
        this.surveyReportUrlOld = surveyReportUrlOld;
    }

    public EnvObj withSurveyReportUrlOld(String surveyReportUrlOld) {
        this.surveyReportUrlOld = surveyReportUrlOld;
        return this;
    }

    public String getMettlServerUrl() {
        return mettlServerUrl;
    }

    public void setMettlServerUrl(String mettlServerUrl) {
        this.mettlServerUrl = mettlServerUrl;
    }

    public EnvObj withMettlServerUrl(String mettlServerUrl) {
        this.mettlServerUrl = mettlServerUrl;
        return this;
    }

    public String getMettlServerTestUrl() {
        return mettlServerTestUrl;
    }

    public void setMettlServerTestUrl(String mettlServerTestUrl) {
        this.mettlServerTestUrl = mettlServerTestUrl;
    }

    public EnvObj withMettlServerTestUrl(String mettlServerTestUrl) {
        this.mettlServerTestUrl = mettlServerTestUrl;
        return this;
    }

    public Boolean getEnableGTM() {
        return enableGTM;
    }

    public void setEnableGTM(Boolean enableGTM) {
        this.enableGTM = enableGTM;
    }

    public EnvObj withEnableGTM(Boolean enableGTM) {
        this.enableGTM = enableGTM;
        return this;
    }

    public Boolean getIsBulkDownloadOldUrl() {
        return isBulkDownloadOldUrl;
    }

    public void setIsBulkDownloadOldUrl(Boolean isBulkDownloadOldUrl) {
        this.isBulkDownloadOldUrl = isBulkDownloadOldUrl;
    }

    public EnvObj withIsBulkDownloadOldUrl(Boolean isBulkDownloadOldUrl) {
        this.isBulkDownloadOldUrl = isBulkDownloadOldUrl;
        return this;
    }

}