package classroomstudent;

import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("programingclassธรรม");
		
		 ArrayList<Student> stuList = new ArrayList<Student>();
		
		Student stu1 = new Student();
		stu1.setName("ธรรมกร");
		stu1.setPoint(80);
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
		stu6.setPoint(60);
		stuList.add(stu6);
		
		Student stu7 = new Student();
		stu7.setName("ธรรมกร");
		stu7.setPoint(85);
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
		
		for(Student s:stuList) {
			System.out.println("student: " + s.getName() + " point " + s.getPoint()  );
		}
		

	}

}
