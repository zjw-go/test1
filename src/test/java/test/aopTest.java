package test;

import com.zjw.entity.User;
import com.zjw.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class aopTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setPassword("123123");
        user.setEmail("111111@qq.com");
        userService.addNewUser(user);
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
        System.out.println("aaaaaaaaaaaaaa");
    }



}
