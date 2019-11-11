package com.example.log.service.impl;

import com.example.log.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String demo() {
        return "测试";
    }
}
