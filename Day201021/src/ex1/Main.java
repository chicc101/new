package ex1;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//String menu[][] = new String[3][3] ;
		String menu [][] = 
			{{"①아메리카노(2500원)","②카페라떼(3500원)","③바닐라라떼(4000원)"},
					{"④딸기스무디(5000원)","⑤녹차스무디(6000원)","⑥치즈케이크(6500원)"},
					{"⑦초코케이크(7000원)"," "," "}};

		int cost [][] = 
			{{2500,3500,4000},
					{5000,6000,6500},
					{7000,0,0}};

		System.out.println("==================================");
		System.out.println("=====메가커피에 오신 걸 환영합니다!!!=====");
		System.out.println("==================================");


		for(;;) { //for 시작
			System.out.println("                  ※메뉴를 선택해 주세요※            ");
			System.out.println("----------------------------------");
			for(int i=0; i<menu.length; i++) {
				for(int j=0; j<menu.length; j++) {
					System.out.println(menu[i][j]);
				}
			}
			System.out.println("----------------------------------");
			int num2 = scan.nextInt();	
			
			switch(num2) {
			case 1 : System.out.println("\n   아메리카노(2500원)를 선택하셨습니다.\n");
			sum += cost[0][0];
			break;
			case 2 : System.out.println("\n   카페라떼(3500원)를 선택하셨습니다.\n");
			sum += cost[0][1];
			break;
			case 3 : System.out.println("\n   바닐라라떼(4000원)를 선택하셨습니다.\n");
			sum += cost[0][2];
			break;
			case 4 : System.out.println("\n   딸기스무디(5000원)를 선택하셨습니다.\n");
			sum += cost[1][0];
			break;
			case 5 : System.out.println("\n   녹차스무디(6000원)를 선택하셨습니다.\n");
			sum += cost[1][1];
			break;
			case 6 : System.out.println("\n   치즈케이크(6500원)를 선택하셨습니다.\n");
			sum += cost[1][2];
			break;
			case 7 : System.out.println("\n   초코케이크(7000원)를 선택하셨습니다.\n");
			sum += cost[2][0];
			break;

			}
			System.out.println("----------------------------------");
			System.out.println("\n      [1] 메뉴추가 [2] 계산하기\n");
			System.out.println("----------------------------------");

			int num3 = scan.nextInt();
			if( num3 == 2) { System.out.println("\n      가격은 [ " + sum +" ]원 입니다.\n");
			break; 
			}

		}//for 반복 끝
	}
}






