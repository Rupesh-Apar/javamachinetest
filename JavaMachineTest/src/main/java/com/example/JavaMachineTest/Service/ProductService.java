package com.example.JavaMachineTest.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.JavaMachineTest.Entity.Product;
import com.example.JavaMachineTest.Repo.ProductRepo;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepo pr;

    public Page<Product> getAllProducts(Pageable pageable) {
        return pr.findAll(pageable);
    }

    public Optional<Product> getProductById(Long id) {
        return pr.findById(id);
    }

    public Product createProduct(Product product) {
        return pr.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = pr.findById(id).orElseThrow();
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
        product.setCategory(productDetails.getCategory());
        return pr.save(product);
    }

    public void deleteProduct(Long id) {
        pr.deleteById(id);
    }
}
