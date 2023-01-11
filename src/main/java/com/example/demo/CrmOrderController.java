package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api")
public class CrmOrderController {

    @Autowired
    CrmOrderService crmOrderService;

    @GetMapping("orders")
    public List<Order>  getAllOrders() {
        return crmOrderService.getOrders();
    }

    @GetMapping("orders/{id}")
    public ResponseEntity getOneOrder(@PathVariable Integer id) {
        Optional<Order> optional = crmOrderService.getOrderById(id);
        if(optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(optional.get());
        }
    }

    @PostMapping("orders")
    public void createOrder(@RequestBody Order order) {
        crmOrderService.addOrder(order);
    }

    @DeleteMapping("order/{id}")
    public void deleteOrder(@PathVariable Integer id) {
        crmOrderService.deleteOrderById(id);
    }
//
//    @PutMapping("client/{id}")
//    public void updateClient(@PathVariable Integer id, @RequestBody Client client) {
//        crmClientService.updateClient(id, client);
//    }
}
