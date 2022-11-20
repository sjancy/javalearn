package com.jancy.oops;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(12,23);
		System.out.println(rectangle);
		
		rectangle.setLength(15);
		rectangle.setWidth(30);
		System.out.println(rectangle);
	}

}
