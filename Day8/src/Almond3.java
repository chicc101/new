import java.util.Scanner;
public class Almond3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num[] = new int [10];
		int num2[] = new int [10];

		for(int i = 0 ; i<num.length; i++) {
			num[i] = i + 1 ; 
		System.out.print(num[i] + " ");}
		System.out.print("\n");
		
		for(int i = 0 ; i<num.length; i++) {
			num2[i] = num[9-i];
			//num2[i] = (num.length+1) - num[i] ;
			
		System.out.print(num2[i] + " ");
			
			
			
		
			
		}
	
		
	}

}
