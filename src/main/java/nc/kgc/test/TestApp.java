package nc.kgc.test;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhstart
 * @create 2019-02-27 16:39
 */

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext ct = new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(ct.toString());
    }
}
