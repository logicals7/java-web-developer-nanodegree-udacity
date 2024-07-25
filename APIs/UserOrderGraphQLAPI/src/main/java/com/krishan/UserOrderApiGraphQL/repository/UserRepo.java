package com.krishan.UserOrderApiGraphQL.repository;

import com.krishan.UserOrderApiGraphQL.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
}
