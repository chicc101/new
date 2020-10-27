package hanna.exfor;

public class Sample1 {

	public static void main(String[] args) 
	{
		int i ;

		for (i = 1; i <= 50; i+=3) {
			System.out.println ("반복하고 있습니다.");
			System.out.println ("for문 : " + i);

		}
		System.out.println(i);
		System.out.println("반복이 끝났습니다.");

	}

}
/*
 * for 문 안 증감식을 수정하기 보다는 if문으로 빼서 넣는 게 나음
 * 
 */

