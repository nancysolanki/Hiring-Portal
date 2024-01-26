package com.catalystgirl.joblisting.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.catalystgirl.joblisting.Repository.PostRepository;
import com.catalystgirl.joblisting.Repository.SearchRepository;
import com.catalystgirl.joblisting.model.Post;

import springfox.documentation.annotations.ApiIgnore;




@RestController
public class PostController {
   //Swagger ui on local host 
   //ignore is used as we want to define our customised controllers rather than the defined one
    @ApiIgnore
    @RequestMapping
    public void redirect(HttpServletResponse response) throws IOException {
       response.sendRedirect("/swagger-ui.html");
    }

    @Autowired
    PostRepository repo;

    @Autowired
    SearchRepository searchrepo;

   @GetMapping("/post") 
    public List<Post> getAllPosts(){
     
      return repo.findAll();
    }
   
    //Filtered Search API/Controller
    @GetMapping("/post/{text}")
    public List<Post> search(@PathVariable String text){
     
      return searchrepo.findByText(text);

    }

    @PostMapping("/submitpost")
    public Post addPost(@RequestBody Post post){
      return repo.save(post);
    }

}
