import java.util.Scanner; //��ĳ�� ���.1
import java.util.Random; // ���� ���
import java.io.*; //���۸��δ� �غ�
public class Cheatsheet {

	public static void main(String[] args) {




		////////////////////��ĵ, ���� ////////////////////		
		////////////////////��ĵ, ���� , ���۸��δ� ////////////////////		
	}
		Scanner scan = new Scanner (System.in); // ��ĳ�� ���.2
		int c = scan.nextInt();  // c �� Ű���� �Է¹ޱ�
@@ -16,9 +17,13 @@ public class Cheatsheet {
		int a = random.nextInt(100); // 100������ ��������




	////////////////////������ ////////////////////	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //���۸��δ� ��� (System.in)= Ű���������
		//���۸��δ��� ���ڷι޾Ƽ�  ��Ʈ������ ��ȯ  
		
        String str1 = br.readLine(); 
        int num1 = Integer.parseInt(str1);


		////////////////////������ ////////////////////	
				if (a>b && a>c) // && �׸���
				if (a>b || a>c) // ||�Ǵ� 
				if (a>b != a>c) // != �ȴ� 
@@ -30,24 +35,35 @@ public class Cheatsheet {



	////////////////////�迭 ////////////////////		
		////////////////////�迭 ////////////////////	


				int [] A = {5,9,3}; //�迭�� ���Ƿ� ����

				int [] B = new int [10]; //�迭 ������ ����
				int [] B = new int [10]; //�迭 ������ ����  0���� 9����������ϴ°� *1���� 10������ �ƴ�*

				String[] itstring = new String[3]; // ��Ʈ�� ���� ����

				int c = 1; 
				int c = scan.nextInt();  // c �� Ű���� �Է¹ޱ�



	////////////////////for �� ////////////////////	
				///�߸��� �迭����///


				int []myScores;  
				char []myChars;
				int [5] love ;  //x   �迭���鶧 ������� �������� ���� �Ⱥٴ´�
				Dog myDogs1[];	//Ŭ������ �迭   
				Dog myDog2[7]; //x



		////////////////////for �� ////////////////////	
				for(;;) { // ���� ����
	}
				for(int i = 0 ; i<10; i++) //���� �⺻���


				for(int i = 0 ; i<5; i++) //���� �⺻���
				System.out.println(test[0]);
				System.out.println(test[0]);



@@ -60,10 +76,29 @@ public class Cheatsheet {
							min = a[i];	


							//// �迭 �������ϴ� for �� 
					//// �迭 �������ϴ� for �� ////
							for(int i=0; i<a.length;i++) {
								sum+=a[i];  //������� ���ϴ� for ��
							}
					//// �迭�� �Ƕ�̵� ����

							int[] [] a = new int [3][];
							a[0] = new int [3];
							a[1] = new int [2];
							a[2] = new int [3];


							��   // �̷����� �Ƕ�̵� ��簡��
							����
							������



					///class �迭 ///




						}

					}