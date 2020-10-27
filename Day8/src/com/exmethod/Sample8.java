package com.exmethod;
import java.util.Scanner;
public class Sample8{
	public static void main(String[] args)
	{

		Apple a = new Apple();

		int menu = 0;
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("\n1.입력, 2.평균,  3. 종료");

			menu = scan.nextInt(); {

			if(menu == 1) a.input();
			if(menu == 2) a.avgPrint();
			if(menu == 3) break;
			}
		}


	}
}




