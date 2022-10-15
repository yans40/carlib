package com.openclassroom.dataLayer.model;

import javax.persistence.*;


    @Entity
    @Table(name = "commentaire")
    public class Comment {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "commentaireid")
        private int commentId;

        @Column(name = "contenu")
        private String content;

        public int getCommentId() {
            return commentId;
        }

        public void setCommentId(int commentId) {
            this.commentId = commentId;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

