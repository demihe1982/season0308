package cn.dyan;

import cn.dyan.domain.UserMenu;
import cn.dyan.services.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@MapperScan("cn.dyan.mapping")
public class Application1 {

    public static void main(String[] args) throws SQLException {
       ApplicationContext context = SpringApplication.run(Application1.class,args);
        UserService userService = context.getBean(UserService.class);
        List<UserMenu> menuList = Arrays.asList(new UserMenu("admin","1001"),new UserMenu("admin","1002"));
        userService.authorize("admin",menuList);
        SpringApplication.exit(context);
    }

}
