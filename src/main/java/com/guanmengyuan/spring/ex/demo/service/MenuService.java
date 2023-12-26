package com.guanmengyuan.spring.ex.demo.service;

import org.springframework.stereotype.Service;

import com.guanmengyuan.spring.ex.demo.api.MenuApi;
import com.guanmengyuan.spring.ex.demo.mapper.MenuMapper;
import com.guanmengyuan.spring.ex.demo.model.domain.Menu;
import com.mybatisflex.spring.service.impl.ServiceImpl; 

@Service
public class MenuService extends ServiceImpl<MenuMapper, Menu> implements MenuApi {

}