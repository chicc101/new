import java.util.Scanner;
public class Call {
	


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String [] name = new String [3];
		int [] age = new int [3];
		String [] num = new String [3];
		
		int i = 0 ;
		
		for(i=0 ; i < 3 ; i++) {
			System.out.println("이름을 입력하세요");
			name[i] = scan.next() ;
			System.out.println("나이를 입력하세요");
			age[i] = scan.nextInt() ; 
			System.out.println("전화번호를 입력하세요");
			num[i] = scan.next() ; }
		

	}

}


