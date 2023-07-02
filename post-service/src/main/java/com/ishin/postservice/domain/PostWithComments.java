package com.ishin.postservice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class PostWithComments extends Post {

    private List<Comment> comments;
}
