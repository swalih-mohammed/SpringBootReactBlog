package com.swalih.springBootBlog;

import com.swalih.springBootBlog.models.Blog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogRepository extends MongoRepository<Blog, String>
{
}
