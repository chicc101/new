package ex05;

public class Ex4 {

	public static void main(String[] args) {

		int sum = 0 ;

		for(int i=1 ; i<21 ; i++) {
			if(i%2 == 0) {
				sum = sum + i ;

			}
		}
		System.out.println("1에서 20까지의 수 중에 짝수 합계 :" + sum);
	}

}

