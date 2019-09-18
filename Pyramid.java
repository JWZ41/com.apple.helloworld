public class Pyramid{
	public static void main(Strring[] args){
		int i = 5;
		for(int j = 1;j <= i;j++){
			int times = (2*j)-1;
			int time = 0;
			while(time!=(i-j))
			{
				System.out.print(" ");
				time++;
			}
			while (time!= 0){
				System.out.print("*");
				times--;
			}
			System.out.print("\n");
		}	
	}
}