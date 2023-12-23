import java.util.Scanner;

public class Ciklusi {
		
		public static void main(String[] args) {
				
				int x,y,z;
				Scanner tastatura = new Scanner(System.in);
				x = tastatura.nextInt();
				y = tastatura.nextInt();
				z = tastatura.nextInt();
				
				if(x>y||z>y) {
					System.out.println("1");
				}
				else
					System.out.println("2");
				if(Math.abs(x-y)>=z) {
				if(x>y) {
					System.out.println("3");
				}
				else 
					System.out.println("4");
				}
				else {
					System.out.println("5");
				}
		     
			 }
}
