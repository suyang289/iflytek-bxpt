package com.iflytek.controller;

import com.iflytek.pojo.User;
import com.iflytek.service.UserService;
import com.iflytek.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/list")
    public ResultUtil list() {
        return ResultUtil.ok(userService.list());
    }

    @GetMapping("/me/{id}")
    public ResultUtil findUser(@PathVariable("id") Integer id) {
        User user = new User();
        user.setId(id);
        return ResultUtil.ok(userService.queryUser(user));
    }


    @PostMapping("/password/update")
    public ResultUtil updatePassword(@RequestBody User user) {
        return userService.updatePassword(user);
    }


    @DeleteMapping("/remove/{id}")
    public ResultUtil removeUser(@PathVariable("id") Integer id) {
        return ResultUtil.ok();
    }
}
