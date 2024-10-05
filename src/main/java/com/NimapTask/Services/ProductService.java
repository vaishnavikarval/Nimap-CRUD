package com.NimapTask.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.NimapTask.Entites.Category;
import com.NimapTask.Entites.Product;
import com.NimapTask.Repos.CategoryRepo;
import com.NimapTask.Repos.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    public Page<Product> getAllProducts(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    public Product getProductById(Long id) {
        return productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product createProduct(Product product, Long categoryId) {
        Category category = categoryRepo.findById(categoryId).orElseThrow(() -> new RuntimeException("Category not found"));
        product.setCategory(category);
        return productRepo.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCategory(product.getCategory());
        return productRepo.save(existingProduct);
    }

    public void deleteProduct(Long id) {
    	productRepo.deleteById(id);
    }

}
