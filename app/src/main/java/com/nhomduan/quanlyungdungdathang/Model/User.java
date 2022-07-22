package com.nhomduan.quanlyungdungdathang.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class User implements Serializable {


    @NonNull
    @PrimaryKey
    private String username;

    private String password;
    private String phone_number;
    private boolean enable;
    private String hinhanh;
    private String address;
    private String name;


    public User() {
    }

    @Ignore
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Ignore
    public User(String username, String password, String phone_number, boolean enable) {
        this.username = username;
        this.password = password;
        this.phone_number = phone_number;
        this.enable = enable;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("password", password);
        map.put("enable", enable);
        map.put("phone_number", phone_number);
        return map;
    }

    public Map<String, Object> editUser() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("password", password);
        map.put("name", name);
        return map;
    }

    public Map<String, Object> editAdress() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("address", address);
        return map;
    }

    public Map<String, Object> toMapThongTinGiaoHang() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("phone_number", phone_number);
        map.put("address", address);
        map.put("name", name);
        return map;
    }

    public Map<String, Object> toMapAvatar() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("hinhanh", hinhanh);
        return map;
    }
}

