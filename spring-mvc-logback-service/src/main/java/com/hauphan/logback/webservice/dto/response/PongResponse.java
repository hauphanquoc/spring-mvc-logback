package com.hauphan.logback.webservice.dto.response;


import java.io.Serializable;

public class PongResponse implements Serializable {

    private static final long serialVersionUID = 9073406069468879431L;
    private String pong;

    public PongResponse(String pong) {
        this.pong = pong;
    }

    public String getPong() {
        return pong;
    }

    public void setPong(String pong) {
        this.pong = pong;
    }
}
