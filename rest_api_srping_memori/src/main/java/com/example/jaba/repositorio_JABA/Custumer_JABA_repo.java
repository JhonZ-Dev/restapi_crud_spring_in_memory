package com.example.jaba.repositorio_JABA;

import com.example.jaba.model_JABA.Custumer_JABA;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class Custumer_JABA_repo {

    private final List<Custumer_JABA> customerList = new ArrayList<>();

    // Create
    public Custumer_JABA save(Custumer_JABA customer) {
        customerList.add(customer);
        return customer;
    }

    // Read
    public List<Custumer_JABA> findAll() {
        return customerList;
    }

    public Optional<Custumer_JABA> findById(int customerId) {
        return customerList.stream()
                .filter(customer -> customer.getCustomerId() == customerId)
                .findFirst();
    }

    // Update
    public Optional<Custumer_JABA> update(int customerId, Custumer_JABA updatedCustomer) {
        Optional<Custumer_JABA> existingCustomer = findById(customerId);
        existingCustomer.ifPresent(customer -> {
            customer.setFullName(updatedCustomer.getFullName());
        });
        return existingCustomer;
    }

    // Delete
    public boolean delete(int customerId) {
        return customerList.removeIf(customer -> customer.getCustomerId() == customerId);
    }
}
