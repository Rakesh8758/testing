package com.rs.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rs.bean.Vehical;
import com.rs.cnfg.AppCnfg;

public class StrategyDPTest {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext factory=new AnnotationConfigApplicationContext(AppCnfg.class);
		Vehical vehical=factory.getBean("vehical",Vehical.class);
		vehical.journy("hyd", "spain");
		factory.close();

	}

}
