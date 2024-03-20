package com.cydeo.bean_annotaion;

import com.cydeo.bean_annotaion.casefactory.Case;
import com.cydeo.bean_annotaion.casefactory.DellCase;
import com.cydeo.bean_annotaion.config.ComputerConfig;
import com.cydeo.bean_annotaion.config.RandomConfig;
import com.cydeo.bean_annotaion.monitorfactory.Monitor;
import com.cydeo.bean_annotaion.monitorfactory.SonyMonitor;
import com.cydeo.bean_annotaion.motherboardfactory.AsusMotherboard;
import com.cydeo.bean_annotaion.motherboardfactory.Motherboard;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComputerTest {

    public static void main(String[] args) {

        // Creating container by using Application Context
        ApplicationContext container = new AnnotationConfigApplicationContext(ComputerConfig.class, RandomConfig.class);

        // Creating container by using BeanFactory
        BeanFactory context = new AnnotationConfigApplicationContext();


        SonyMonitor sony = container.getBean(SonyMonitor.class);
        DellCase dell = container.getBean(DellCase.class);
        AsusMotherboard asus = container.getBean(AsusMotherboard.class);

        PC myPc = new PC(dell, sony, asus);
        myPc.powerUp();
        dell.pressPowerButton();

        // Retrieving Beans

        //Monitor theMonitor = container.getBean(Monitor.class);
        //Monitor  theMonitor = container.getBean(Monitor.class);
        //Case theCase = container.getBean(Case.class);
        //Motherboard theMotherboard = container.getBean(AsusMotherboard.class);
        //PC myPc2 = new PC(theCase,theMonitor,theMotherboard);

        //Multiple Objects

        Monitor theMonitor2 = container.getBean("monitorSony", Monitor.class); //DEFAULT BEAN NAME
        Monitor theMonitor3 = container.getBean("sony", Monitor.class); //CUSTOM BEAN NAME
        Monitor theMonitor4 = container.getBean( Monitor.class); // @Primary


    }


}
