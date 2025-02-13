package com.guanmengyuan.spring.ex.demo.controller;

import com.guanmengyuan.spring.ex.common.model.dto.req.PageReq;
import com.guanmengyuan.spring.ex.common.model.dto.res.R;
import com.guanmengyuan.spring.ex.demo.model.domain.User;
import com.guanmengyuan.spring.ex.demo.service.UserService;
import com.guanmengyuan.spring.ex.web.controller.BaseController;
import com.mybatisflex.core.paginate.Page;
import com.mybatisflex.core.query.QueryWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends BaseController<User> {
    public UserController(UserService userService) {
        super(userService);
    }

    @GetMapping
    @Override
    public R<Page<User>> page(PageReq pageReq, User user) {
        return page(pageReq, QueryWrapper.create().where(User::getAccount).eq(user.getAccount()));
    }


}
