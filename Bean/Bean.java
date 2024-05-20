package bean;
import java.io.Serializable;
@SuppressWarnings("serial")

public class Bean implements Serializable{
	
	public Bean(){}
	
	//Student Details
	private String RollNo,StudentFullName,MotherName;
	private int CenterNumber,SchoolNumber,Examyear;
	
	
	//Subject Sr.No,Name
	 private int srS1,srS2,srS3,srS4,srS5,srS6,srS7,srS8,srS9,srS10,srS11;
	 private String nameS1,nameS2,nameS3,nameS4,nameS5,nameS6,nameS7,nameS8,nameS9,nameS10,nameS11;
	 
	
	//Constant Marks(Maximum=100)
	 private int maxS1,maxS2,maxS3,maxS4,maxS5,maxS6,maxS7,maxS8,maxS9,maxS10,maxS11;//(Max Subject Marks to be Obtained)
	 
	//Obtained Marks,Total marks,Grade,Total marks in words
	 private int obtS1TU,obtS2TU,obtS3TU,obtS4TU,obtS5TU,obtS6TU,btS7TU,btS8TU,btS9TU,btS10TU,btS11TU;//(Obtained TheoryExam Marks)
	 private int obtS1TI,obtS2TI,obtS3TI,obtS4TI,obtS5TI,obtS6TI,obtS7TI,obtS8TI,obtS9TI,obtS10TI,obtS11TI;//(Obtained TheoryInternal Marks)
	 private int totS1,totS2,totS3,totS4,totS5,totS6,totS7,totS8,totS9,totS10,totS11;//(Total Marks =Exam+Internal Marks)
	
     private String grdS1,grdS2,grdS3,grdS4,grdS5,grdS6,grdS7,grdS8,grdS9,grdS10,grdS11;//(Subject Grade)
	 
	 private String totS1w,totS2w,totS3w,totS4w,totS5w,totS6w,totS7w,totS8w,totS9w,totS10w,totS11w;
	 
	 
	 
	//Total Result
     private String result,obtTotalMarksInWords,percentage; 
	 private int obtTotalMarks,outofTotalMarks;
	 
	 
	 
	 
	 
