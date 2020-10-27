package Practice; //Q. for문 하나만 사용할 것

public class Ex3 {

	public static void main(String[] args) {
		int i=0;
		int sum = 0 ;

		for (i=0 ; i <51 ; i++) {
			if((i%3) == 0) {
				sum = sum+ i ;
			}
			
		}
		System.out.println(sum);
	}

}