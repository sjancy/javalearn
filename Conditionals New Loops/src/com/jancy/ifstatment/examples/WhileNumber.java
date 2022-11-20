package com.jancy.ifstatment.examples;

public class WhileNumber {

	private int limit;

	public WhileNumber(int limit) {

          this.limit=limit;
	}

	public void printSquareUptoLimit() {
         
		int i=1;
        while(i*i < limit) {
        	System.out.print(i*i + " ");
        	i++;
        }
        System.out.println();
		
	}

	public void printCubeUptoLimit() {
		int i=1;
        while(i*i*i < limit) {
        	System.out.print(i*i*i + " ");
        	i++;
        }
		System.out.println();
	}

}
