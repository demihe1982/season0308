package cn.dyan;

import cn.dyan.domain.Order;
import cn.dyan.services.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


public class Application2 {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(Application1.class,args);
        OrderService orderService = context.getBean(OrderService.class);
        Order order = new Order();
        order.setBuyer("admin");
        order.setSeller("dyan");
        orderService.newOrder(order);
        SpringApplication.exit(context);
    }
}
