package com.fintech.service;

import com.fintech.dto.response.BvnValidationResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "bvn-validation", url = "https://bvnvalidation-api.com") // Replace URL with actual BVN validation service URL
public interface BvnValidationClient {

    // Get method to validate BVN
    @GetMapping("/validate-bvn")
   ResponseEntity <BvnValidationResponse> validateBvn(@RequestParam("bvn") String bvn);
}
