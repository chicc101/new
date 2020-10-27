package ex.com;

import java.util.Scanner;

public class GradeEX1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] name = new String[5]; //name[0], name[1]
		int[] grade = new int [5];
		int sum = 0;
		
		for (int i = 0 ; i < 5; i++) {
			System.out.print(i+",이름입력 : ");
			name[i] = in.next();
			System.out.print(i+".성적입력 : ");
			grade[i] = in.nextInt();
			sum = sum + grade[i] ;
			
		}
		for (int i = 0 ; i < 5; i++) {
			System.out.print("이름출력 : " + name[i] + " /" );
			System.out.println(" 성적입력 : " + grade[i]);
		}
			System.out.println("총 합계 : " + sum);
			System.out.print("총 평균 : " + sum/5);
	}	
	
}
