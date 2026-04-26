package com.tfgo.blog.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import java.util.List;

@RestController
@RequestMapping("/api/blog")
public class BlogController {

    @GetMapping
    public Map<String , Object> list(){
        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> blog = new HashMap<>();
        blog.put("title", "TFGO 手写后端成功");
        blog.put("author", "tengfei");
        blog.put("createTime", "2026-04-22");

        list.add(blog);

        Map<String, Object> result = new HashMap<>();
        result.put("code", 200);
        result.put("message", "success");

        Map<String, Object> data = new HashMap<>();
        data.put("content", list);

        result.put("data", data);

        return result;
    }
}
