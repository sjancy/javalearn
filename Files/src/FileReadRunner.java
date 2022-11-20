
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
	
  Path pathfileToRead=Paths.get("./Resources/data.txt");
  
  
  //this means all lines will show.It's too hard when we have more line.
  //List<String> lines=Files.readAllLines(pathfileToRead);
  //System.out.println(lines);
  
  
  
  //another way to read the line one by one
  
  Files.lines(pathfileToRead)
  .filter(str->str.contains("t"))
  .forEach(System.out::println);
	}

}
