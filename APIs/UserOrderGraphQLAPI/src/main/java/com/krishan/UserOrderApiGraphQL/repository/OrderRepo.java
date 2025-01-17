package com.krishan.UserOrderApiGraphQL.repository;

import com.krishan.UserOrderApiGraphQL.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
}
