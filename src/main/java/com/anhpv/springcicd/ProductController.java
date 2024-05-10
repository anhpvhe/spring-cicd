//package com.anhpv.springcicd;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("")
//public class ProductController {
//    @Autowired
//    private ProductRepository productRepository;
//
//    @GetMapping(path = "/list")
//    public @ResponseBody Iterable<Product> getAllProducts(){
//        return productRepository.findAll();
//    }
//
//    @PostMapping(path = "/add")
//    public @ResponseBody String addNewProduct(@RequestParam String name){
//        Product p = new Product();
//        p.setName(name);
//        productRepository.save(p);
//        return "Saved";
//    }
//}
