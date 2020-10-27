package com.exmethod;
import java.util.Scanner;
class Apple {
	int[] num = new int[5];
	int sum = 0;
	double avg;

	void input() {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			System.out.println("성적을 입력하세요");
			num[i] = scan.nextInt(); } 
	}

	void sumCalc() {
		for (int i = 0; i<5; i++) {
			sum += num[i];} 
	}

	void sumPrint() {
		System.out.println("합계 :" + sum);
	}
	
	void avgPrint() {
		sumCalc();
		avg = sum/5.0;
		System.out.println("평균 : " +avg);
	}

}
