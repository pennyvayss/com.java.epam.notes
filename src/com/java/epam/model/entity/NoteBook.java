package com.java.epam.model.entity;

public class NoteBook {
    private static String firstName;
    private static String loginData;

    public NoteBook(String firstName, String loginData)
                                throws NotUniqueLoginException{
        if (DBNoteBook.checkLogin(loginData)) {
            throw new NotUniqueLoginException("Not Unique Login", loginData);
        }
            this.firstName = firstName;
            this.loginData = loginData;
    }

    public static String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName; }
    public static String getLoginData() {return loginData;}
    public void setLoginData(String loginData) {this.loginData = loginData;}

    @Override
    public String toString() {
        return "NoteBook{" +
                "firstName='" + firstName + '\'' +
                ", loginData='" + loginData + '\'' +
                '}';
    }
}
