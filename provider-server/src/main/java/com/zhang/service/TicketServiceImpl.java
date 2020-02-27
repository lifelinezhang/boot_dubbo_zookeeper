package com.zhang.service;

import com.zhang.service.TicketService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

// zookeeper：服务注册与发现

// 这个service注解如果不加的话是不能出现在dubbo中的，害的老子在这卡了半天
@Service  // 这个地方使用的就是dubbo的service注解
@Component  // 使用了dubbo就尽量不要使用service注解，因为dubbo也有service注解，容易引错注解
public class TicketServiceImpl implements TicketService {
    @Override
    public String getTicket() {
        return "调用了getTicket方法";
    }
}
