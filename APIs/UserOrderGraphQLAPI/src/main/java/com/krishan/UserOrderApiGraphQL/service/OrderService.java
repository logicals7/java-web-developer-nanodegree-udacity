package com.krishan.UserOrderApiGraphQL.service;

import com.krishan.UserOrderApiGraphQL.entity.Order;
import com.krishan.UserOrderApiGraphQL.exceptions.ExceptionHelper;
import com.krishan.UserOrderApiGraphQL.repository.OrderRepo;
import com.krishan.UserOrderApiGraphQL.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private OrderRepo orderRepo;

    public OrderService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order createOrder(Order order){
        return orderRepo.save(order);
    }
    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }
    public Order getOrder(int orderId){
        Order order = orderRepo.findById(orderId).orElseThrow(ExceptionHelper::ResourceNotFoundException);
        return order;
    }
    public boolean deleteOrder(int orderId){
        Order order = orderRepo.findById(orderId).orElseThrow(ExceptionHelper::ResourceNotFoundException);
        orderRepo.delete(order);
        return true;
    }

}
