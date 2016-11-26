package com.clivekumara.srilankalotteryapp.Model;

/**
 * Created by Chathuranga.Sandun on 11/26/2016.
 */

public class SingleItemModel {


    private String name;
    private String url;
    private String description;


    public SingleItemModel() {
    }

    public SingleItemModel(String name, String url) {
        this.name = name;
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
