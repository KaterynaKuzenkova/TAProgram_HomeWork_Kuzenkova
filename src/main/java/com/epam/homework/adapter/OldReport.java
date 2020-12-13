package com.epam.homework.adapter;

import java.sql.Date;
import java.sql.Time;

public class OldReport {
    private Date createDate;
    private Time createTime;
    private String message;
    private boolean isReported;

    public OldReport(Date createDate, Time createTime, String message, boolean isReported) {
        this.createDate = createDate;
        this.createTime = createTime;
        this.message = message;
        this.isReported = isReported;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Time getCreateTime() {
        return createTime;
    }

    public String getMessage() {
        return message;
    }

    public boolean isReported() {
        return isReported;
    }
}
