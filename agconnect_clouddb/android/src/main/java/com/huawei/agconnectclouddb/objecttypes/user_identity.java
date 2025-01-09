/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.huawei.agconnectclouddb.objecttypes;

import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;
import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.Text;

import java.util.Date;

/**
 * Definition of ObjectType user_identity.
 *
 * @since 2025-01-09
 */
@PrimaryKeys({"union_id"})
public final class user_identity extends CloudDBZoneObject {
    private String union_id;

    private String type;

    private String extend;

    private String start_time;

    private String end_time;

    private String start_time_format;

    private String end_time_format;

    private String create_time;

    public user_identity() {
        super(user_identity.class);
    }

    public void setUnion_id(String union_id) {
        this.union_id = union_id;
    }

    public String getUnion_id() {
        return union_id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getExtend() {
        return extend;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setStart_time_format(String start_time_format) {
        this.start_time_format = start_time_format;
    }

    public String getStart_time_format() {
        return start_time_format;
    }

    public void setEnd_time_format(String end_time_format) {
        this.end_time_format = end_time_format;
    }

    public String getEnd_time_format() {
        return end_time_format;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getCreate_time() {
        return create_time;
    }

}
