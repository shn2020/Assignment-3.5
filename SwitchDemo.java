import java.util.Scanner;

public class SwitchDemo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print(
						"1. Administrator " +
						"\n2. Faculty " +
						"\n3. Staff " +
						"\n4. Student " +
						"\n5. Guest" + 
						"\n Enter your role in number: " );
		int roleNum = input.nextInt();
		
		switch (roleNum) {
		case 1: displayRole("Administrator"); break;
		case 2: displayRole("Faculty"); break;
		case 3: displayRole("Staff"); break;
		case 4: displayRole("Student"); break;
		case 5: displayRole("Guest"); break;
		
		}
		input.close();
	}
	
	public static void displayRole(String role) {
		System.out.println("Welcome " + role + "!");
	}
}