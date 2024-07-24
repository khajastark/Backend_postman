// APPAPPLICSController.java
package com.demo.postman_ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.postman_ui.entity.APPAPPLICS;
import com.demo.postman_ui.service.APPAPPLICSService;

@RestController
public class APPAPPLICSController {
@Autowired
    private final APPAPPLICSService service;

    public APPAPPLICSController(APPAPPLICSService service) {
        this.service = service;
    }

    // Allow requests from this origin
    @PostMapping("/appapplics")
    public List<APPAPPLICS> getAppApplics(@RequestBody String idRefnum) {
        return service.getAppApplicsByIdRefnum(idRefnum);
    }
    
    @PostMapping("/appa")
    public List<APPAPPLICS> getAppApplics( ) {
        return service.getAppApplicsByIdRefnum();
    }
}
