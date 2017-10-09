package cn.dyan.services;

import cn.dyan.domain.Order;
import cn.dyan.domain.OrderLog;
import cn.dyan.mapping.OrderMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class OrderService {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private LogService logService;

    @Autowired
    private EmailService emailService;


    @Transactional
    public void  newOrder(Order order){
        orderMapper.insert(order);
        OrderLog log = new OrderLog();
        BeanUtils.copyProperties(order,log);
        logService.addLog(log);
        emailService.sendEmail(order.getSeller(),"You have a new order!");
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public List<Order> selectAll(){
        return orderMapper.selectAll();
    }

    public void callTotal(List<Order> orders){
       Float total = orders.stream().reduce(0.0f,(f,r)->f+=r.getAmount(),(aFloat, aFloat2) -> aFloat+aFloat2);
       System.out.println(" Total is "+total.floatValue());
    }


    @Transactional
    private void updateOrderStatus(List<Order> orders){
        orders.stream().forEach(order -> {
            order.setStatus(1);
            orderMapper.updateByPrimaryKey(order);
        });
    }


    @Transactional
    public void payOrders(){
        List<Order> orders = selectAll();
        callTotal(orders);
        updateOrderStatus(orders);
    }





}
