package com.ibytecode.businesslogic;

import javax.ejb.Stateless;

import com.ibytecode.business.HelloWorld;

/**
 * Session Bean implementation class HelloWorldBean
 */
@Stateless
public class HelloWorldBean implements HelloWorld {

    /**
     * Default constructor. 
     */
    public HelloWorldBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return  "Hello World !!!";
	}

}
