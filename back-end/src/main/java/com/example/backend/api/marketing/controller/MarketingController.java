package com.example.backend.api.marketing.controller;

import com.example.backend.api.marketing.service.MarketingRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MarketingController {

    private final MarketingRequestService marketingRequestService;

    // 상권분석(소득소비-상권)
    @PostMapping("/expenditure-commercial-districts")
    public ResponseEntity<HttpStatus> saveExpenditureCommercialDistrict() {
        marketingRequestService.saveExpenditureCommercialDistrict();
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    // 상권분석 (점포 - 상권)
    @PostMapping("/stores")
    public ResponseEntity<HttpStatus> saveStores() {
        marketingRequestService.saveStores();
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
