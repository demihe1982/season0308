package cn.dyan;

import cn.dyan.domain.TbUser;
import cn.dyan.services.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
@MapperScan("cn.dyan.mapping")
public class App {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(App.class,args);
        UserService userService = context.getBean(UserService.class);
        List<TbUser> userList = userService.getAll();
        System.out.println("userList total is "+userList.size());


        TbUser user = new TbUser();
        user.setUname("TestTx1009");
        user.setUuid(UUID.randomUUID().toString());
        userService.saveUser(user);

        SpringApplication.exit(context);
    }
}
