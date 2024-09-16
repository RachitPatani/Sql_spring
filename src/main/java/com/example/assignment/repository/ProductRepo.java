package com.example.assignment.repository;

import com.example.assignment.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
  @Query( nativeQuery = true,value = "select name ,Cast( if(discount>0,(cost-(cost*(discount/100))),cost) AS double) as price from productdetails where cost IS NOT NULL ORDER BY name asc;")
  List<Object []> getProductById();

}
