/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.huawei.agconnectclouddb.objecttypes;

import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;
import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.Text;

import java.util.Date;

/**
 * Definition of ObjectType user.
 *
 * @since 2025-01-09
 */
@PrimaryKeys({"union_id"})
public final class user extends CloudDBZoneObject {
    private String union_id;

    private String id;

    private String name;

    private String phone;

    private String gender;

    private String wx_id;

    private String wx_info;

    private String from_app;

    private String platform;

    private String create_time;

    @DefaultValue(stringValue = "")
    private String photo_url;

    private String custom_name;

    @DefaultValue(stringValue = "{\"type\":\"normal\",\"start_time\":\"\",\"end_time\":\"\"}")
    private String member_info;

    public user() {
        super(user.class);
        this.photo_url = "";
        this.member_info = "{\"type\":\"normal\",\"start_time\":\"\",\"end_time\":\"\"}";
    }

    public void setUnion_id(String union_id) {
        this.union_id = union_id;
    }

    public String getUnion_id() {
        return union_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setWx_id(String wx_id) {
        this.wx_id = wx_id;
    }

    public String getWx_id() {
        return wx_id;
    }

    public void setWx_info(String wx_info) {
        this.wx_info = wx_info;
    }

    public String getWx_info() {
        return wx_info;
    }

    public void setFrom_app(String from_app) {
        this.from_app = from_app;
    }

    public String getFrom_app() {
        return from_app;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setCustom_name(String custom_name) {
        this.custom_name = custom_name;
    }

    public String getCustom_name() {
        return custom_name;
    }

    public void setMember_info(String member_info) {
        this.member_info = member_info;
    }

    public String getMember_info() {
        return member_info;
    }

}
