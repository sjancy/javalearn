package com.jancy.Files;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ReadRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToread=Paths.get("./resources/data.txt");
		
		Files.lines(pathFileToread)
		.map(String::toLowerCase)
		.filter(str->str.contains("c"))
		.forEach(System.out::println);//this one read the file linr by line

	}

}
