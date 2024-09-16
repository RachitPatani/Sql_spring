package com.example.assignment.controller;

import com.example.assignment.response.ProductResponse;
import com.example.assignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;
    @GetMapping("/product")
    public ResponseEntity <List<ProductResponse>> getList()
    {
        List<ProductResponse> res= productService.getProductById();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }
    
}
