package ssc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import bean.Bean;
import DBConnection.DBConnection;
//import validate.ValidatedMarks;

public class SscDAO {

	
public int a=0,b=0,c=0;
	
	public int insert(Bean bean)
	{
	
		try
		{
			Connection con = DBConnection.getCon();
			
			
			
			//Student Details
			PreparedStatement ps = con.prepareStatement("INSERT INTO student (roll_no, centerno, schoolno, year, name, mothername) VALUES (?, ?, ?, ?, ?, ?)");
			
			ps.setString(1, bean.getRollNo());
			ps.setInt(2, bean.getCenterNumber());
			ps.setInt(3, bean.getSchoolNumber());
			ps.setInt(4, bean.getExamyear());
			ps.setString(5, bean.getStudentFullName());
			ps.setString(6, bean.getMotherName());
			
			
			 a =ps.executeUpdate();
			
			//Student Marks
			ArrayList<String> subjectNames = new ArrayList<String>();
			subjectNames.add(bean.getNameS1());
			subjectNames.add(bean.getNameS2());
			subjectNames.add(bean.getNameS3());
			subjectNames.add(bean.getNameS4());
			subjectNames.add(bean.getNameS5());
			subjectNames.add(bean.getNameS6());
			subjectNames.add(bean.getNameS7());
			subjectNames.add(bean.getNameS8());
			subjectNames.add(bean.getNameS9());
			subjectNames.add(bean.getNameS10());
			subjectNames.add(bean.getNameS11());

			ArrayList<Integer> subjectMarksT = new ArrayList<Integer>();
			subjectMarksT.add(bean.getObtS1TU());
			subjectMarksT.add(bean.getObtS2TU());
			subjectMarksT.add(bean.getObtS3TU());
			subjectMarksT.add(bean.getObtS4TU());
			subjectMarksT.add(bean.getObtS5TU());
			subjectMarksT.add(bean.getObtS6TU());
			subjectMarksT.add(bean.getBtS7TU());
			subjectMarksT.add(bean.getBtS8TU());
			subjectMarksT.add(bean.getBtS9TU());
			subjectMarksT.add(bean.getBtS10TU());
			subjectMarksT.add(bean.getBtS11TU());

			ArrayList<Integer> subjectInternalMarks = new ArrayList<Integer>();
			subjectInternalMarks.add(bean.getObtS1TI());
			subjectInternalMarks.add(bean.getObtS2TI());
			subjectInternalMarks.add(bean.getObtS3TI());
			subjectInternalMarks.add(bean.getObtS4TI());
			subjectInternalMarks.add(bean.getObtS5TI());
			subjectInternalMarks.add(bean.getObtS6TI());
			subjectInternalMarks.add(bean.getObtS7TI());
			subjectInternalMarks.add(bean.getObtS8TI());
			subjectInternalMarks.add(bean.getObtS9TI());
			subjectInternalMarks.add(bean.getObtS10TI());
			subjectInternalMarks.add(bean.getObtS11TI());
			
			
			ArrayList<Integer>maxMark=new ArrayList<Integer>();
			maxMark.add(bean.getMaxS1());
			maxMark.add(bean.getMaxS2());
			maxMark.add(bean.getMaxS3());
			maxMark.add(bean.getMaxS4());
			maxMark.add(bean.getMaxS5());
			maxMark.add(bean.getMaxS6());
			maxMark.add(bean.getMaxS7());
			maxMark.add(bean.getMaxS8());
			maxMark.add(bean.getMaxS9());
			maxMark.add(bean.getMaxS10());
			maxMark.add(bean.getMaxS11());
			
			ArrayList<String>ObtMarksInWords=new ArrayList<String>();
			ObtMarksInWords.add(bean.getTotS1w());
			ObtMarksInWords.add(bean.getTotS2w());
			ObtMarksInWords.add(bean.getTotS3w());
			ObtMarksInWords.add(bean.getTotS4w());
			ObtMarksInWords.add(bean.getTotS5w());
			ObtMarksInWords.add(bean.getTotS6w());
			ObtMarksInWords.add(bean.getTotS7w());
			ObtMarksInWords.add(bean.getTotS8w());
			ObtMarksInWords.add(bean.getTotS9w());
			ObtMarksInWords.add(bean.getTotS10w());
			ObtMarksInWords.add(bean.getTotS11w());
			
			
			ArrayList<String>Grade=new ArrayList<String>();
			Grade.add(bean.getGrdS1());
			Grade.add(bean.getGrdS2());
			Grade.add(bean.getGrdS3());
			Grade.add(bean.getGrdS4());
			Grade.add(bean.getGrdS5());
			Grade.add(bean.getGrdS6());
			Grade.add(bean.getGrdS7());
			Grade.add(bean.getGrdS8());
			Grade.add(bean.getGrdS9());
			Grade.add(bean.getGrdS10());
			Grade.add(bean.getGrdS11());
			
			
			
			
			//Subject Marks
			PreparedStatement ps2 = con.prepareStatement("INSERT INTO subject_marks (roll_no, sr_no, subject_name, maxmarks, obttu, obtti, totalmarks, totalmarksword, grade) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

			// Insert subject marks data for each subject
			for (int i = 0; i < subjectNames.size(); i++) {
			    // Set the values for the prepared statement
				ps2.setString(1, bean.getRollNo());
				ps2.setInt(2, i+1);
				ps2.setString(3, subjectNames.get(i));
			    ps2.setInt(4, maxMark.get(i));
			    ps2.setInt(5, subjectMarksT.get(i));
			    ps2.setInt(6, subjectInternalMarks.get(i));
			    int totalMarks = subjectMarksT.get(i) + subjectInternalMarks.get(i);
			    ps2.setInt(7, totalMarks);
			    ps2.setString(8, ObtMarksInWords.get(i));
			    ps2.setString(9, Grade.get(i));
			    
			  b  = ps2.executeUpdate();
			    
			}
			   
			//Student Result
			PreparedStatement ps3 = con.prepareStatement("INSERT INTO student_result (roll_no, totalmarksobt, outofmarks, result, TotalMarksWordsobt, persentage) VALUES (?, ?, ?, ?, ?, ?)");


			ps3.setString(1, bean.getRollNo());
			ps3.setInt(2, bean.getObtTotalMarks());
			ps3.setInt(3, bean.getOutofTotalMarks());
			ps3.setString(4, bean.getResult());
			ps3.setString(5, bean.getObtTotalMarksInWords());
            ps3.setString(6, bean.getPercentage());
			
			
			c = ps3.executeUpdate();

			
			
			c =a+b+c;
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return c;
		
	}

	
}