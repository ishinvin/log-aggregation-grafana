package com.ishin.commentservice.service.impl;

import com.ishin.commentservice.domain.Comment;
import com.ishin.commentservice.service.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@Service
public class CommentServiceImpl implements CommentService {

    private static final List<Comment> COMMENTS = new ArrayList<>();

    static {

        COMMENTS.add(Comment.builder()
                .id(1L)
                .postId(1L)
                .content("Awesome!")
                .build());

        COMMENTS.add(Comment.builder()
                .id(2L)
                .postId(1L)
                .content("Perfect!")
                .build());

        COMMENTS.add(Comment.builder()
                .id(3L)
                .postId(2L)
                .content("Best post ever!")
                .build());
    }

    @Override
    public List<Comment> getCommentsForPost(Long postId) {

        log.info("Finding comments of post with id {}", postId);

        List<Comment> comments = COMMENTS.stream()
                .filter(comment -> comment.getPostId().equals(postId))
                .collect(toList());

        log.info("Found {} comment(s) of post with id {}", comments.size(), postId);
        return comments;
    }
}
