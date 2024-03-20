package com.cydeo.bean_annotaion.config;

import com.cydeo.bean_annotaion.casefactory.Case;
import com.cydeo.bean_annotaion.casefactory.DellCase;
import com.cydeo.bean_annotaion.monitorfactory.AcerMonitor;
import com.cydeo.bean_annotaion.monitorfactory.Monitor;
import com.cydeo.bean_annotaion.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotaion.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotaion.motherboardfactory.Motherboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ComputerConfig {

    @Bean(name="sony")
    public Monitor monitorSony(){
        return new SonyMonitor("25 inch Beast","Acer",25);
    }

    @Bean(name="sony2")
    public Monitor monitorSony2(){

        return new SonyMonitor("40 inch Beast","Sony",40);
    }
    @Bean
    @Primary
    public Monitor monitorAcer(){
        return new AcerMonitor("23 inch Beast","Acer",23);
    }
@Bean
    public Case caseDell(){
        return new DellCase("220B","Dell","240");
    }
@Bean
    public Motherboard motherboardAsus(){
        return new AsusMotherboard("BJ-200","Asus",4,6,"v2.44");
    }

}
