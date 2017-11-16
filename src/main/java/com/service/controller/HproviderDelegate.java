package com.service.controller;

import org.springframework.stereotype.Component;
import com.service.model.Person;


@Component
public class HproviderDelegate {

    public Integer add(Integer a,Integer b){

        // Do Some Magic Here!
        return a+b;
    };


    public String sayHei( String name){

        // Do Some Magic Here!
        return "sayHei"+name;
    };


    public String sayHello(String name){

        // Do Some Magic Here!
        return "sayHello"+name;
    };


    public String sayHi(String name){

        // Do Some Magic Here!
        return "sayHi"+name;
    };


    public String saySomething(String prefix,Person user){

        // Do Some Magic Here!
        return "say"+prefix;
    };

}
