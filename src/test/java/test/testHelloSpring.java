package test;

import com.zjw.test.Greeting;
import com.zjw.test.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testHelloSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
//        helloSpring.print();



        Greeting zhangsan = (Greeting) context.getBean("zhangsan");
        zhangsan.sayGreeting();
        Greeting lisi = (Greeting) context.getBean("lisi");
        lisi.sayGreeting();
    }
}
