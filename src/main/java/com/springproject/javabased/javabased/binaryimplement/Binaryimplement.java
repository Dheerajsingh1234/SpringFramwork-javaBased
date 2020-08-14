package com.springproject.javabased.javabased.binaryimplement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Binaryimplement {
	@Autowired
	private Sortalgoritham sort;
	public Binaryimplement(Sortalgoritham sort)
	{
		this.sort=sort;
	}	


	/*public void setSort(Sortalgoritham sort) {
		this.sort = sort;
	}*/



public void mes1()
{
	System.out.println("message method work properrly");
}
public int binary(int[] number, int numsearch) {
	// TODO Auto-generated method stub
	int[] result =sort.sort(number);
	
	System.out.print(sort);
	return 3;
}
}
