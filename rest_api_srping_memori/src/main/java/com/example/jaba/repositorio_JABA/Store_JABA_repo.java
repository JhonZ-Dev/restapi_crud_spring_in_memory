package com.example.jaba.repositorio_JABA;

import com.example.jaba.model_JABA.Store_JABA;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
//encontrar por ID
    public Optional<Store_JABA> findById(int storeId) {
        return store_jabaList.stream()
                .filter(store -> store.getStoreId() == storeId)
                .findFirst();
    }
    // Update
    // Update
    public Optional<Store_JABA> update(int storeId, Store_JABA updatedStore) {
        Optional<Store_JABA> existingStore = findById(storeId);
        existingStore.ifPresent(store -> {
            store.setStoreName(updatedStore.getStoreName());
        });
        return existingStore;
    }


    // Delete
    public boolean delete(int storeId) {
        return store_jabaList.removeIf(store -> store.getStoreId() == storeId);
    }

}
