// APPAPPLICSService.java
package com.demo.postman_ui.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.postman_ui.entity.APPAPPLICS;
import com.demo.postman_ui.repository.APPAPPLICSRepository;

@Service
public class APPAPPLICSService {
	@Autowired

    private final APPAPPLICSRepository repository;

    public APPAPPLICSService(APPAPPLICSRepository repository) {
        this.repository = repository;
    }

    public List<APPAPPLICS> getAppApplicsByIdRefnum(String idRefnum) {
        return repository.findByIdRefnum(idRefnum);
    }
    public List<APPAPPLICS> getAppApplicsByIdRefnum() {
        return repository.findAll();  
    }
}
