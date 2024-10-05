package com.NimapTask.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.NimapTask.Entites.Category;
import com.NimapTask.Repos.CategoryRepo;


@Service
public class CategoryService {
	
	@Autowired
    private CategoryRepo categoryRepo;

    public Page<Category> getAllCategories(Pageable pageable) {
        return categoryRepo.findAll(pageable);
    }

    public Category getCategoryById(Long id) {
        return categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public Category createCategory(Category category) {
        return categoryRepo.save(category);
    }

    public Category updateCategory(Long id, Category category) {
        Category existingCategory = categoryRepo.findById(id).orElseThrow(() -> new RuntimeException("Category not found"));
        existingCategory.setName(category.getName());
        return categoryRepo.save(existingCategory);
    }

    public void deleteCategory(Long id) {
    	categoryRepo.deleteById(id);
    }

}
