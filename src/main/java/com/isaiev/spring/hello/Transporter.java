package com.isaiev.spring.hello;

import java.util.List;

public class Transporter implements Car{
	
	private List <Car> carsToTrasport;
	
	public Transporter (List <Car> cars) {
		this.carsToTrasport=cars;
	}

	public void run() {
		System.out.println("Transporter started and going to transport "+carsToTrasport.size()+" sportcars!");
	}

}
