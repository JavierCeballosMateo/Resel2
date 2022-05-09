package com.example.reselapp;

import org.json.JSONException;
import org.json.JSONObject;

public class SubirProductoData {
    private String name;
    private String description;
    private String category;
    private String brand;
    private String condition;
    private int price_eur;

    public SubirProductoData(JSONObject json){
        try{
            this.name = json.getString("name");
            this.description = json.getString("description");
            this.category = json.getString("category");
            this.brand = json.getString("brand");
            this.condition = json.getString("condition");
            this.price_eur = json.getInt("price_eur");
        }catch(JSONException error){
            error.printStackTrace();
        }
    }

    public SubirProductoData(String name, String description, String category, String brand, String condition, int price_eur){
        this.name = name;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.condition = condition;
        this.price_eur = price_eur;
    }



    public int getPrice_eur() {
        return price_eur;
    }

    public String getCondition() {
        return condition;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}

