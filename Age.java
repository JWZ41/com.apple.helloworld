import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		
		System.out.print("������������䣺:");
		Scanner scan = new Scanner(System.in);
		
		int age = scan.nextInt();
		
		switch(age / 18) {
			case 0:
			System.out.println("С���");
			break;
			
			default:
			System.out.println("ľ����");
			break;
		}
	}
}