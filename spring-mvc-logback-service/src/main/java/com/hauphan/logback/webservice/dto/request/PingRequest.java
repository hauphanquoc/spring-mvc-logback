package com.hauphan.logback.webservice.dto.request;


import java.io.Serializable;

public class PingRequest implements Serializable{

    private static final long serialVersionUID = -4498051402261650768L;

    private String ping;

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }
}
