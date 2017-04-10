package com.swat.data;

/**
 * Created by paul on 24.03.17.
 */
public class RestaurantData {

    public RestaurantData(String traits, String email, String description, String kitchen, String telephoneNumber, String address, String website){
        this.description = description;
        this.kitchen = kitchen;
        this.traits = traits;
        this.email = email;
        this.address = address;
        this.website = website;
        this.telephoneNumber = telephoneNumber;
    }


    public String getCuisine() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTraits() {
        return traits;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getWebsite() {
        return website;
    }

    public String getAddress() {
        return address;
    }


    private String description;
    private String kitchen;
    private String traits;
    private String email;
    private String telephoneNumber;
    private String website;
    private String address;

}
