package com.adminService.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVO {

    private Customer customer;

    private Order order;

    private Product product;

    private Seller seller;
}
