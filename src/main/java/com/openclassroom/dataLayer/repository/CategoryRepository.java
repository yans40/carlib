package com.openclassroom.dataLayer.repository;

import com.openclassroom.dataLayer.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {

}
