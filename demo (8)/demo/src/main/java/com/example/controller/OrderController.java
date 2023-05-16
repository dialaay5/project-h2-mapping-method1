package com.example.controller;

import com.example.model.Orders;
import com.example.repository.OrderRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderRepository orderRepository;
    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping
    public Iterable<Orders> findall() {
        return orderRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return orderRepository.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteOrderById(@PathVariable Integer id){
        orderRepository.deleteById(id);
    }

    @PostMapping
    public Orders postOrder(@RequestBody Orders orders){
        return orderRepository.save(orders);
    }

    @PutMapping (value = "/{id}")
    public Orders updateOrder(@PathVariable Integer id, @RequestBody Orders orders){
        return orderRepository.save(orders);
    }
}
