import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet{
	
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
      
	List<Student> studs=Arrays.asList(new Student(1,"Jancy"),new Student(2,"Jonathan"),new Student(3,"Jerin"));

	request.setAttribute("students", studs);
	RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
	rd.forward(request, response);
}
	

}
