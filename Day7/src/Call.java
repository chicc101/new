import java.util.Scanner;
public class Call {
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] name = new String [3];
		int [] age = new int [3];
		String [] num = new String [3];
		
		int i = 0 ;
		
		for(i=0 ; i < 3 ; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			name[i] = scan.next() ;
			System.out.println("���̸� �Է��ϼ���");
			age[i] = scan.nextInt() ; 
			System.out.println("��ȭ��ȣ�� �Է��ϼ���");
			num[i] = scan.next() ; }
		

	}

}


