package com.guanmengyuan.spring.ex.demo.service.impl;

import com.guanmengyuan.spring.ex.demo.mapper.UserMapper;
import com.guanmengyuan.spring.ex.demo.model.domain.User;
import com.guanmengyuan.spring.ex.demo.service.UserService;
import com.mybatisflex.spring.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
