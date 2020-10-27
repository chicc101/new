package ex1;
import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//String menu[][] = new String[3][3] ;
		String menu [][] = 
			{{"1.아메리카노","2.카페라떼","3.바닐라라떼"},
					{"4.딸기스무디","5.녹차스무디","6.치즈케이크"},
					{"7.초코케이크"," "," "}};


		for(int i=0; i<menu.length; i++) {
			for(int j=0; j<menu.length; j++) {
				System.out.println(menu[i][j]);
				
			
			}
		}

	}
}

