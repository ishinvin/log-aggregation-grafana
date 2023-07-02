package com.ishin.postservice.service;

import com.ishin.postservice.domain.Post;
import com.ishin.postservice.domain.PostWithComments;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getPosts();

    Optional<PostWithComments> getPost(Long id);
}
