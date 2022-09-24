package com.example.demo.Service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloService {
    @RequestMapping(value="say/{name}",method = RequestMethod.GET)//name

    public String sayName(@PathVariable String name){
        return "Your name is "+name+"!";

    }
}
