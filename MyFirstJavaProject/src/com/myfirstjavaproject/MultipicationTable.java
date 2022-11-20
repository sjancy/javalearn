package com.myfirstjavaproject;
//import java.util.Scanner;
public class MultipicationTable {
	
	
	void printtable() {
		printtable(5);
}
	
	
	void printtable(int table) {
		printtable(table,1,10);
	}
	
	void printtable(int table, int from, int to) {
	    for(int i=from;i<=to;i++) {
	    	//System.out.println(i+"*6=" +i*table);
	    	System.out.printf("%d * %d=%d" ,table,i,table*i).println();
		}
	}
	
	
}
