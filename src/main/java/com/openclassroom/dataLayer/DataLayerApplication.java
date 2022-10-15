package com.openclassroom.dataLayer;

import com.openclassroom.dataLayer.model.Category;
import com.openclassroom.dataLayer.model.Comment;
import com.openclassroom.dataLayer.model.Product;
import com.openclassroom.dataLayer.service.CategoryService;
import com.openclassroom.dataLayer.service.CommentService;

import com.openclassroom.dataLayer.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication

public class DataLayerApplication implements CommandLineRunner {

  @Autowired
  private ProductService productService;

  @Autowired
    private CategoryService categoryService;
    @Autowired
    private CommentService commentService;

    public static void main(String[] args) {
        SpringApplication.run(DataLayerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        Iterable<Product> products = productService.getProducts();
//        products.forEach(product -> System.out.println(product.getName()));
//        //pour chaque product dans l'itérable products imprime chaque product.getName
//
//        Iterable<Category> categories = categoryService.getAllCategories();
//        categories.forEach(category -> System.out.println(category.getName()));
//        //pour chaque category dans l'itérable categories imprime chaque category.getName
//
//        Iterable<Comment> comments = commentService.getAllComments();
//        comments.forEach(comment -> System.out.println(comment.getContent()));
//        //pour chaque comment dans l'itérable comments imprime chaque comment.getContent

        Optional<Product> optProduct = productService.getProductById(1);
        Product productId1= optProduct.get();
        System.out.println(productId1.getName());

        Optional<Category> optionalCategory = categoryService.getCategoryById(1);
        Category categoryId1 = optionalCategory.get();
        System.out.println(categoryId1.getName());

        Optional<Comment> optionalComment = commentService.getCommentById(1);
        Comment commentId1= optionalComment.get();
        System.out.println(commentId1.getContent());

    }
}
