package com.inspireclubnitrkl.e_quiz;

public class User {

    private  String name,pass,email,profile,referCode;
    private long coins =25;

    public long getCoins() {
        return coins;
    }

    public void setCoins(long coins) {
        this.coins = coins;
    }

    public User() {
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public User(String name, String pass, String email, String referCode) {
        this.name = name;
        this.pass = pass;
        this.email = email;
        this.referCode = referCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getReferCode() {
        return referCode;
    }

    public void setReferCode(String referCode) {
        this.referCode = referCode;
    }
}