	 public String getPercentage() {
		return percentage;
	}
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}
	public int getMaxS7() {
		return maxS7;
	}
	public void setMaxS7(int maxS7) {
		this.maxS7 = maxS7;
	}
	public String getTotS7w() {
		return totS7w;
	}
	public void setTotS7w(String totS7w) {
		this.totS7w = totS7w;
	}
	public String getTotS8w() {
		return totS8w;
	}
	public void setTotS8w(String totS8w) {
		this.totS8w = totS8w;
	}
	public String getTotS9w() {
		return totS9w;
	}
	public void setTotS9w(String totS9w) {
		this.totS9w = totS9w;
	}
	public String getTotS10w() {
		return totS10w;
	}
	public void setTotS10w(String totS10w) {
		this.totS10w = totS10w;
	}
	public String getTotS11w() {
		return totS11w;
	}
	public void setTotS11w(String totS11w) {
		this.totS11w = totS11w;
	}
	public int getMaxS8() {
		return maxS8;
	}
	public void setMaxS8(int maxS8) {
		this.maxS8 = maxS8;
	}
	public int getMaxS9() {
		return maxS9;
	}
	public void setMaxS9(int maxS9) {
		this.maxS9 = maxS9;
	}
	public int getMaxS10() {
		return maxS10;
	}
	public void setMaxS10(int maxS10) {
		this.maxS10 = maxS10;
	}
	public int getMaxS11() {
		return maxS11;
	}
	public void setMaxS11(int maxS11) {
		this.maxS11 = maxS11;
	}
	public int getBtS7TU() {
		return btS7TU;
	}
	public void setBtS7TU(int btS7TU) {
		this.btS7TU = btS7TU;
	}
	public int getBtS8TU() {
		return btS8TU;
	}
	public void setBtS8TU(int btS8TU) {
		this.btS8TU = btS8TU;
	}
	public int getBtS9TU() {
		return btS9TU;
	}
	public void setBtS9TU(int btS9TU) {
		this.btS9TU = btS9TU;
	}
	public int getBtS10TU() {
		return btS10TU;
	}
	public void setBtS10TU(int btS10TU) {
		this.btS10TU = btS10TU;
	}
	public int getBtS11TU() {
		return btS11TU;
	}
	public void setBtS11TU(int btS11TU) {
		this.btS11TU = btS11TU;
	}
	public int getObtS7TI() {
		return obtS7TI;
	}
	public void setObtS7TI(int obtS7TI) {
		this.obtS7TI = obtS7TI;
	}
	public int getObtS8TI() {
		return obtS8TI;
	}
	public void setObtS8TI(int obtS8TI) {
		this.obtS8TI = obtS8TI;
	}
	public int getObtS9TI() {
		return obtS9TI;
	}
	public void setObtS9TI(int obtS9TI) {
		this.obtS9TI = obtS9TI;
	}
	public int getObtS10TI() {
		return obtS10TI;
	}
	public void setObtS10TI(int obtS10TI) {
		this.obtS10TI = obtS10TI;
	}
	public int getObtS11TI() {
		return obtS11TI;
	}
	public void setObtS11TI(int obtS11TI) {
		this.obtS11TI = obtS11TI;
	}
	public int getTotS7() {
		return totS7;
	}
	public void setTotS7(int totS7) {
		this.totS7 = totS7;
	}
	public int getTotS8() {
		return totS8;
	}
	public void setTotS8(int totS8) {
		this.totS8 = totS8;
	}
	public int getTotS9() {
		return totS9;
	}
	public void setTotS9(int totS9) {
		this.totS9 = totS9;
	}
	public int getTotS10() {
		return totS10;
	}
	public void setTotS10(int totS10) {
		this.totS10 = totS10;
	}
	public int getTotS11() {
		return totS11;
	}
	public void setTotS11(int totS11) {
		this.totS11 = totS11;
	}

	
		 
		 
		 
	 
	 public String getGrdS1() {
		return grdS1;
	}
	public void setGrdS1(String grdS1) {
		this.grdS1 = grdS1;
	}
	public String getGrdS2() {
		return grdS2;
	}
	public void setGrdS2(String grdS2) {
		this.grdS2 = grdS2;
	}
	public String getGrdS3() {
		return grdS3;
	}
	public void setGrdS3(String grdS3) {
		this.grdS3 = grdS3;
	}
	public String getGrdS4() {
		return grdS4;
	}
	public void setGrdS4(String grdS4) {
		this.grdS4 = grdS4;
	}
	public String getGrdS5() {
		return grdS5;
	}
	public void setGrdS5(String grdS5) {
		this.grdS5 = grdS5;
	}
	public String getGrdS6() {
		return grdS6;
	}
	public void setGrdS6(String grdS6) {
		this.grdS6 = grdS6;
	}

	
	 
	 
	 
	public String getRollNo() {
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getStudentFullName() {
		return StudentFullName;
	}
	public void setStudentFullName(String studentFullName) {
		StudentFullName = studentFullName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public int getCenterNumber() {
		return CenterNumber;
	}
	public void setCenterNumber(int centerNumber) {
		CenterNumber = centerNumber;
	}
	public int getSchoolNumber() {
		return SchoolNumber;
	}
	public void setSchoolNumber(int schoolNumber) {
		SchoolNumber = schoolNumber;
	}
	public int getExamyear() {
		return Examyear;
	}
	public void setExamyear(int examyear) {
		Examyear = examyear;
	}
	public int getSrS1() {
		return srS1;
	}
	public void setSrS1(int srS1) {
		this.srS1 = srS1;
	}
	public int getSrS2() {
		return srS2;
	}
	public void setSrS2(int srS2) {
		this.srS2 = srS2;
	}
	public int getSrS3() {
		return srS3;
	}
	public void setSrS3(int srS3) {
		this.srS3 = srS3;
	}
	public int getSrS4() {
		return srS4;
	}
	public void setSrS4(int srS4) {
		this.srS4 = srS4;
	}
	public int getSrS5() {
		return srS5;
	}
	public void setSrS5(int srS5) {
		this.srS5 = srS5;
	}
	public int getSrS6() {
		return srS6;
	}
	public void setSrS6(int srS6) {
		this.srS6 = srS6;
	}
	public int getSrS7() {
		return srS7;
	}
	public void setSrS7(int srS7) {
		this.srS7 = srS7;
	}
	public int getSrS8() {
		return srS8;
	}
	public void setSrS8(int srS8) {
		this.srS8 = srS8;
	}
	public int getSrS9() {
		return srS9;
	}
	public void setSrS9(int srS9) {
		this.srS9 = srS9;
	}
	public int getSrS10() {
		return srS10;
	}
	public void setSrS10(int srS10) {
		this.srS10 = srS10;
	}
	public int getSrS11() {
		return srS11;
	}
	public void setSrS11(int srS11) {
		this.srS11 = srS11;
	}
	public String getNameS1() {
		return nameS1;
	}
	public void setNameS1(String nameS1) {
		this.nameS1 = nameS1;
	}
	public String getNameS2() {
		return nameS2;
	}
	public void setNameS2(String nameS2) {
		this.nameS2 = nameS2;
	}
	public String getNameS3() {
		return nameS3;
	}
	public void setNameS3(String nameS3) {
		this.nameS3 = nameS3;
	}
	public String getNameS4() {
		return nameS4;
	}
	public void setNameS4(String nameS4) {
		this.nameS4 = nameS4;
	}
	public String getNameS5() {
		return nameS5;
	}
	public void setNameS5(String nameS5) {
		this.nameS5 = nameS5;
	}
	public String getNameS6() {
		return nameS6;
	}
	public void setNameS6(String nameS6) {
		this.nameS6 = nameS6;
	}
	public String getNameS7() {
		return nameS7;
	}
	public void setNameS7(String nameS7) {
		this.nameS7 = nameS7;
	}
	public String getNameS8() {
		return nameS8;
	}
	public void setNameS8(String nameS8) {
		this.nameS8 = nameS8;
	}
	public String getNameS9() {
		return nameS9;
	}
	public void setNameS9(String nameS9) {
		this.nameS9 = nameS9;
	}
	public String getNameS10() {
		return nameS10;
	}
	public void setNameS10(String nameS10) {
		this.nameS10 = nameS10;
	}
	public String getNameS11() {
		return nameS11;
	}
	public void setNameS11(String nameS11) {
		this.nameS11 = nameS11;
	}
	public int getMaxS1() {
		return maxS1;
	}
	public void setMaxS1(int maxS1) {
		this.maxS1 = maxS1;
	}
	public int getMaxS2() {
		return maxS2;
	}
	public void setMaxS2(int maxS2) {
		this.maxS2 = maxS2;
	}
	public int getMaxS3() {
		return maxS3;
	}
	public void setMaxS3(int maxS3) {
		this.maxS3 = maxS3;
	}
	public int getMaxS4() {
		return maxS4;
	}
	public void setMaxS4(int maxS4) {
		this.maxS4 = maxS4;
	}
	public int getMaxS5() {
		return maxS5;
	}
	public void setMaxS5(int maxS5) {
		this.maxS5 = maxS5;
	}
	public int getMaxS6() {
		return maxS6;
	}
	public void setMaxS6(int maxS6) {
		this.maxS6 = maxS6;
	}
	public int getObtS1TU() {
		return obtS1TU;
	}
	public void setObtS1TU(int obtS1TU) {
		this.obtS1TU = obtS1TU;
	}
	public int getObtS2TU() {
		return obtS2TU;
	}
	public void setObtS2TU(int obtS2TU) {
		this.obtS2TU = obtS2TU;
	}
	public int getObtS3TU() {
		return obtS3TU;
	}
	public void setObtS3TU(int obtS3TU) {
		this.obtS3TU = obtS3TU;
	}
	public int getObtS4TU() {
		return obtS4TU;
	}
	public void setObtS4TU(int obtS4TU) {
		this.obtS4TU = obtS4TU;
	}
	public int getObtS5TU() {
		return obtS5TU;
	}
	public void setObtS5TU(int obtS5TU) {
		this.obtS5TU = obtS5TU;
	}
	public int getObtS6TU() {
		return obtS6TU;
	}
	public void setObtS6TU(int obtS6TU) {
		this.obtS6TU = obtS6TU;
	}
	public int getObtS1TI() {
		return obtS1TI;
	}
	public void setObtS1TI(int obtS1TI) {
		this.obtS1TI = obtS1TI;
	}
	public int getObtS2TI() {
		return obtS2TI;
	}
	public void setObtS2TI(int obtS2TI) {
		this.obtS2TI = obtS2TI;
	}
	public int getObtS3TI() {
		return obtS3TI;
	}
	public void setObtS3TI(int obtS3TI) {
		this.obtS3TI = obtS3TI;
	}
	public int getObtS4TI() {
		return obtS4TI;
	}
	public void setObtS4TI(int obtS4TI) {
		this.obtS4TI = obtS4TI;
	}
	public int getObtS5TI() {
		return obtS5TI;
	}
	public void setObtS5TI(int obtS5TI) {
		this.obtS5TI = obtS5TI;
	}
	public int getObtS6TI() {
		return obtS6TI;
	}
	public void setObtS6TI(int obtS6TI) {
		this.obtS6TI = obtS6TI;
	}
	public int getTotS1() {
		return totS1;
	}
	public void setTotS1(int totS1) {
		this.totS1 = totS1;
	}
	public int getTotS2() {
		return totS2;
	}
	public void setTotS2(int totS2) {
		this.totS2 = totS2;
	}
	public int getTotS3() {
		return totS3;
	}
	public void setTotS3(int totS3) {
		this.totS3 = totS3;
	}
	public int getTotS4() {
		return totS4;
	}
	public void setTotS4(int totS4) {
		this.totS4 = totS4;
	}
	public int getTotS5() {
		return totS5;
	}
	public void setTotS5(int totS5) {
		this.totS5 = totS5;
	}
	public int getTotS6() {
		return totS6;
	}
	public void setTotS6(int totS6) {
		this.totS6 = totS6;
	}
	public String getGrdS7() {
		return grdS7;
	}
	public void setGrdS7(String grdS7) {
		this.grdS7 = grdS7;
	}
	public String getGrdS8() {
		return grdS8;
	}
	public void setGrdS8(String grdS8) {
		this.grdS8 = grdS8;
	}
	public String getGrdS9() {
		return grdS9;
	}
	public void setGrdS9(String grdS9) {
		this.grdS9 = grdS9;
	}
	public String getGrdS10() {
		return grdS10;
	}
	public void setGrdS10(String grdS10) {
		this.grdS10 = grdS10;
	}
	
	public String getGrdS11() {
		return grdS11;
	}
	public void setGrdS11(String grdS11) {
		this.grdS11 = grdS11;
	}
	public String getTotS1w() {
		return totS1w;
	}
	public void setTotS1w(String totS1w) {
		this.totS1w = totS1w;
	}
	public String getTotS2w() {
		return totS2w;
	}
	public void setTotS2w(String totS2w) {
		this.totS2w = totS2w;
	}
	public String getTotS3w() {
		return totS3w;
	}
	public void setTotS3w(String totS3w) {
		this.totS3w = totS3w;
	}
	public String getTotS4w() {
		return totS4w;
	}
	public void setTotS4w(String totS4w) {
		this.totS4w = totS4w;
	}
	public String getTotS5w() {
		return totS5w;
	}
	public void setTotS5w(String totS5w) {
		this.totS5w = totS5w;
	}
	public String getTotS6w() {
		return totS6w;
	}
	public void setTotS6w(String totS6w) {
		this.totS6w = totS6w;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getObtTotalMarksInWords() {
		return obtTotalMarksInWords;
	}
	public void setObtTotalMarksInWords(String obtTotalMarksInWords) {
		this.obtTotalMarksInWords = obtTotalMarksInWords;
	}
	public int getObtTotalMarks() {
		return obtTotalMarks;
	}
	public void setObtTotalMarks(int obtTotalMarks) {
		this.obtTotalMarks = obtTotalMarks;
	}
	public int getOutofTotalMarks() {
		return outofTotalMarks;
	}
	public void setOutofTotalMarks(int outofTotalMarks) {
		this.outofTotalMarks = outofTotalMarks;
	}
	 
	 
	 
	 
}