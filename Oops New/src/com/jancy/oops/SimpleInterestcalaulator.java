package com.jancy.oops;

import java.math.BigDecimal;

public class SimpleInterestcalaulator {
	 
	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterestcalaulator(String principal, String interest) {
		this.principal=new BigDecimal(principal);
		this.interest=new BigDecimal(interest).divide(new BigDecimal(100));
	}

	public BigDecimal calculateTotalValue(int noOfYears) {
		//Total Value=principal + principal*interest*noOfyears
		//In BigDecimal we cannot use +,-,* . we should use add,multiply like that.
		
		BigDecimal noofYearsBigdecimal=new BigDecimal(noOfYears);
		
		BigDecimal totalValue=principal.add(principal.multiply(interest).multiply(noofYearsBigdecimal));
		
		return totalValue;
	}

}
