package com.jancy.Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

public class WriteRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/file-write.txt");

		List<String> listAl = new ArrayList<>();
		listAl.add("Apple");
		listAl.add("Cat");
		listAl.add("Boy");
		listAl.add("Elephant");
		listAl.add("Dog");
		listAl.add("Tiger");

		Files.write(pathFileToWrite, listAl);
	}

}
