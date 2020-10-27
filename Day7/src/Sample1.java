import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] num = new int[5];
		
		
		for (int i=0 ; i < num.length; i++) {
			System.out.println("성적을 입력하시오 : ");
			num[i] = scan.nextInt();
			
		}
	}

}
