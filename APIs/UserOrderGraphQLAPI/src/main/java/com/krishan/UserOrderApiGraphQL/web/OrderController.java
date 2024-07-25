package com.krishan.UserOrderApiGraphQL.web;

import com.krishan.UserOrderApiGraphQL.entity.Order;
import com.krishan.UserOrderApiGraphQL.entity.User;
import com.krishan.UserOrderApiGraphQL.service.OrderService;
import com.krishan.UserOrderApiGraphQL.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class OrderController {
    private OrderService orderService;
    private UserService userService;

    public OrderController(OrderService orderService, UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    //api for createOrder
    @MutationMapping
    public Order createOrder(@Argument String orderDetail, @Argument String address, @Argument int price, @Argument int userId){
        User user = userService.getUser(userId);
        Order order = new Order();
        order.setOrderDetail(orderDetail);
        order.setAddress(address);
        order.setPrice(price);
        order.setUser(user);
        return orderService.createOrder(order);
    }

    @QueryMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @QueryMapping
    public Order getOrder(@Argument int orderId){
        return orderService.getOrder(orderId);
    }

    @MutationMapping
    public boolean deleteOrder(@Argument int orderId){
        return orderService.deleteOrder(orderId);
    }
}
