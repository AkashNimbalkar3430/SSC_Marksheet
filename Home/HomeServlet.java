package home;

import java.io.IOException;
import java.io.PrintWriter;

import bean.Bean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings({ "serial", "unused" })
@WebServlet("/login")
public class HomeServlet extends HttpServlet {

   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
	
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		int Year=Integer.parseInt(req.getParameter("year"));
		String  rollno = req.getParameter("rno");
		String MotherName=req.getParameter("mn");
		
		
		
		Bean bean = new HomeDAOa().retrieveMarksheet(req);
		
		if(bean==null)
		{
			//pw.print("<script>alert('Invalid Details !');</script>");
			RequestDispatcher rd = req.getRequestDispatcher("invaliduser.jsp");
			rd.include(req, res);
		}
		else {
			req.setAttribute("Bean", bean);
			RequestDispatcher rd = req.getRequestDispatcher("marklist.jsp");
			rd.include(req, res);
	
		}
		
		
	
	
	}


}