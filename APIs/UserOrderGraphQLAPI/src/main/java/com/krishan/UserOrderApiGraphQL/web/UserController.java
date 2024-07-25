package com.krishan.UserOrderApiGraphQL.web;

import com.krishan.UserOrderApiGraphQL.entity.User;
import com.krishan.UserOrderApiGraphQL.service.UserService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //creating graphql api for createUser
    @MutationMapping(name = "createUser")
    public User createUser(@Argument String name, @Argument String phone, @Argument String email, @Argument String password){
        User user = new User();
        user.setName(name);
        user.setPhone(phone);
        user.setEmail(email);
        user.setPassword(password);
        return userService.createUser(user);
    }

    //api for getting all users
    @QueryMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    //api for getting a user
    @QueryMapping
    public User getUser(@Argument int userId){
        return userService.getUser(userId);
    }

    //api for deleting a user
    @MutationMapping
    public boolean deleteUser(@Argument int userId){
        return userService.deleteUser(userId);
    }

}
