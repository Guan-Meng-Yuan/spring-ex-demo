package com.guanmengyuan.spring.ex.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guanmengyuan.spring.ex.demo.api.MenuApi;
import com.guanmengyuan.spring.ex.demo.model.domain.Menu;
import com.guanmengyuan.spring.ex.web.controller.BaseController;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("menus")
public class MenuController extends BaseController<MenuApi, Menu> {
    @Resource
    private MenuApi menuApi;

    public MenuController(MenuApi service) {
        super(service);
    }

    @Override
    public List<Menu> list(Menu param) {
        return Menu.create().where(Menu::getParentId).isNull().withRelations().list();
    }

}