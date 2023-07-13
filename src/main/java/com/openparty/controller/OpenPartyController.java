package com.openparty.controller;

import com.openparty.model.Problem;
import com.openparty.service.OpenPartyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OpenPartyController {

    @Autowired
    private OpenPartyService openPartyService;

    @GetMapping("/getProblemSheets")
    public List<Problem> getProblemSheets() {
        return openPartyService.getProblemSheets();
    }

}
