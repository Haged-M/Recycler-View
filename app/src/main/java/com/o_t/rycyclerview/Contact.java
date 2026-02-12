package com.o_t.rycyclerview;

public class Contact {
    private String name;
    private String phoneNumber;
    private int image;

    public Contact(String name, String phoneNumber, int image) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getImage() {
        return image;
    }
}
