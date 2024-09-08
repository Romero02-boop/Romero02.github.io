import java.util.Scanner;

public class Project1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
     System.out.println("\n------Information-----------");
     System.out.println("\n");
		System.out.println("WHAT'S YOUR NAME?");
		
		System.out.print("NAME:");
		String name = scanner.nextLine();
		
		System.out.println("\n");
	
	System.out.println("HOW OLD ARE YOU?");	
	     
		System.out.print("AGE:");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("\n");
		
		System.out.println("WHERE DID YOU LIVE?");
		
		System.out.print("ADDRESS:");
		String address = scanner.nextLine();
		
		System.out.println("\n");
		
		System.out.println("\n-------information-------");
		
		System.out.println();
		
		System.out.println("Name:" +   name);
		
   	
		System.out.println("__________________________");
		
		System.out.println("Age:"   +   age);
		
		
		System.out.println("__________________________");
		
		System.out.println("Address:"  +     address);
		
		
		System.out.println("__________________________");
		System.out.println("\n");
		String paragraph = "Your name is "  +  name + " You are " + age + " years old  and live at " + address + ".";
 System.out.println(paragraph);
		
				
	}
}