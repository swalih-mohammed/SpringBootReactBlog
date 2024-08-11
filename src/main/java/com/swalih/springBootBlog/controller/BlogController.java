package com.swalih.springBootBlog.controller;

import com.swalih.springBootBlog.BlogRepository;
import com.swalih.springBootBlog.models.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
//@RequestMapping("blog")
@Controller
@CrossOrigin
public class BlogController {

//    @GetMapping("/")
//    public ModelAndView home() {
//        ModelAndView mav=new ModelAndView("index");
//        return mav;
//    }
//
    @Autowired
    BlogRepository repo;
    @RequestMapping("/blogs")
    public List<Blog> getAllBlogs()
    {
        return repo.findAll();
    }

}
