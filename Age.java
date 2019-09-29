import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		
		System.out.print("ÇëÊäÈëÄãµÄÄêÁä£º:");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		switch(age / 18) {
			case 0:
			System.out.println("Ğ¡½ã½ã");
			break;
			
			default:
			System.out.println("Ä¾ÄËÒÁ");
			break;
		}
	}
}