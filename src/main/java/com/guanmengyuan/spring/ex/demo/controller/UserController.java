package com.guanmengyuan.spring.ex.demo.controller;

import com.guanmengyuan.spring.ex.demo.model.domain.User;
import com.guanmengyuan.spring.ex.demo.service.UserService;
import com.guanmengyuan.spring.ex.web.controller.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends BaseController<User> {

    public UserController(UserService service) {
        super(service);
    }
}
