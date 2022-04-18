package my.phonepe.cab.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.User;
import my.phonepe.cab.management.services.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/register")
    public User registerUser(@RequestBody User user) {
        return userService.addOrUpdate(user);
    }

    @PatchMapping(value = "/deactivate")
    public User deactivateUser(@RequestBody User user) {
        return userService.addOrUpdate(user);
    }
}
