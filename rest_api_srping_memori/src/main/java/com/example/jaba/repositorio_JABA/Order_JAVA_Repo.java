package com.example.jaba.repositorio_JABA;

import com.example.jaba.model_JABA.Order_JABA;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class Order_JABA_Repo {

    private final List<Order_JABA> orderList = new ArrayList<>();

    // Create
    public Order_JABA save(Order_JABA order) {
        orderList.add(order);
        return order;
    }

    // Read
    public List<Order_JABA> findAll() {
        return orderList;
    }

    public Optional<Order_JABA> findById(int orderId) {
        return orderList.stream()
                .filter(order -> order.getOrderId() == orderId)
                .findFirst();
    }

    // Update
    public Optional<Order_JABA> update(int orderId, Order_JABA updatedOrder) {
        Optional<Order_JABA> existingOrder = findById(orderId);
        existingOrder.ifPresent(order -> {
            order.setCustomer(updatedOrder.getCustomer());
            order.setStore(updatedOrder.getStore());
            order.setCantidadventas(updatedOrder.getCantidadventas());
            order.setDate(updatedOrder.getDate());
            order.setTiempo(updatedOrder.getTiempo());
            // Puedes agregar otros atributos aquí
        });
        return existingOrder;
    }

    // Delete
    public boolean delete(int orderId) {
        return orderList.removeIf(order -> order.getOrderId() == orderId);
    }
}
