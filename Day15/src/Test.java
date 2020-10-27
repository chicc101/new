

class Scanner {
	public Scanner() { //생성자
		System.out.println("내가 만든 Scanner");
		
	}
}

public class Test {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
		Scanner scan = new Scanner();
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int num1= input.nextInt();
		int num2= input.nextInt();
		
		System.out.println(num1 + num2);
		
	}

	
}


/* 
import java.util.Scanner;
Scanner scan = new Scanner(System.in);
변수명 = scan.nextInt();
변수명 = scan.next();
*/