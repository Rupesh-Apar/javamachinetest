package com.example.JavaMachineTest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import com.example.JavaMachineTest.Entity.Product;
import com.example.JavaMachineTest.Service.ProductService;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService ps;

    @GetMapping
    public Page<Product> getAllProducts(@RequestParam int page) {
        return ps.getAllProducts(PageRequest.of(page, 5));
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return ps.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return ps.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return ps.updateProduct(id, productDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        ps.deleteProduct(id);
    }
}