package oops;
class InheritanceA{
  
	int num, num2;
	String cal;
}

class InheritanceB extends InheritanceA{
	int num3,num4;
	
	int inheriteClass() {
		System.out.println(cal);
		return this.num + this.num2+ this.num3+ this.num4;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		InheritanceA ob = new InheritanceA();
		ob.cal = "Sum of given 4 Number";
		InheritanceB ob2 =new InheritanceB();
		ob2.cal ="Caculation";
		ob2.num = 1;
		ob2.num2 = 1;
		ob2.num3 = 1;
		ob2.num4 = 1;
		System.out.println(ob2.inheriteClass());
//		ob2.inheriteClass();
		
		
		
		// TODO Auto-generated method stub

	}

}
