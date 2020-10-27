import java.util.Scanner;
public class Almond4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int num[] = {45,66,84,55,64,88,99};
		
		int max = num[0];
		int min = num[0];
		int sum = 0;
		

		for(int i = 0 ; i<num.length; i++) {
			
			if( num[i]>max) { max = num[i]; }
			
			if( num[i]<min) { min = num[i]; } 
		}
		
		for(int i = 0; i<num.length; i++) {
			sum += num[i]; 
		}
	
		int flag = sum-max-min;
		System.out.println(flag);
	}
	
}
