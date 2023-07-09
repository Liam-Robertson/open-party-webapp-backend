package com.openparty.controller;

import com.openparty.service.OpenPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenPartyController {

    @Autowired
    private OpenPartyService openPartyService;

    @GetMapping("/getManifestoData")
    public String getManifestoData() {
        return openPartyService.getManifestoData();
    }

}
