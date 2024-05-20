package validate;

import java.util.Arrays;

public class ValidatedMarks {
	public static String checkResult_Theory(int subMark1,int subMark2,int subMark3,int subMark4, int subMark5, int subMark6) {
  	  
  	  if(subMark1>=35 && subMark2>=35 && subMark3>=35 && subMark4>=35 && subMark5>=35 && subMark6>=35) {
  		  return "PASS";
  	  }
  	  
  	  return "FAIL";
    }
	
	
	
	
	
	
	
	public static String convertToString(int number) {
	    if (number == 0) {
	        return "zero";
	    }

	    String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
	            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	    String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	    String word = "";

	    if ((number / 1000) > 0) {
	        word += convertToString(number / 1000) + " thousand ";
	        number %= 1000;
	    }

	    if ((number / 100) > 0) {
	        word += convertToString(number / 100) + " hundred ";
	        number %= 100;
	    }

	    if (number > 0) {
	        if (number < 20) {
	            word += units[number];
	        } else {
	            word += tens[number / 10] + " " + units[number % 10];
	        }
	    }

	    return word.trim();
	}
	
	
	
	
	
	
	
	public static String grade_theory(int marks) {
  	  if(marks>=91) {
			return "A+";
		}else if(marks>=60) {
			return "A";
		}else if(marks>=50) {
			return "B";
		}else if(marks>=40) {
			return "C";
		}else if(marks>=35 && marks<=40) {
			return "D";
		}
  	  return "F";
    }
	
	
	
	

	public static float calculateTopFivePercentage(int subject1Marks, int subject2Marks, int subject3Marks, int subject4Marks, int subject5Marks, int subject6Marks) {
		   
	    float topFiveTotalMarks = 0;
	    float highestMarks = 0;

	   
	    for (float marks : new float[] {subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks, subject6Marks}) {
	        if (marks > highestMarks) {
	            highestMarks = marks;
	        }
	    }

	    
	    float[] topMarksArray = new float[] {subject1Marks, subject2Marks, subject3Marks, subject4Marks, subject5Marks, subject6Marks};
	    Arrays.sort(topMarksArray);
	    for (int i = topMarksArray.length - 1; i >= topMarksArray.length - 5; i--) {
	        topFiveTotalMarks += topMarksArray[i];
	    }

	    float topFivePercentage = (topFiveTotalMarks / (5 * 100)) * 100;

	    return topFivePercentage;
	}

}