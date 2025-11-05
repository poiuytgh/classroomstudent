package classroomstudent;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programingclassธรรม");
		
		//=============== Create Object ClassSleep ========
				Classsleep classsleep = new Classsleep();
				classsleep.setName("Sleep");
				classsleep.setTeacherName("Dear");
				classsleep.setQuantity(12);
				
		ArrayList<Student> stuList = new ArrayList<Student>();
		 
		Student stu1 = new Student();
		stu1.setName("ธรรมกร");
		stu1.setPoint(80);
		stu1.setGrade(calGrade(stu1.getPoint()));
		stuList.add(stu1);

		
		Student stu2 = new Student();
		stu2.setName("ธรรมมนัส");
		stu2.setPoint(90);
		stuList.add(stu2);
		
		Student stu3 = new Student();
		stu3.setName("ธรรมกรรม");
		stu3.setPoint(75);
		stuList.add(stu3);
		
		Student stu4 = new Student();
		stu4.setName("ธรรมชาตฺิ");
		stu4.setPoint(80);
		stuList.add(stu4);
		
		Student stu5 = new Student();
		stu5.setName("ธรรมรงค์");
		stu5.setPoint(70);
		stuList.add(stu5);
		
		Student stu6 = new Student();
		stu6.setName("ธรรมดา");
		stu6.setPoint(49);
		stuList.add(stu6);
		
		Student stu7 = new Student();
		stu7.setName("ธรรมกร");
		stu7.setPoint(55);
		stuList.add(stu7);
		
		Student stu8 = new Student();
		stu8.setName("ธรรมราช");
		stu8.setPoint(60);
		stuList.add(stu8);
		
		Student stu9 = new Student();
		stu9.setName("ธรรมการ");
		stu9.setPoint(40);
		stuList.add(stu9);
		
		Student stu10 = new Student();
		stu10.setName("ธรรมรัฐ");
		stu10.setPoint(90);
		stuList.add(stu10);
		
		Student stu11 = new Student();
		stu11.setName("ธรรมdhf");
		stu11.setPoint(90);
		stuList.add(stu11);
		
		Student stu12 = new Student();
		stu12.setName("xxx12");
		stu12.setPoint(0);
		
		
		stu12.setGrade("dear");
	
		
		// ===== all student 
		classsleep.setStuList(stuList);
		
		classsleep.getName();
		
		
		 System.out.println("\nรายชื่อนักเรียนที่ได้  คะแนน:");
	        for (Student s : classsleep.getStuList()) {
	          
	                System.out.println("ชื่อ: " + s.getName() + " | คะแนน: " + s.getPoint() + " | เกรด " + calGrade(s.getPoint() ));
	            
	        }
	        
	        System.out.println("cal number 1 : " + calNumber(10, "+", 5)); 
	        System.out.println("cal number 2 : " + calNumber(200, "-", 60)); 
	        
	     
	        String displayName = displayName("nat:" , "jan:" ,"chaingmai");
	        System.out.println("Fullname : " + displayName);
	        
	}
	
	public static String displayName( String name , String subname ,String location ) {
		return name + " " + subname + " " +location ;
	}
	
	public static int calNumber(int number1, String oper, int number2) {
		if (oper == "+") {
			return number1 + number2;
		}
		else if (oper =="-") {
			return number1 - number2;
		}
		return 0;
	}
		
	
	
	public static int plusNumber(int number1 , int number2) {
		int numCal = number1 + number2;
		return numCal;
	}
	
	
	public static int minusNumber(int number1 , int number2) {
		int numCal = number1 - number2;
		return numCal;
	}
	
	
	
	
	public static String calGrade(int point) {
		 if (point >= 80) {
			return "A" ; 
		 }
		 else if (point >=70) {
			 return "B";
		 }
		 else if (point >=60) {
			 return "c";
		 }
		 else if (point >=50) {
			 return "d";
		 }
		 else {
			 return "สอบตก";
		 }
	}
			 
			 
			 
			 
			 
			 
			 
			 
			 
	}
		
			
		
	

