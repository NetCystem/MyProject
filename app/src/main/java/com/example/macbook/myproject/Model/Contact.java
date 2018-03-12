package com.example.macbook.myproject.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by MAcBook on 27/02/2018.
 */

public class Contact extends RealmObject {

    @PrimaryKey
    private int id;
    private String name;
    private String userCategory;
    private int socialImage;
    private int userImage;
    private String products;
    private String country;
    private  String email;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(String userCategory) {
        this.userCategory = userCategory;
    }

    public int getSocialImage() {
        return socialImage;
    }

    public void setSocialImage(int socialImage) {
        this.socialImage = socialImage;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", userCategory='" + userCategory + '\'' +
                ", socialImage=" + socialImage +
                ", userImage=" + userImage +
                ", products='" + products + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
