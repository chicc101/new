package ex1;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		//String menu[][] = new String[3][3] ;
		String menu [][] = 
			{{"��Ƹ޸�ī��(2500��)","��ī���(3500��)","��ٴҶ��(4000��)"},
					{"����⽺����(5000��)","�����������(6000��)","��ġ������ũ(6500��)"},
					{"����������ũ(7000��)"," "," "}};

		int cost [][] = 
			{{2500,3500,4000},
					{5000,6000,6500},
					{7000,0,0}};

		System.out.println("==================================");
		System.out.println("=====�ް�Ŀ�ǿ� ���� �� ȯ���մϴ�!!!=====");
		System.out.println("==================================");


		for(;;) { //for ����
			System.out.println("                  �ظ޴��� ������ �ּ����            ");
			System.out.println("----------------------------------");
			for(int i=0; i<menu.length; i++) {
				for(int j=0; j<menu.length; j++) {
					System.out.println(menu[i][j]);
				}
			}
			System.out.println("----------------------------------");
			int num2 = scan.nextInt();	
			
			switch(num2) {
			case 1 : System.out.println("\n   �Ƹ޸�ī��(2500��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[0][0];
			break;
			case 2 : System.out.println("\n   ī���(3500��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[0][1];
			break;
			case 3 : System.out.println("\n   �ٴҶ��(4000��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[0][2];
			break;
			case 4 : System.out.println("\n   ���⽺����(5000��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[1][0];
			break;
			case 5 : System.out.println("\n   ����������(6000��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[1][1];
			break;
			case 6 : System.out.println("\n   ġ������ũ(6500��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[1][2];
			break;
			case 7 : System.out.println("\n   ��������ũ(7000��)�� �����ϼ̽��ϴ�.\n");
			sum += cost[2][0];
			break;

			}
			System.out.println("----------------------------------");
			System.out.println("\n      [1] �޴��߰� [2] ����ϱ�\n");
			System.out.println("----------------------------------");

			int num3 = scan.nextInt();
			if( num3 == 2) { System.out.println("\n      ������ [ " + sum +" ]�� �Դϴ�.\n");
			break; 
			}

		}//for �ݺ� ��
	}
}






