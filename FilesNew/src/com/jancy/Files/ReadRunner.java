package com.jancy.Files;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadRunner {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("./resources/data.txt"));
		try {
		    String line = br.readLine();

		    while (line != null) {
		        System.out.println(line);
		        line = br.readLine();
		    }
		} finally {
		    br.close();
		}
	}

}
