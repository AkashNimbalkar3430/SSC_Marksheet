package Evaluator_Login;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//import java.io.PrintWriter;


@SuppressWarnings("serial")
@WebServlet("/adminlogin")
public class Login_EvaluatorServlet extends HttpServlet{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) {
		  
		try {
			  LoginBean loginBean= new LoginDAO().retrieve(req);
			 // PrintWriter printWriter=res.getWriter();
			  res.setContentType("text/html");
			  if(loginBean==null) {
				 // printWriter.println("invalid ID And Password");
		    	  RequestDispatcher requestDispatcher=req.getRequestDispatcher("invaliduser.jsp");
		    	  requestDispatcher.include(req, res);
			  }else {
				  HttpSession httpSession=req.getSession();
		          httpSession.setAttribute("ub", loginBean);
		    	  RequestDispatcher requestDispatcher=req.getRequestDispatcher("AddMark.jsp");
		    	  requestDispatcher.forward(req, res);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}