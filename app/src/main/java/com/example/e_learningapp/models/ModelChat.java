package com.example.e_learningapp.models;

public class ModelChat {


    String massage ;
    String userName ;
    String senderId ;

    public ModelChat (){}
    public ModelChat(String massage, String senderId , String userName) {
        this.massage = massage;
        this.senderId = senderId;
        this.userName = userName ;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }
}
