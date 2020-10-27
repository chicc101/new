package ex05;
import java.util.Scanner;

public class Ex1{

		public static void main(String[] args) 
		{
			
			java.util.Scanner in = new java.util.Scanner(System.in);
			Scanner scan = new Scanner(System.in);
			
			
			System.out.print("1번 정수입력 : ") ;
			int a = in.nextInt();
			
			System.out.print("1번 정수입력 : ") ;
			int b = in.nextInt();
			
			if(a==b) {
				System.out.println("correct"); }
			
			if(a!=b) {
				System.out.println("Different");
			}
		}	

}


