package com.ridezum;

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String referal;
    private String phone;


    public User(String firstName, String lastName, String password, String email, String phone, String referal){
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
        this.referal = referal;
        this.phone = phone;

    }

    public String getFirstName(){
        return firstName;
    }public String getLastName(){
        return lastName;
    }public String getPassword(){
        return password;
    }public String getEmail(){
        return email;
    }public String getPhone(){
        return phone;
    }String getReferal(){
        return referal;
    }
}
