package Practice;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		
		int[] seat = new int [10];
		Scanner in = new Scanner(System.in);
		int i ;
		
		System.out.println(" LAB : ���� ���� �ý��� ");
		for(i=0 ; i<10 ; i++) {
			
		System.out.println("--------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------");
		System.out.println("0 0 0 0 0 0 0 0 0 0");
		System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ��� (����� -1) : ");
	
		seat [i] = in.nextInt();
		System.out.println(seat [i] + "�� �ڸ��� ����Ǿ����ϴ�.");
		
		System.out.println("--------------------");
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("--------------------"); 
		System.out.println("0 0 0 0 0 0 0 0 0 0");

		
	}

}
