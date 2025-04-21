package com.rs.cnfg;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.rs.bean")
public class AppCnfg 
{
	public AppCnfg()
	{
		System.out.println("AppCnfg::0-param constructor ");
	}

}
