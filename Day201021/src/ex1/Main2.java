package ex1;
import java.util.Scanner;


public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//String menu[][] = new String[3][3] ;
		String menu [][] = 
			{{"1.�Ƹ޸�ī��","2.ī���","3.�ٴҶ��"},
					{"4.���⽺����","5.����������","6.ġ������ũ"},
					{"7.��������ũ"," "," "}};


		for(int i=0; i<menu.length; i++) {
			for(int j=0; j<menu.length; j++) {
				System.out.println(menu[i][j]);
				
			
			}
		}

	}
}

