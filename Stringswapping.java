package day5;

public class Stringswapping {
	public static void main(String[] args) {
		String name1 = "Ramu";
		String name2= "Abdul";
		System.out.println("Before swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		name2 = name2+name1;//AbdulRamu
		name1 = name2.substring(0, name2.length()-name1.length());
		name2 = name2.substring(name1.length());
		System.out.println("After Swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		
	}//main method
	

}//class
