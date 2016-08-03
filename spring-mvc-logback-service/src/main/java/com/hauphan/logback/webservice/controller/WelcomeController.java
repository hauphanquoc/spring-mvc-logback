package com.hauphan.logback.webservice.controller;

import com.hauphan.logback.webservice.dto.request.PingRequest;
import com.hauphan.logback.webservice.dto.response.PongResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public PongResponse welcome(@RequestBody PingRequest pingRequest) {

        logger.debug("welcome() is executed, value {}", "hauphan");

        logger.error("This is Error message", new Exception("Testing"));

        return new PongResponse(pingRequest.getPing());
    }
}
