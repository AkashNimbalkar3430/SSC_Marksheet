package ssc;

import java.io.IOException;
import java.io.PrintWriter;

import bean.Bean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import validate.ValidatedMarks;


@SuppressWarnings("serial")
@WebServlet("/addmarksheet")
public class SscServlet extends HttpServlet {
	
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		
		Bean bean = new Bean();
		
		//Student Details
		String sRollNo=req.getParameter("rollno");
		int sCenter=Integer.parseInt(req.getParameter("cno"));
		int sSchoolNO=Integer.parseInt(req.getParameter("sno"));
		int eYear=Integer.parseInt(req.getParameter("eyear"));
		String sName = req.getParameter("sname");
		String sMotherName=req.getParameter("mname");
		
		
	
		
		
		
		//Subject Exam Marks
		int s1T = Integer.parseInt(req.getParameter("s1T"));
		int s2T = Integer.parseInt(req.getParameter("s2T"));
		int s3T = Integer.parseInt(req.getParameter("s3T"));
		int s4T = Integer.parseInt(req.getParameter("s4T"));
		int s5T = Integer.parseInt(req.getParameter("s5T"));
		int s6T = Integer.parseInt(req.getParameter("s6T"));
		
		//Subject Internal Marks
		int s1I = Integer.parseInt(req.getParameter("s1I"));
		int s2I = Integer.parseInt(req.getParameter("s2I"));
		int s3I = Integer.parseInt(req.getParameter("s3I"));
		int s4I = Integer.parseInt(req.getParameter("s4I"));
		int s5I = Integer.parseInt(req.getParameter("s5I"));
		int s6I = Integer.parseInt(req.getParameter("s6I"));
		
		//7 to 11 subjects greads
		String s7G=req.getParameter("dpgrade");
		String s8G=req.getParameter("hpegrade");
		String s9G=req.getParameter("sggrade");
		String s10G=req.getParameter("pdgrade");
		String s11G=req.getParameter("ictgrade");
	
		
		
		
		//Set Student Details
		
		bean.setRollNo(sRollNo);
		bean.setCenterNumber(sCenter);
		bean.setSchoolNumber(sSchoolNO);
		bean.setExamyear(eYear);
		bean.setStudentFullName(sName);
		bean.setMotherName(sMotherName);
		
		
		//Set Subject 1 Marks
		bean.setSrS1(1);
		bean.setNameS1("Marathi(1st Lang)");
		bean.setMaxS1(100);
		bean.setObtS1TU(s1T);
		bean.setObtS1TI(s1I);
		int totalS1=s1T+s1I;
		bean.setTotS1(totalS1);
		bean.setTotS1w(ValidatedMarks.convertToString(totalS1));
		bean.setGrdS1(ValidatedMarks.grade_theory(totalS1));
		
		//Set Subject 2 Marks
		bean.setSrS2(2);
		bean.setNameS2("Hindi(2nd Lang)");
		bean.setMaxS2(100);
		bean.setObtS2TU(s2T);
		bean.setObtS2TI(s2I);
		int totalS2=s2T+s2I;
		bean.setTotS2(totalS2);
		bean.setTotS2w(ValidatedMarks.convertToString(totalS2));
		bean.setGrdS2(ValidatedMarks.grade_theory(totalS2));
		
