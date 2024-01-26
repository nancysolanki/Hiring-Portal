package com.catalystgirl.joblisting.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.catalystgirl.joblisting.model.Post;

@Component
public class SearchRepositoryImpl implements SearchRepository{


    @Override
    public List<Post> findByText(String text) {

        final List<Post> posts = new ArrayList<>();
        return posts;
    }
}