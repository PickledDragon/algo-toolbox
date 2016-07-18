import java.util.Scanner;

public class Aplusb {

	public static void main(String args[]) {
	
		Scanner defScanner = new Scanner(System.in);
		int a = defScanner.nextInt();
		int b = defScanner.nextInt();
		if(a < 0 || a > 9 || b < 0 || b > 9 ) {
			System.out.println( "Error: Values a & b both must be 0<=a,b<=9" );
			return;
		}
		System.out.println( a + b );
	}

}
