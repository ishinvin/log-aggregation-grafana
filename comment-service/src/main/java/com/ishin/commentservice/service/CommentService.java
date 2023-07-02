package com.ishin.commentservice.service;

import com.ishin.commentservice.domain.Comment;

import java.util.List;

public interface CommentService {

    List<Comment> getCommentsForPost(Long postId);
}
