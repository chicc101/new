
public class Array2 {

	public static void main(String[] args) {
		int arr[][] = new int [5][5] ;//배열 객체 선언
		int val =1;
		int sum = 0;



		for (int i=0 ; i<arr.length ; i++) { //배열을 초기화
			for(int j=0 ; j<arr.length; j++) {
				arr[i][j] = val;
				val++;

			}
		}
		for (int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<5; j++) {

				System.out.printf("%4d", arr[i][j]); 
			}
			System.out.println("");
		}
		for (int i = 0 ; i<5 ; i++) {
			for(int j=0; j<5; j++) {
				if(i%2 == 1) {
					sum += arr[i][j];

				}
			}
		}
		System.out.println("음영부분 숫자의 합계는?");
		System.out.println(sum);
	}

}
