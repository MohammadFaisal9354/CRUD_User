package com.technical.crud.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.technical.crud.models.User;

@Service
public class UserService {

    private List<User> list= new ArrayList<>();

    public User Create(User user){
        list.add(user);
        return user;
    }

    public List<User> getUsers(){
        return list;
    }

}