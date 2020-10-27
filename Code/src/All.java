import java.util.Scanner; //스캐너 사용.1
import java.util.Random; // 랜덤 사용
import java.io.*; //버퍼리로더 준비
public class Cheatsheet {

	public static void main(String[] args) {




		////////////////////스캔, 랜덤 ////////////////////		
		////////////////////스캔, 랜덤 , 버퍼리로더 ////////////////////		
	}
		Scanner scan = new Scanner (System.in); // 스캐너 사용.2
		int c = scan.nextInt();  // c 값 키보드 입력받기
@@ -16,9 +17,13 @@ public class Cheatsheet {
		int a = random.nextInt(100); // 100까지의 랜섬정수




	////////////////////연산자 ////////////////////	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼리로더 사용 (System.in)= 키보드랑연결
		//버퍼리로더는 문자로받아서  인트형으로 변환  
		
        String str1 = br.readLine(); 
        int num1 = Integer.parseInt(str1);


		////////////////////연산자 ////////////////////	
				if (a>b && a>c) // && 그리고
				if (a>b || a>c) // ||또는 
				if (a>b != a>c) // != 안닌 
@@ -30,24 +35,35 @@ public class Cheatsheet {



	////////////////////배열 ////////////////////		
		////////////////////배열 ////////////////////	


				int [] A = {5,9,3}; //배열값 임의로 지정

				int [] B = new int [10]; //배열 공간만 지정
				int [] B = new int [10]; //배열 공간만 지정  0부터 9까지만사용하는것 *1부터 10까지가 아님*

				String[] itstring = new String[3]; // 스트링 공간 지정

				int c = 1; 
				int c = scan.nextInt();  // c 값 키보드 입력받기



	////////////////////for 문 ////////////////////	
				///잘못된 배열선언///


				int []myScores;  
				char []myChars;
				int [5] love ;  //x   배열만들때 사이즈는 참조변수 옆에 안붙는다
				Dog myDogs1[];	//클래스형 배열   
				Dog myDog2[7]; //x



		////////////////////for 문 ////////////////////	
				for(;;) { // 무한 포문
	}
				for(int i = 0 ; i<10; i++) //포문 기본모양


				for(int i = 0 ; i<5; i++) //포문 기본모양
				System.out.println(test[0]);
				System.out.println(test[0]);



@@ -60,10 +76,29 @@ public class Cheatsheet {
							min = a[i];	


							//// 배열 합을구하는 for 문 
					//// 배열 합을구하는 for 문 ////
							for(int i=0; i<a.length;i++) {
								sum+=a[i];  //모든합을 구하는 for 문
							}
					//// 배열의 피라미드 형식

							int[] [] a = new int [3][];
							a[0] = new int [3];
							a[1] = new int [2];
							a[2] = new int [3];


							ㅁ   // 이런식의 피라미드 모양가능
							ㅁㅁ
							ㅁㅁㅁ



					///class 배열 ///




						}

					}