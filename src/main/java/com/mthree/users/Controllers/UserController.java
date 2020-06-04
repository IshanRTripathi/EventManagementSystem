package com.mthree.users.Controllers;

import com.mthree.events.Models.Event;
import com.mthree.users.Models.User;
import com.mthree.users.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/events/{id}/users")
    public List<User> getAllUsers()
    {
        return service.getAllUsers();
    }

    @RequestMapping("/events/{id}/users/{userid}")
    public User getUser(@PathVariable("userid") String userName)
    {
        return service.getUser(userName);
    }

    @RequestMapping(method = RequestMethod.POST,value="/events/{id}/users")
    public void addUser(@RequestBody User user, @PathVariable String id)
    {
        user.setEvent(new Event(id+"", "", ""));
        service.addUser(user);
    }

    @RequestMapping(method = RequestMethod.PUT,value="/events/{id}/users/{userid}")
    public void updateUser(@RequestBody User user, @PathVariable String userid)
    {
        service.updateUser(user);
    }

    @RequestMapping(method= RequestMethod.DELETE, value="/events/{id}/users/{userid}")
    public void deleteTopic(@PathVariable String userid)
    {
        service.deleteUser(userid);
    }
}
