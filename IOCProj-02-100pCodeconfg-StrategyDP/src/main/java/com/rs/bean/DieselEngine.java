package com.rs.bean;

import org.springframework.stereotype.Component;

@Component("Diesel")
public class DieselEngine implements Engine
{
	public DieselEngine()
	{
		System.out.println("DieselEngine::0-param constructor ");
	}
	
	@Override
	public void start()
	{
		System.out.println("DieselEngine is started ");
	}
	@Override
	public void stop()
	{
		System.out.println("DieselEngine is stoped ");
	}

}
