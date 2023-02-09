package com.APIgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class FallBackController {

    @GetMapping("/customerfallback")
    public String customerFallBack() {
        return "CUSTOMER SERVICE TEMPORARY DISABLED";
    }

    @GetMapping("/productfallback")
    public String productFallBack() {
        return "PRODUCT SERVICE TEMPORARY DISABLED";
    }

    @GetMapping("/orderfallback")
    public String orderFallBack() {
        return "ORDER SERVICE TEMPORARY DISABLED";

    }

    @GetMapping("/sellerfallback")
    public String sellerFallBack() {
        return "SELLER SERVICE TEMPORARY DISABLED";

    }
}
