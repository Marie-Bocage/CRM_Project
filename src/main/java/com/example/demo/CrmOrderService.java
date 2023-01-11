package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrmOrderService {

    @Autowired
    OrderRepository orderRepository;

    public void addOrder (Order order) {
        orderRepository.save(order);
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Integer id) {
        return orderRepository.findById(id);
    }

    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }

    public void updateOrder(Integer id, Order order) {
        orderRepository.save(order);
    }
}
