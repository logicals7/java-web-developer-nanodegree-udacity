package com.krishan.UserOrderApiGraphQL.service;

import com.krishan.UserOrderApiGraphQL.entity.User;
import com.krishan.UserOrderApiGraphQL.exceptions.ExceptionHelper;
import com.krishan.UserOrderApiGraphQL.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepo userRepo;
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    //create user
    public User createUser(User user){
        return userRepo.save(user);
    }
    //get all users
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    //get one user
    public User getUser(int userId){
        return userRepo.findById(userId).orElseThrow(ExceptionHelper::ResourceNotFoundException);
    }

    //delete user
    public boolean deleteUser(int userId){
        User user = userRepo.findById(userId).orElseThrow(ExceptionHelper::ResourceNotFoundException);
        userRepo.delete(user);
        return true;
    }

    //update user
//    public User updateUser(User user){
//        boolean user = userRepo.existsById(user.userId);
//        if (user){
//            userRepo.save()
//        }

}
