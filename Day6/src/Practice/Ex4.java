package Practice; //Q. while문 하나만 사용할 것

public class Ex4 {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;

		while (i <= 50) {
			if ((i%3) == 0) {
			sum = sum+i ;
			
			System.out.println(i);
			
			}
			i++; //while 증감식은 while 문 밖에 써주기
			
		}
		System.out.println("합계" + sum);
	}

}



/*
package hanna.exfor; //while

public class Sample5 {

	public static void main(String[] args) 
	{
		int i = 1;

		while (i <= 5) {
			System.out.println (i + "번째 반복입니다.");
			i++;
		}
		System.out.println ("반복이 끝났습니다.");
	}

}

*/
