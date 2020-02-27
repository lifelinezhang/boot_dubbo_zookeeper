package com.zhang.service;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service  // 这个service是放到spring容器中
public class UserService {

    // 想拿到 provider-server提供的票，要去注册中心拿到服务
    @Reference// 引用 ，这是后没有这个类会报错，有两种解决办法： 1、pom坐标  2、定义路径相同的接口
    TicketService ticketService;

    public String bugTicket() {
        return ticketService.getTicket();
    }
}