		//Set Subject 3 Marks
		bean.setSrS3(3);
		bean.setNameS3("English(2/3 lang)");
		bean.setMaxS3(100);
		bean.setObtS3TU(s3T);
		bean.setObtS3TI(s3I);
		int totalS3=s3T+s3I;
		bean.setTotS3(totalS3);
		bean.setTotS3w(ValidatedMarks.convertToString(totalS3));
		bean.setGrdS3(ValidatedMarks.grade_theory(totalS3));
		
		
		//Set Subject 4 Marks
		bean.setSrS4(4);
		bean.setNameS4("Mathematics");
		bean.setMaxS4(100);
		bean.setObtS4TU(s4T);
		bean.setObtS4TI(s4I);
		int totalS4=s4T+s4I;
		bean.setTotS4(totalS4);
		bean.setTotS4w(ValidatedMarks.convertToString(totalS4));
		bean.setGrdS4(ValidatedMarks.grade_theory(totalS4));
		
		
		//Set Subject 5 Marks
	    bean.setSrS5(5);
		bean.setNameS5("Science And Technology");
		bean.setMaxS5(100);
		bean.setObtS5TU(s5T);
		bean.setObtS5TI(s5I);
		int totalS5=s5T+s5I;
		bean.setTotS5(totalS5);
		bean.setTotS5w(ValidatedMarks.convertToString(totalS5));
		bean.setGrdS5(ValidatedMarks.grade_theory(totalS5));
		
		
		//Set Subject 6 Marks
		bean.setSrS6(6);
		bean.setNameS6("Social Science");
		bean.setMaxS6(100);
		bean.setObtS6TU(s6T);
		bean.setObtS6TI(s6I);
		int totalS6=s6T+s6I;
		bean.setTotS6(totalS6);
		bean.setTotS6w(ValidatedMarks.convertToString(totalS6));
		bean.setGrdS6(ValidatedMarks.grade_theory(totalS6));
		
		
		//Set Subject 7 Marks
		bean.setSrS7(7);
		bean.setNameS7("Drawing And Painting");
		bean.setMaxS7(000);
		bean.setBtS7TU(00);
		bean.setObtS7TI(00);
		bean.setTotS7(00);
		bean.setTotS7w("*****");
		bean.setGrdS7(s7G);
				
			
		
		//Set Subject 8 Marks
		bean.setSrS8(8);
		bean.setNameS8("Health And Physical Education");
		bean.setMaxS8(000);
		bean.setBtS8TU(00);
		bean.setObtS8TI(00);
		bean.setTotS8(00);
		bean.setTotS8w("*****");
		bean.setGrdS8(s8G);
				
				
				
		//Set Subject 9 Marks
		bean.setSrS9(9);
		bean.setNameS9("Scouting/Guiding");
		bean.setMaxS9(000);
		bean.setBtS9TU(00);
		bean.setObtS9TI(00);
		bean.setTotS9(00);
		bean.setTotS9w("*****");
		bean.setGrdS9(s9G);
				
				
				
		//Set Subject 10 Marks
		bean.setSrS10(10);
		bean.setNameS10("Personality Development");
		bean.setMaxS10(000);
		bean.setBtS10TU(00);
		bean.setObtS10TI(00);
		bean.setTotS10(00);
		bean.setTotS10w("*****");
		bean.setGrdS10(s10G);
				
				
				
		//Set Subject 11 Marks
		bean.setSrS11(11);
		bean.setNameS11("Information Communication Technology");
		bean.setMaxS11(000);
		bean.setBtS11TU(00);
		bean.setObtS11TI(00);
		bean.setTotS11(00);
		bean.setTotS11w("*****");
		bean.setGrdS11(s11G);
				
				
				
		
		
		
		//Setting Result Table
		
		int tobtMark=totalS1+totalS2+totalS3+totalS4+totalS5+totalS6;
		bean.setObtTotalMarks(tobtMark);
		
		bean.setObtTotalMarksInWords(ValidatedMarks.convertToString(tobtMark));
		
		bean.setOutofTotalMarks(600);
		
		bean.setResult(ValidatedMarks.checkResult_Theory(totalS1,totalS2,totalS3,totalS4,totalS5,totalS6));
	    
		
		String r= ValidatedMarks.checkResult_Theory(totalS1,totalS2,totalS3,totalS4,totalS5,totalS6);
		if(r=="PASS") {
		bean.setPercentage(ValidatedMarks.calculateTopFivePercentage(totalS1,totalS2,totalS3,totalS4,totalS5,totalS6)+"%");
		}
		else {
		bean.setPercentage("-");	
		}
		
		
		int k= new SscDAO().insert(bean);
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		if(k==3)
		{
			pw.print("Data inserted successfully!");
		    RequestDispatcher rd = req.getRequestDispatcher("insertsuccessfull.jsp");
		    rd.include(req, res);
		}
		
		RequestDispatcher rDispatcher = req.getRequestDispatcher("AddMark.html");
		rDispatcher.include(req, res);
		
		
		
		
	}
	

}