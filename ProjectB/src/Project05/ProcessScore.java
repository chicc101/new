package Project05;

// ProcessScore.java
// 10명의 학생들의 점수들을 입력 받아 평균을 구하고
// 각 점수가 평균보다 큰지, 작은지 혹은 같은지를를 보여 준다.
import java.util.Scanner;

public class ProcessScore
{
	public static void main (String[] args)
	{
		// 10명의 학생들의 점수를 저장하는 배열
		int[ ]     scores = new int[10];

 		double     sum = 0.0;	// 점수들의 합계
   		double     average;		// 점수들의 평균
		Scanner    scan = new Scanner(System. in);

    	System.out.print("10명의 학생들의 점수를 입력하세요: ");

	    // 점수들의 합계를 구한다
   		for (int i = 0 ; i < 10 ; i++)
		{
			scores[i] = scan.nextInt( );
    	   	sum = sum + scores[i];
		}

		// 평균을 계산한다
		average = sum / 10.0;

		System.out.println("평균 = " + average);

		// 각 점수가 평균 이상인지 혹은 평균보다 작은지를 출력한다
   		for (int i = 0 ; i < 10 ; i++)
		{
			System.out.print("점수 " + scores[i]);
			if (scores[i] >= average)
			  System.out.println("은 평균 이상이다.");
			else
			  System.out.println("은 평균보다 작다.");
		}
	}
}