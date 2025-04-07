package com.ecom.productcatalog.controller;

import com.ecom.productcatalog.model.LoginRequest;
import com.ecom.productcatalog.model.Users;
import com.ecom.productcatalog.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173")
public class UserController {
    @Autowired
    UsersService usersService;
    @PostMapping("/addUser")
    public Users addUser(@RequestBody Users user)
    {
        return usersService.addUser(user);
    }
    @PostMapping("/loginUser")
    public Boolean loginUser(@RequestBody LoginRequest loginRequest)
    {
        return usersService.loginUser(loginRequest);
    }
}
