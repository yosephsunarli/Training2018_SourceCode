package com.beonesolution.training2018.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginDataModel {

    @SerializedName("CompanyDB")
    @Expose
    private String companyDB;
    @SerializedName("Password")
    @Expose
    private String password;
    @SerializedName("UserName")
    @Expose
    private String userName;

    /**
     * No args constructor for use in serialization
     *
     */
    public LoginDataModel() {
    }

    /**
     *
     * @param companyDB
     * @param userName
     * @param password
     */
    public LoginDataModel(String companyDB, String password, String userName) {
        super();
        this.companyDB = companyDB;
        this.password = password;
        this.userName = userName;
    }

    public String getCompanyDB() {
        return companyDB;
    }

    public void setCompanyDB(String companyDB) {
        this.companyDB = companyDB;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}