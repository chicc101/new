package Practice;

public class Ex1 {

	public static void main(String[] args) {
		int sum = 0 ;
		int i = 0;
		while(sum < 21) {
			i++; 
			sum = sum+ i;
			System.out.println(i);
		}// while : 반복횟수가 정해져있지 않을 때 사용하면 좋음
		
		System.out.println(i);
	}
}
