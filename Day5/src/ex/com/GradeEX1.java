package ex.com;

import java.util.Scanner;

public class GradeEX1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] name = new String[5]; //name[0], name[1]
		int[] grade = new int [5];
		int sum = 0;
		
		for (int i = 0 ; i < 5; i++) {
			System.out.print(i+",�̸��Է� : ");
			name[i] = in.next();
			System.out.print(i+".�����Է� : ");
			grade[i] = in.nextInt();
			sum = sum + grade[i] ;
			
		}
		for (int i = 0 ; i < 5; i++) {
			System.out.print("�̸���� : " + name[i] + " /" );
			System.out.println(" �����Է� : " + grade[i]);
		}
			System.out.println("�� �հ� : " + sum);
			System.out.print("�� ��� : " + sum/5);
	}	
	
}
