package com.service.controller;

import com.service.model.Person;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import io.servicecomb.foundation.common.utils.BeanUtils;
import io.servicecomb.foundation.common.utils.Log4jUtils;

public class TestHprovider {

    HproviderImpl hproviderImpl;

    @Before
    public void setup() throws Exception{
        Log4jUtils.init();
        BeanUtils.init();
        hproviderImpl = BeanUtils.getBean("hproviderImpl");
    }



    @Test
    public void testadd(){

        Integer expactReturnValue = null; // You should put the expect Integer type value here.

        // You should put the parameter here, in such footprint: hproviderImpl.add(Integer a, Integer b)
        Integer returnValue = hproviderImpl.add(null, null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHei(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hproviderImpl.sayHei(String name)
        String returnValue = hproviderImpl.sayHei(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHello(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hproviderImpl.sayHello(String name)
        String returnValue = hproviderImpl.sayHello(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsayHi(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hproviderImpl.sayHi(String name)
        String returnValue = hproviderImpl.sayHi(null);

        assertEquals(expactReturnValue, returnValue);
    }


    @Test
    public void testsaySomething(){

        String expactReturnValue = null; // You should put the expect String type value here.

        // You should put the parameter here, in such footprint: hproviderImpl.saySomething(String prefix, Person user)
        String returnValue = hproviderImpl.saySomething(null, null);

        assertEquals(expactReturnValue, returnValue);
    }

}



