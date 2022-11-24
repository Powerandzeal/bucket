package com.example.bucket.controller;

import com.example.bucket.service.BucketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("store/order")

public class OrderController {
    private final BucketService bucketService;

    public OrderController(BucketService bucketService) {
        this.bucketService = bucketService;
    }


    @GetMapping("/add")
    public String add(@RequestParam("id") List<Integer> ids) {
        this.bucketService.addToBucket(ids);
        return "id is passed" + ids;
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return this.bucketService.getProductInBucket();
    }

}
