package com.usa.reto.repository;

import com.usa.reto.interfaces.OrderCrudInterface;
import com.usa.reto.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @author Ricardo Parrado Forero
 */

@Repository
public class OrderRepository {

    @Autowired
    private OrderCrudInterface orderCrudInterface;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Order> getAll() {
        return (List<Order>) orderCrudInterface.findAll();
    }

    public Optional<Order> getOrder(int id) {
        return orderCrudInterface.findById(id);
    }

    public Order create(Order order) {
        return orderCrudInterface.save(order);
    }

    public void update(Order order) {
        orderCrudInterface.save(order);
    }

    public void delete(Order order) {
        orderCrudInterface.delete(order);
    }

    public Optional<Order> lastUserId() {
        return orderCrudInterface.findTopByOrderByIdDesc();
    }

    public List<Order> findByZone(String zona) {
        return orderCrudInterface.findByZone(zona);
    }
}
