package com.example.bucket.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class BucketRepository {
    private final List<Integer> idList = new ArrayList<>();

    public void addToBucket(List<Integer> ids) {
        idList.addAll(ids);
    }

    public List<Integer> getBucketContent() {
        return idList;
    }
}
