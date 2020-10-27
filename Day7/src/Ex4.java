

public class Ex4 {

	public static void main(String[] args) {


		int [] num = new int[10];
		int [] num2 = new int[10];


		System.out.println("1부터 10까지 저장");
		for (int i=0; i<num.length; i++) {
			System.out.print((i+1));
			System.out.print(" ");
		}
		System.out.print("\n"); //줄바꿈
		System.out.println("거꾸로");
		for (int i=0; i<num2.length; i++) {
			System.out.print((num2.length-i));
			System.out.print(" ");
		}
	}
}



