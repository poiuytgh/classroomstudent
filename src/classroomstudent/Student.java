package classroomstudent;

public class Student {
	private int point;
	private String name;
	private String grade;
	private String location;
	
    public int getPoint()	 {
    	return point;
    }
    
    //setPoint 
    public void setPoint(int p) {
	    this.point = p;
	  }
    
	  // name
	  public String getName() {
	    return name;
	  }
	  
	   public void setName(String n) {
		    this.name = n;
	 }
	   
	   // grade
	   public void setGrade(String g) {
		    this.grade = g; }

	   public String getGrade()	 {
		    return grade;
		    }

	   public String getLocation() {
		return location;
	   }

	   public void setLocation(String location) {
		this.location = location;
	   }    
	   
	   
}
