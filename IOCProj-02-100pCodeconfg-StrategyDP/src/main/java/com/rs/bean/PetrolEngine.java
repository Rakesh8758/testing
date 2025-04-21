package com.rs.bean;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements Engine
{
	public PetrolEngine()
	{
		System.out.println("PetrolEngine::0-param constructor ");
	}
	@Override
	public void start()
	{
		System.out.println("PetrolEngine is started");
	}
	@Override
	public void stop()
	{
		System.out.println("PetrolEngine is stoped ");
	}
	

}
