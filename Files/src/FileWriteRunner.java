
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
	
  Path pathFileToWrite=Paths.get("./Resources/file-Write.txt");
  
  List<String> list=List.of("Apple", "Cat", "Dog", "Banana");
  
  
  Files.write(pathFileToWrite, list);
  
  
	}

}
