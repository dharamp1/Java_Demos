package containment;

import containment.date.MyDate;

public class ContainmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.display();
		
		Employee e2 = new Employee(4302, "Tina Mehra", new MyDate(7,9,1999));
		e2.display();
	}

}
