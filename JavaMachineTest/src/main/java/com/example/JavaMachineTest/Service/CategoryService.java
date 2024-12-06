package com.example.JavaMachineTest.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.JavaMachineTest.Entity.Category;
import com.example.JavaMachineTest.Repo.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo cr;
	
	public Page<Category> getAllCategories(Pageable pageable){
		return cr.findAll(pageable) ;
	}
	
	public Optional<Category> getCategoryById(Long id){
		return cr.findById(id);
	}
	public Category createCategory(Category category) {
        return cr.save(category);
    }

    public Category updateCategory(Long id, Category categoryDetails) {
        Category category = cr.findById(id).orElseThrow();
        category.setName(categoryDetails.getName());
        return cr.save(category);
    }

    public void deleteCategory(Long id) {
       cr.deleteById(id);
    }
	
}
