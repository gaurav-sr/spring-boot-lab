package com.mastercard.commercial.purchaserequestservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(path = "/", method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAppName() {
        return "PurchaseRequestService";
    }

}
