package com.example.jaba.repositorio_JABA;

import com.example.jaba.model_JABA.Store_JABA;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class Store_JABA_repo {
    private final List<Store_JABA> store_jabaList = new ArrayList<>();
    // Create
    public Store_JABA save(Store_JABA store) {
        store_jabaList.add(store);
        return store;
    }

    // Read
    public List<Store_JABA> findAll() {
        return store_jabaList;
    }

}
