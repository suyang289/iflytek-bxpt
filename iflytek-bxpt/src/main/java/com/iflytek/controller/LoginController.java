package com.iflytek.controller;

import com.iflytek.pojo.User;
import com.iflytek.service.UserService;
import com.iflytek.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/home")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResultUtil login(HttpServletRequest request,
                            HttpServletResponse response,
                            @RequestBody User loginUser) {
        User user = userService.queryUser(loginUser);
        if (user == null) {
            return ResultUtil.error("�˺Ż������벻��ȷ����ȷ�Ϻ��ٵ�¼��");
        }
        HttpSession session = request.getSession();
        session.setAttribute("username", user.getUserName());
        return ResultUtil.ok(user);
    }


    @PostMapping("/logout")
    public ResultUtil logout(HttpServletRequest request,
                             HttpServletResponse response) {
        HttpSession session = request.getSession();
        session.removeAttribute("username");
        return ResultUtil.ok();
    }
}
