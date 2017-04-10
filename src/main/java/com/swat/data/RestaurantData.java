package com.swat.data;

public class RestaurantData {

    public RestaurantData(String uri, String nameRu, String nameEn, String nameUa, String city,
                          String addressRu, String addressEn, String addressUa, String fridayOpen, String fridayClose,
                          String textDescriptionRu, String textDescriptionEn, String textDescriptionUa,
                          String restaurantPhone, String restaurantEmail, String restaurantSite){
        this.uri = uri;
        this.nameRu = nameRu;
        this.nameEn = nameEn;
        this.nameUa = nameUa;
        this.city = city;
        this.addressRu = addressRu;
        this.addressEn = addressEn;
        this.addressUa = addressUa;
        this.fridayOpen = fridayOpen;
        this.fridayClose = fridayClose;
        this.textDescriptionRu = textDescriptionRu;
        this.textDescriptionEn = textDescriptionEn;
        this.textDescriptionUa = textDescriptionUa;
        this.restaurantPhone = restaurantPhone;
        this.restaurantEmail = restaurantEmail;
        this.restaurantSite = restaurantSite;
    }

    /*Added for UserRestaurantDataTest*/
    public RestaurantData(String traits, String restaurantPhone, String cuisine, String textDescriptionRu, String restaurantSite, String restaurantEmail){
        this.traits = traits;
        this.cuisine = cuisine;
        this.textDescriptionRu = textDescriptionRu;
        this.restaurantPhone = restaurantPhone;
        this.restaurantEmail = restaurantEmail;
        this.restaurantSite = restaurantSite;
    }




    public RestaurantData(String nameRu){
        this.nameRu = nameRu;;
    }

    public String getTraits() {
        return traits;
    }
    public String getCuisine() {
        return cuisine;
    }


    public String getUri() {
        return uri;
    }

    public String getNameRu() {
        return nameRu;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameUa() {
        return nameUa;
    }

    public String getCity() {
        return city;
    }

    public String getAddressRu() {
        return addressRu;
    }

    public String getAddressEn() {
        return addressEn;
    }

    public String getAddressUa() {
        return addressUa;
    }

    public String getFridayOpen() {
        return fridayOpen;
    }

    public String getFridayClose() {
        return fridayClose;
    }

    public String getTextDescriptionRu(){
        return textDescriptionRu;
    }

    public String getTextDescriptionEn(){
        return textDescriptionEn;
    }

    public String getTextDescriptionUa(){
        return textDescriptionUa;
    }

    public String getRestaurantPhone(){
        return restaurantPhone;
    }

    public String getRestaurantEmail(){
        return restaurantEmail;
    }

    public String getRestaurantSite(){
        return restaurantSite;
    }


    public String setTraits() {
        return traits;
    }
    public String setCuisine() {
        return cuisine;
    }


    public void setUri(String uri) {
        this.uri = uri;
    }

    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public void setNameUa(String nameUa) {
        this.nameUa = nameUa;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddressRu(String addressRu) {
        this.addressRu = addressRu;
    }

    public void setAddressEn(String addressEn) {
        this.addressEn = addressEn;
    }

    public void setAddressUa(String addressUa) {
        this.addressUa = addressUa;
    }

    public void setFridayOpen(String fridayOpen) {
        this.fridayOpen = fridayOpen;
    }

    public void setFridayClose(String fridayClose) {
        this.fridayClose = fridayClose;
    }

    public void setTextDescriptionRu (String textDescriptionRu) {
        this.textDescriptionRu = textDescriptionRu;
    }

    public void setTextDescriptionEn (String textDescriptionEn) {
        this.textDescriptionEn = textDescriptionEn;
    }

    public void setTextDescriptionUa (String textDescriptionUa) {
        this.textDescriptionUa = textDescriptionUa;
    }

    public void setRestaurantPhone (String restaurantPhone) {
        this.restaurantPhone = restaurantPhone;
    }

    public void setRestaurantEmail (String restaurantEmail) {
        this.restaurantEmail = restaurantEmail;
    }

    public void setRestaurantSite (String restaurantSite) {
        this.restaurantSite = restaurantSite;
    }

    private String traits;
    private String cuisine;


    private String uri;
    private String nameRu;
    private String nameEn;
    private String nameUa;
    private String city;
    private String addressRu;
    private String addressEn;
    private String addressUa;
    private String fridayOpen;
    private String fridayClose;
    private String textDescriptionRu;
    private String textDescriptionEn;
    private String textDescriptionUa;
    private String restaurantPhone;
    private String restaurantEmail;
    private String restaurantSite;

}
