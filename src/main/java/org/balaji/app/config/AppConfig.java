package org.balaji.app.config;

import org.balaji.app.Alien;
import org.balaji.app.Computer;
import org.balaji.app.Desktop;
import org.balaji.app.Laptop;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("org.balaji.app")
public class AppConfig {
//
//    @Bean
//    public Alien alien(@Qualifier("laptop") Computer computer){
//        Alien obj = new Alien();
//        obj.setCom(computer);
//        return obj;
//    }
//
//
//
//    @Bean(name= {"des","beast"})
//    @Primary
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    public Laptop laptop(){
//        return new Laptop();
//    }
}
