package com.ekinyavasca.engineeringproject;

public class Student {
    private String bluetoothID;
    private String name;
    private String surname;
    private String schoolID;

    public Student(){

    }

    public String getBluetoothID() {
        return bluetoothID;
    }

    public void setBluetoothID(String bluetoothID) {
        this.bluetoothID = bluetoothID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(String schoolID) {
        this.schoolID = schoolID;
    }
}
