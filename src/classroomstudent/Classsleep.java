package classroomstudent;

import java.util.ArrayList;

public class Classsleep {

	//ขื่อห้องเรียน
	//ชื่ออาจาร
	//จำนวนนักเรียน
	private String name;
	private String teacherName;
	private int quantity;
	private ArrayList<Student> stuList;
	
	public void setStuList(ArrayList<Student> stuList) {
		this.stuList = stuList;
	}
	
	public ArrayList<Student> getStuList() {
		return stuList;
	}
	
	   public int getQuantity()	 {
	    	return quantity;
	    }
	
	 public void setQuantity(int q) {
		    this.quantity = q;
		  }
  
	 public String getName() {
		    return name;
		  }
	 
	   public void setName(String n) {
		    this.name = n;
	 }
		  
		   public void setTeacherName(String t) {
			    this.teacherName = t;
		 }
	
		   public String getTeacherName() {
			    return teacherName;
			  }
			  
			
	
}
