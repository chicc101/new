
public class Array2 {

	public static void main(String[] args) {
		int arr[][] = new int [5][5] ;//�迭 ��ü ����
		int val =1;
		int sum = 0;



		for (int i=0 ; i<arr.length ; i++) { //�迭�� �ʱ�ȭ
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
		System.out.println("�����κ� ������ �հ��?");
		System.out.println(sum);
	}

}
