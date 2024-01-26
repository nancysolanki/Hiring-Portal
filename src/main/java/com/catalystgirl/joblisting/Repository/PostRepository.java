package com.catalystgirl.joblisting.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.catalystgirl.joblisting.model.Post;

                                            //<what we want to fetch , Primary key>
public interface PostRepository extends MongoRepository<Post,String> {
    

}
