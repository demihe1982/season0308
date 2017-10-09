package cn.dyan.services;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAspectJAutoProxy(exposeProxy = true)
@Transactional
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Sql("classpath:insert_50_order_data.sql")
    @BeforeClass
    public static void setUp(){}

    @Test
    public void testSelectAll(){

    }
    @Test
    public void testPayOrders(){
        long start = System.currentTimeMillis();
        orderService.payOrders();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>"+(System.currentTimeMillis()-start));
    }



}
