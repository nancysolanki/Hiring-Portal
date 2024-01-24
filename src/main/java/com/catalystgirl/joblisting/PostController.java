package com.catalystgirl.joblisting;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class PostController {

    @RequestMapping
    public void redirect(HttpServletResponse response) throws IOException {
       response.sendRedirect("/swagger-ui.html");
    }

}
