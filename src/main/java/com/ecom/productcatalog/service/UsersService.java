package com.ecom.productcatalog.service;

import com.ecom.productcatalog.model.LoginRequest;
import com.ecom.productcatalog.model.Users;
import com.ecom.productcatalog.repository.UsersRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UsersService {

    @Autowired
    UsersRepo usersRepo;
    public Users addUser(Users user)
    {

        return usersRepo.save(user);
    }
    public Boolean loginUser(LoginRequest loginRequest)
    {
        Optional<Users> user =usersRepo.findByEmail(loginRequest.getUserId());
        if(user==null)
        {
            return  false;
        }
        Users user1=user.get();
        if(!user1.getPassword().equals(loginRequest.getPassword()))
        {
            return false;
        }
        return true;


    }
}

