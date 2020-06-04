package com.mthree.users.Services;

import com.mthree.users.Models.User;
import com.mthree.users.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers()
    {
        List<User> users= new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(String id)
    {
        return userRepository.findById(id).orElse(null);
    }

    public void addUser(User user)
    {
        userRepository.save(user);
    }

    public void updateUser(User user)
    {
        userRepository.save(user);
    }

    public void deleteUser(String id)
    {
        userRepository.deleteById(id);
    }
}
