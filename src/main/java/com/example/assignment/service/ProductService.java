package com.example.assignment.service;


import com.example.assignment.entity.Product;
import com.example.assignment.repository.ProductRepo;
import com.example.assignment.response.ProductResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    @Autowired
    private ModelMapper modelMapper;

    public List<ProductResponse> getProductById()
    {
        List<Object[]>list= productRepo.getProductById();
        List<ProductResponse>res= new ArrayList<>();
        for(Object[] x:list)
        {
            String name= (String) x[0];
            double cost= (double) x[1];
            ProductResponse productResponse= new ProductResponse(cost,name);
            res.add(productResponse);

        }



        return res;

    }


}
