package com.bikalp.ProductService.Service;

import com.bikalp.ProductService.Entity.Products;
import org.springframework.stereotype.Service;

@Service
public interface ProductsService  {
    public Products save(Products products);
}
