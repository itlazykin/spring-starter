package com.dmdev.spring;

import com.dmdev.spring.ioc.Container;
import com.dmdev.spring.service.UserService;

public class ApplicationRunner {

    public static void main(String[] args) {
        var container = new Container();
        var userService = container.get(UserService.class);
    }
}
