package home;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DBConnection.DBConnection;
import bean.Bean;
import jakarta.servlet.http.HttpServletRequest;

public class HomeDAOa {
	
	Bean beanClass=null;
	public Bean retrieveMarksheet(HttpServletRequest req)
	{
		int i=0,j=0,k=0;

		try
		{
			beanClass = new Bean();
			Connection con = DBConnection.getCon();
			
			int Year=Integer.parseInt(req.getParameter("year"));
			String  rollno = req.getParameter("rno");
			String MotherName=req.getParameter("mn");
			
			
			//Retrieving Student Details 
			PreparedStatement ps1 = con.prepareStatement("SELECT * FROM student WHERE (roll_no = ? AND year = ?) AND ( mothername = ? ) ");
			
			ps1.setString(1, rollno);
			ps1.setInt(2, Year);
			ps1.setString(3, MotherName);
			
			
			ResultSet rs1 = ps1.executeQuery();
			
			
			while(rs1.next()) {
				beanClass.setRollNo(rs1.getString("roll_no"));
				beanClass.setCenterNumber(rs1.getInt("centerno"));
				beanClass.setSchoolNumber(rs1.getInt("schoolno"));
			    beanClass.setExamyear(rs1.getInt("year"));
			    beanClass.setStudentFullName(rs1.getString("name"));
			    beanClass.setMotherName(rs1.getString("mothername"));
			    i=1;
			}
			
			
			
			//Retrieving Subjects Marks And Setting it Into Setter Methods 
			PreparedStatement ps2 = con.prepareStatement("SELECT * from subject_marks WHERE roll_no = ?");
			ps2.setString(1, rollno); 
			
			ResultSet rs2 = ps2.executeQuery();
			

			while(rs2.next())
			{
				 beanClass.setRollNo(rs2.getString(1));
						     
				 			 int srS=rs2.getInt(2);
							  String nameS = rs2.getString(3);
							  int maxS = rs2.getInt(4);
							  int obtSTU = rs2.getInt(5);
							  int obtSTI = rs2.getInt(6);
							  int totS = rs2.getInt(7);
							  String totsw = rs2.getString(8);
							  String grdS = rs2.getString(9);
				  
							  j=1;
								  switch (srS) {
								    case 1:
								    	    beanClass.setSrS1(srS);
								            beanClass.setNameS1(nameS);
								            beanClass.setMaxS1(maxS);
								            beanClass.setObtS1TU(obtSTU);
								            beanClass.setObtS1TI(obtSTI);
								            beanClass.setTotS1(totS);
								            beanClass.setTotS1w(totsw);
								            beanClass.setGrdS1(grdS);
								           
								      
								      break;
								    case 2:
								    	beanClass.setSrS2(srS);
							            beanClass.setNameS2(nameS);
							            beanClass.setMaxS2(maxS);
							            beanClass.setObtS2TU(obtSTU);
							            beanClass.setObtS2TI(obtSTI);
							            beanClass.setTotS2(totS);
							            beanClass.setTotS2w(totsw);
							            beanClass.setGrdS2(grdS);
								     
								      break;
								    case 3:
								    	beanClass.setSrS3(srS);
							            beanClass.setNameS3(nameS);
							            beanClass.setMaxS3(maxS);
							            beanClass.setObtS3TU(obtSTU);
							            beanClass.setObtS3TI(obtSTI);
							            beanClass.setTotS3(totS);
							            beanClass.setTotS3w(totsw);
							            beanClass.setGrdS3(grdS);
									     
									  break;
								    case 4:
								    	beanClass.setSrS4(srS);
							            beanClass.setNameS4(nameS);
							            beanClass.setMaxS4(maxS);
							            beanClass.setObtS4TU(obtSTU);
							            beanClass.setObtS4TI(obtSTI);
							            beanClass.setTotS4(totS);
							            beanClass.setTotS4w(totsw);
							            beanClass.setGrdS4(grdS);
									     
									  break;
								    case 5:
								    	beanClass.setSrS5(srS);
							            beanClass.setNameS5(nameS);
							            beanClass.setMaxS5(maxS);
							            beanClass.setObtS5TU(obtSTU);
							            beanClass.setObtS5TI(obtSTI);
							            beanClass.setTotS5(totS);
							            beanClass.setTotS5w(totsw);
							            beanClass.setGrdS5(grdS);
									     
									  break;
								    case 6:
								    	beanClass.setSrS6(srS);
							            beanClass.setNameS6(nameS);
							            beanClass.setMaxS6(maxS);
							            beanClass.setObtS6TU(obtSTU);
							            beanClass.setObtS6TI(obtSTI);
							            beanClass.setTotS6(totS);
							            beanClass.setTotS6w(totsw);
							            beanClass.setGrdS6(grdS);
									     
									  break;
								    case 7:
								    	beanClass.setSrS7(srS);
							            beanClass.setNameS7(nameS);
							            beanClass.setMaxS7(maxS);
							            beanClass.setBtS7TU(obtSTU);
							            beanClass.setObtS7TI(obtSTI);
							            beanClass.setTotS7(totS);
							            beanClass.setTotS7w(totsw);
							            beanClass.setGrdS7(grdS);
									     
									  break;
								    case 8:
								    	beanClass.setSrS8(srS);
							            beanClass.setNameS8(nameS);
							            beanClass.setMaxS8(maxS);
							            beanClass.setBtS8TU(obtSTU);
							            beanClass.setObtS8TI(obtSTI);
							            beanClass.setTotS8(totS);
							            beanClass.setTotS8w(totsw);
							            beanClass.setGrdS8(grdS);
									     
									  break;
								    case 9:
								    	beanClass.setSrS9(srS);
							            beanClass.setNameS9(nameS);
							            beanClass.setMaxS9(maxS);
							            beanClass.setBtS9TU(obtSTU);
							            beanClass.setObtS9TI(obtSTI);
							            beanClass.setTotS9(totS);
							            beanClass.setTotS9w(totsw);
							            beanClass.setGrdS9(grdS);
									     
									  break;
								    case 10:
								    	beanClass.setSrS10(srS);
							            beanClass.setNameS10(nameS);
							            beanClass.setMaxS10(maxS);
							            beanClass.setBtS10TU(obtSTU);
							            beanClass.setObtS10TI(obtSTI);
							            beanClass.setTotS10(totS);
							            beanClass.setTotS10w(totsw);
							            beanClass.setGrdS10(grdS);
									     
									  break;
								    case 11:
								    	beanClass.setSrS11(srS);
							            beanClass.setNameS11(nameS);
							            beanClass.setMaxS11(maxS);
							            beanClass.setBtS11TU(obtSTU);
							            beanClass.setObtS11TI(obtSTI);
							            beanClass.setTotS11(totS);
							            beanClass.setTotS11w(totsw);
							            beanClass.setGrdS11(grdS);
									     
									  break;
									  
									 
							}
								  
							//Retrieving Student Result 
								PreparedStatement ps3 = con.prepareStatement("SELECT * from student_result WHERE roll_no = ?");
								ps3.setString(1, rollno); 
								
								ResultSet rs3 = ps3.executeQuery();
								
								while(rs3.next())
								{
									beanClass.setObtTotalMarks(rs3.getInt(2));
									beanClass.setOutofTotalMarks(rs3.getInt(3));
									beanClass.setResult(rs3.getString(4));
									beanClass.setObtTotalMarksInWords(rs3.getString(5));
									beanClass.setPercentage(rs3.getString(6));
									k=1;
									
								}
								
				}
			
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		if(i==1 && j==1 && k==1)
		{
			return beanClass;
		}
		else {
			return null;
		}
		
	

}

}