
// 문제 2.10: VendingChange.java
// 거스름돈을 계산한다.
import java.util.Scanner;

public class Ex08
{
	public static void main (String[] args)
	{
		int itemPrice;
		int change;
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int coin5;
		int coin1;

		Scanner keyboard = new Scanner(System.in);

		// 물건의 가격(1,000원 이하)을 입력하세요: ‘를 출력한다
		System.out.print("물건의 가격(1,000원 이하)을 입력하세요: ");

		// 물건의 가격을 키보드를 통해 입력 받은 후 출력한다
		itemPrice = keyboard.nextInt();
		System.out.println(itemPrice + "원 짜리 물건을 샀고 1,000원을 내셨습니다.");

		// 거스름돈을 계산한 후 출력한다
		change = 1000 - itemPrice;
		System.out.println("거스름돈은 " + change + "원입니다.");

		// 거스름돈에 포함된 500원짜리 동전 개수를 계산한다
		coin500 = change / 500;

		// 거스름돈에서 500원을 빼고 남은 거스름돈을 계산한다
		change = change % 500;

		// 거스름돈에 포함된 100원짜리 동전 개수를 계산한다
		coin100 = change / 100;

		// 거스름돈에서 100*coin100 원을 빼고 남은 거스름돈을 계산한다
		change = change % 100;

		// 거스름돈에 포함된 50원짜리 동전 개수를 계산한다
		coin50 = change / 50;

		// 거스름돈에서 50*coin50 원을 빼고 남은 거스름돈을 계산한다
		change = change % 50;

		// 거스름돈에 포함된 10원짜리 동전 개수를 계산한다
		coin10 = change / 10;

		// 거스름돈에서 10*coin10 원을 빼고 남은 거스름돈을 계산한다
		change = change % 10;

		// 거스름돈에 포함된 5원짜리 동전 개수를 계산한다
		coin5 = change / 5;

		// 거스름돈에서 5*coin5 원을 빼고 남은 거스름돈을 계산한다
		change = change % 5;

		// 거스름돈에 포함된 1원짜리 동전 개수를 계산한다
		coin1 = change;

		// 거스름돈에 포함된 각 동전들의 개수를 출력한다
		System.out.println("거스름돈의 내역은 다음과 같습니다: \n");
		System.out.println("500원 짜리 동전 갯수 = " + coin500);
		System.out.println("100원 짜리 동전 갯수 = " + coin100);
		System.out.println("50원 짜리 동전 갯수 = " + coin50);
		System.out.println("10원 짜리 동전 갯수 = " + coin10);
		System.out.println("5원 짜리 동전 갯수 = " + coin5);
		System.out.println("1원 짜리 동전 갯수 = " + coin1);
 	}
}