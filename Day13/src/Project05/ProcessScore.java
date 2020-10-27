

package Project05;
import java.util.Scanner;
public class ProcessScore {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] score = new int [10];

		int sum=0;



		for(int i=0  ; i<score.length; i++) {
			score[i] = scan.nextInt();

			sum += score[i] ;


		}
		int avg = sum/10;
		for(int i=0  ; i<score.length; i++) {
			if(score[i]<avg ) {
				System.out.println("Æò±Õ ÀÌÇÏ");
			}
			else
				System.out.println("Æò±Õ ÀÌ»ó");


		}
	}
}


