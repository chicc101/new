import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int [5];
		int sum;
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1) +"번째 숫자 입력 : " );
			arr[i] = scan.nextInt();
			sum = arr[i];

			for (int i = 0; i<arr.length; i++) {
				for (int j = 0; j<arr.length-1-i; j++) {
					if(arr[j] > arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.println("정렬 결과 :");
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + "\t");
				sum += arr[i] ;
			}
			System.out.println("\n입력한 수의 총 합은 :" + sum);
		}
	}
}

