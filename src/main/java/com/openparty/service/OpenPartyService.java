package com.openparty.service;

import com.openparty.model.Problem;
import com.openparty.repository.ProblemSheetRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OpenPartyService {

    @Autowired
    private ProblemSheetRepository problemSheetRepository;

    public List<Problem> getProblemSheets() {
        return problemSheetRepository.findAll();
    }

}