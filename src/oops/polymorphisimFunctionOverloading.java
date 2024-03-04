package oops;

class FunctionOverloading {
	void sameFunction() {
		System.out.println("Prashant Vishwakarma");
	}

	int sameFunction(int a, int b) {
		return a + b;
	}

	String sameFunction(String name, String lastName) {
		return name + " " + lastName;
	}

	int sameFunction(int a) {
		return a;
	}
}

public class polymorphisimFunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionOverloading ob = new FunctionOverloading();
		System.out.print("User Name ");
		ob.sameFunction();
		System.out.println("Enroll. " + ob.sameFunction(2, 3));
		System.out.println("Name " + ob.sameFunction("Prashant", "Vishwakarma"));
		System.out.println("Age " + ob.sameFunction(22));

	}

}
