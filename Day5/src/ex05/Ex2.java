package ex05;

import java.util.Scanner;


public class Ex2 {


	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");

		int a = in.nextInt();

		if((a%2)==0) {
			System.out.println("¦��");
		}
		if((a%2)==1) {
			System.out.println("Ȧ��");
		}


	}

}
