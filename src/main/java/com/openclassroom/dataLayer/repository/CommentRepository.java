package com.openclassroom.dataLayer.repository;

import com.openclassroom.dataLayer.model.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment,Integer> {


}
