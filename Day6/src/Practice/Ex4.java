package Practice; //Q. while�� �ϳ��� ����� ��

public class Ex4 {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;

		while (i <= 50) {
			if ((i%3) == 0) {
			sum = sum+i ;
			
			System.out.println(i);
			
			}
			i++; //while �������� while �� �ۿ� ���ֱ�
			
		}
		System.out.println("�հ�" + sum);
	}

}



/*
package hanna.exfor; //while

public class Sample5 {

	public static void main(String[] args) 
	{
		int i = 1;

		while (i <= 5) {
			System.out.println (i + "��° �ݺ��Դϴ�.");
			i++;
		}
		System.out.println ("�ݺ��� �������ϴ�.");
	}

}

*/
