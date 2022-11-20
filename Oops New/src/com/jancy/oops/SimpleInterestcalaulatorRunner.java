package com.jancy.oops;

import java.math.BigDecimal;

public class SimpleInterestcalaulatorRunner {

	public static void main(String[] args) {
         
		SimpleInterestcalaulator calculator=new SimpleInterestcalaulator("4500.00", "7.5");
		
		BigDecimal totalValue=calculator.calculateTotalValue(5);//5years
		
		System.out.println(totalValue);
           
	}

}
