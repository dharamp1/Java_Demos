package containment;

import containment.date.MyDate;

public class Student {
	private int rollNo;
	private String name;
	
	//contained object
	private MyDate admissionDate;
	
	public Student() {
		// TODO Auto-generated constructor stub
		rollNo = 1;
		name = "Abc";
		admissionDate = new MyDate();
	}

}
