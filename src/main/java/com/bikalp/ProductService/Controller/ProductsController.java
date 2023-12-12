package com.bikalp.ProductService.Controller;

import com.bikalp.ProductService.Entity.Products;
import com.bikalp.ProductService.Service.ProductsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsService productsService;

    public ProductsController(ProductsService productsService) {
        this.productsService = productsService;
    }
    @PostMapping("/save")
    public ResponseEntity<Products> save (@RequestBody Products products){
        return ResponseEntity.ok().body(productsService.save(products));
    }
}
