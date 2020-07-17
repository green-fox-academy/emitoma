package com.example.redditproject.repositories;

import com.example.redditproject.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
