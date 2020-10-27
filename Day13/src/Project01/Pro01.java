package Project01;

public class Pro01 {
	
	public static int divide(int amount, int number);
	return amount / number;

	public static double divide(double amount, double number);
		return amount / number;

	
	public static void main(String[] args) 
	{
		int result1 = divide(10,4);
		double result2 = divide(10.0,4.0);
		
		System.out.println("정수형 나누기 결과 :" + result1);
		System.out.println("실수형 나누기 결과 :" + result1);
		
	}

}


