package com.example.bucket.service;

import com.example.bucket.repository.BucketRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BucketService {

    private final BucketRepository bucketRepository;

    public BucketService(BucketRepository bucketRepository) {
        this.bucketRepository = bucketRepository;
    }

    public void addToBucket(List<Integer> id) {
        this.bucketRepository.addToBucket(id);
    }

    public List<Integer> getProductInBucket() {
        return this.bucketRepository.getBucketContent();
    }
}
