package ex01_method; 

public class Sample04 {

	public static void main(String[] args) {
		int res = divide(4, 2);
		System.out.println("나눗셈결과 : " + res );
	}

	public static int divide(int num1, int num2) {
		if(num2 == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -1;
		}

		 	return num1/num2;
	} 
}