package com.catalystgirl.joblisting.Repository;

import com.catalystgirl.joblisting.model.Post;

import java.util.List;

import org.springframework.stereotype.Component;



public interface SearchRepository {

    List<Post> findByText(String text);

}