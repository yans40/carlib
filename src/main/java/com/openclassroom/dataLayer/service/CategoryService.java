package com.openclassroom.dataLayer.service;

import com.openclassroom.dataLayer.model.Category;
import com.openclassroom.dataLayer.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
   private CategoryRepository categoryRepository;

    public Iterable<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    public Optional<Category> getCategoryById(int id) {

        return categoryRepository.findById(id);
    }
}
