package com.example.mabalanceapp4;
public class ModelItem {
    String username;
    String nomorHP;
    String group;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getNomorHP() {
        return nomorHP;
    }
    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public ModelItem(String username, String nomorHP, String group) {
        this.username = username;
        this.nomorHP = nomorHP;
        this.group = group;
    }
    public ModelItem() {
    }
}