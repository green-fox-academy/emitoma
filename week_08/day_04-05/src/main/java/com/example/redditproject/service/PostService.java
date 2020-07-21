package com.example.redditproject.service;

import com.example.redditproject.model.Post;
import com.example.redditproject.model.User;
import com.example.redditproject.repositories.PostRepository;
import com.example.redditproject.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    private PostRepository postRepository;
    private UserRepository userRepository;

    public PostService(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }


    public Post savePost(String userName, String title, String postBody) {
        Optional<User> optionalUser = userRepository.findByUserName(userName);
        System.out.println("SAVE POST");
        if (optionalUser.isPresent()) {
            User author = optionalUser.get();
            Post newPost = new Post(title, postBody, author);
            newPost.setDateCreated(new Date());
            postRepository.save(newPost);
            author.getPostList().add(newPost);
            return newPost;
        }
        return null;
    }



}
