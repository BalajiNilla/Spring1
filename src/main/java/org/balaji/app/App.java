package org.balaji.app;

import org.balaji.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop ds = context.getBean(Desktop.class);
//        ds.compile();

        Alien obj = context.getBean(Alien.class);
        obj.code();



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien",Alien.class);
//
//        System.out.println(obj.getAge());
//        obj.code();

//        Computer com = context.getBean(Computer.class);
//        com.compile();

//        Alien obj2 = (Alien) context.getBean("alien");
//        obj.age =26;
//        System.out.println(obj.age);
    }
}
