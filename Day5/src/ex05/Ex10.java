package ex05;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {
		Random scan = new Random();
		
		int a = scan.nextInt(100);
		int b = scan.nextInt(100);
		int c = scan.nextInt(100);
		
		System.out.println("A°ª : " + a );
		System.out.println("B°ª : " + b );
		System.out.println("C°ª : " + c );
		
		if (a>b && a>c) {System.out.print("a");}
		if (b>c && b>a) {System.out.print("b");}
		if (c>a && c>b) {System.out.print("c");}
		
		
	}

}
