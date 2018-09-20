package com.beonesolution.training2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseModel {

    @SerializedName("odata.metadata")
    @Expose
    private String odataMetadata;
    @SerializedName("SessionId")
    @Expose
    private String sessionId;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("SessionTimeout")
    @Expose
    private Integer sessionTimeout;

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginResponseModel() {
    }

    /**
     *
     * @param sessionId
     * @param odataMetadata
     * @param sessionTimeout
     * @param version
     */
    public LoginResponseModel(String odataMetadata, String sessionId, String version, Integer sessionTimeout) {
        super();
        this.odataMetadata = odataMetadata;
        this.sessionId = sessionId;
        this.version = version;
        this.sessionTimeout = sessionTimeout;
    }

    public String getOdataMetadata() {
        return odataMetadata;
    }

    public void setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getSessionTimeout() {
        return sessionTimeout;
    }

    public void setSessionTimeout(Integer sessionTimeout) {
        this.sessionTimeout = sessionTimeout;
    }

}