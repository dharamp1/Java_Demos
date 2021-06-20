package demopack;

import mypack.MyClass;
import mypack.subpack.YourClass;

public class PackageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mypack.MyClass ob = new mypack.MyClass();
		MyClass ob = new MyClass();
		ob.show();
		//mypack.subpack.YourClass ob1 = new mypack.subpack.YourClass();
		YourClass ob1 = new YourClass();
		ob1.display();
		//mypack.subpack.YourClass ob2 = new mypack.subpack.YourClass();
		YourClass ob2 = new YourClass();
		ob2.display();
	}

}
