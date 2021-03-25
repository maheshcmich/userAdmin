package edu.srikanth.userAdmin.controller;

import edu.srikanth.userAdmin.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @RequestMapping
    public User getUser(@RequestParam Long userId) {
        List<User> list = getUserList();

        for (User user : list) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    @RequestMapping("/list")
    public List<User> getUserListInfo(){
        return getUserList();
    }

    private List<User> getUserList() {
        LinkedList<User> userList = new LinkedList<User>();
        userList.add(new User(1l, "srikanth@email.com", "srikanth", "Mamillapalli"));
        userList.add(new User(2l, "mahesh@email.com", "Mahesh", "Mamillapalli"));
        userList.add(new User(3l, "sai@email.com", "sai", "Mamillapalli"));
        userList.add(new User(4l, "pavan@email.com", "Pavan", "Mamillapalli"));
        userList.add(new User(5l, "Sunil@email.com", "Sunil", "Nandigam"));
        userList.add(new User(6l, "karthik@email.com", "Karthik", "Nandigam"));

        return userList;

    }
}
