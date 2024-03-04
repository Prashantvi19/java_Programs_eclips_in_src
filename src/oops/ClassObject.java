package oops;

//import java.util.*;
class ObjeClass{
	
	String Name;
	int year;
	
	 void callFun(String name, int age ) {
		
		System.out.println("Name:"+name+" "+Name +" Age "+age+" year "+year);


}}

public class ClassObject {

	
		 public static void main(String args[]) {
		
			 
		ObjeClass obj1 = new ObjeClass();
		
		obj1.Name="Vishwakarma";
		obj1.year=4;
		
		
		obj1.callFun("prashant", 21);
	}
}
