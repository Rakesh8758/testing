package com.rs.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("vehical")

public final class Vehical 
{
	@Autowired
	@Qualifier("Diesel")
	private Engine eng; //HAS-a property
	
	public Vehical()
	{
		System.out.println("Vehical::0-param constructor ");
	}
	
	public void journy(String startPlace,String DestinationPlace)
	{
		eng.start();
		System.out.println("Vehical journy is start "+startPlace);
		System.out.println("Journy is going ");
		eng.start();
		System.out.println("Journy is stoped "+DestinationPlace);
		
	}
	

}
