package io.javabrains.productservice.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductResource {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World - from product";
    }
}
