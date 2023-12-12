package com.bikalp.ProductService.Service.Implementation;

import com.bikalp.ProductService.Entity.Products;
import com.bikalp.ProductService.Repository.ProductsRepo;
import com.bikalp.ProductService.Service.ProductsService;
import org.springframework.stereotype.Service;

@Service
public class ProductsServiceImpl implements ProductsService {

    private final ProductsRepo productsRepo;

    public ProductsServiceImpl(ProductsRepo productsRepo) {
        this.productsRepo = productsRepo;
    }


    @Override
    public Products save(Products products) {
        return productsRepo.save(products);
    }
}
