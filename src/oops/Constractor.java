package oops;

class ParameterConsracor{
	
	String lastName = " Vish.";
	
	ParameterConsracor(String Name){
		System.out.println(Name +" "+ lastName);
		
	}
	
	public void method(){
		System.out.println("Prashant "+ this.lastName);
	}
	
}
	

public class Constractor {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConsracor ob = new ParameterConsracor("Prashant");
		ob.lastName = "Vishwakarma";
		
		System.out.println("Kamlesh " + ob.lastName );
		ob.method();
		
	}
	
}
