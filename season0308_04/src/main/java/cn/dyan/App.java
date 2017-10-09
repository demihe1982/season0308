package cn.dyan;

import cn.dyan.domain.TbUser;
import cn.dyan.services.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@SpringBootApplication
@MapperScan("cn.dyan.mapping")
public class App {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(App.class,args);
        UserService userService = context.getBean(UserService.class);
        List<TbUser> userList = userService.queryAll();
        System.out.println("userList total is "+userList.size());
        SpringApplication.exit(context);

    }
}
