import java.util.*;

public class menu {

	public static void main(String[] args) {
		int drink , count;
		
		for(;;) {
		
			Scanner scan = new Scanner(System.in);
		
		
		System.out.println("--------------------");
		System.out.println("       �޴�����        ");
		System.out.println("--------------------");
		System.out.println("        �޴���         ");
		System.out.println("�� �Ƹ޸�ī��(hot) 2500��");
		System.out.println("�� �Ƹ޸�ī��(ice) 3000��");
		System.out.println("�� ������ 4000��");
		System.out.println("�� ���α׷� ����");
		drink = scan.nextInt(); 
		
		if(drink <= 3) { 
			System.out.print("������ �Է� �ϼ��� : "); 
			count = scan.nextInt();	}
		if(drink == 4) { 
			System.out.print("���α׷� ����");
		}
		
	
	} 

	}
}


