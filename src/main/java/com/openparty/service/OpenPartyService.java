package com.openparty.service;

import org.springframework.stereotype.Service;

@Service
public class OpenPartyService {

//    @Autowired
//    private ManifestoRepository manifestoRepository;

    public String getManifestoData() {
//        return manifestoRepository.findAll();
        return "Hello";
    }

}