package com.openclassroom.dataLayer.service;

import com.openclassroom.dataLayer.model.Comment;
import com.openclassroom.dataLayer.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {

    @Autowired
   private CommentRepository commentRepository;
    public Iterable<Comment> getAllComments() {

        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(int id) {
        return commentRepository.findById(id);
    }
}
