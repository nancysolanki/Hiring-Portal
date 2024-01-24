package com.catalystgirl.joblisting;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.catalystgirl.joblisting.model.Post;

                                            //<what we want to fetch , Primary key>
public interface PostRepository extends MongoRepository<Post,String> {
    
}
