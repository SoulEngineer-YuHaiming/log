package com.example.log.controller;


import com.example.log.pojo.User;
import com.example.log.service.DemoService;
import com.example.log.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.awt.SunHints;

@RestController
public class DemoController {
    private  static  Logger logger = LoggerFactory.getLogger(DemoController.class);
    @Autowired
    private  UserService userServiceImpl;
    @Autowired
    private DemoService demoService;

    @RequestMapping("index")
    public  User index(){
        String id="1";
        String demo = demoService.demo();
        User user = userServiceImpl.findOne(id);
        System.out.println(user);
        System.out.println(demo);

        logger.error(user.toString());
        logger.error("进来了");

        return  user;
    }

}
