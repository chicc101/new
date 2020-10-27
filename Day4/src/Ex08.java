
// ���� 2.10: VendingChange.java
// �Ž������� ����Ѵ�.
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

		// ������ ����(1,000�� ����)�� �Է��ϼ���: ���� ����Ѵ�
		System.out.print("������ ����(1,000�� ����)�� �Է��ϼ���: ");

		// ������ ������ Ű���带 ���� �Է� ���� �� ����Ѵ�
		itemPrice = keyboard.nextInt();
		System.out.println(itemPrice + "�� ¥�� ������ ��� 1,000���� ���̽��ϴ�.");

		// �Ž������� ����� �� ����Ѵ�
		change = 1000 - itemPrice;
		System.out.println("�Ž������� " + change + "���Դϴ�.");

		// �Ž������� ���Ե� 500��¥�� ���� ������ ����Ѵ�
		coin500 = change / 500;

		// �Ž��������� 500���� ���� ���� �Ž������� ����Ѵ�
		change = change % 500;

		// �Ž������� ���Ե� 100��¥�� ���� ������ ����Ѵ�
		coin100 = change / 100;

		// �Ž��������� 100*coin100 ���� ���� ���� �Ž������� ����Ѵ�
		change = change % 100;

		// �Ž������� ���Ե� 50��¥�� ���� ������ ����Ѵ�
		coin50 = change / 50;

		// �Ž��������� 50*coin50 ���� ���� ���� �Ž������� ����Ѵ�
		change = change % 50;

		// �Ž������� ���Ե� 10��¥�� ���� ������ ����Ѵ�
		coin10 = change / 10;

		// �Ž��������� 10*coin10 ���� ���� ���� �Ž������� ����Ѵ�
		change = change % 10;

		// �Ž������� ���Ե� 5��¥�� ���� ������ ����Ѵ�
		coin5 = change / 5;

		// �Ž��������� 5*coin5 ���� ���� ���� �Ž������� ����Ѵ�
		change = change % 5;

		// �Ž������� ���Ե� 1��¥�� ���� ������ ����Ѵ�
		coin1 = change;

		// �Ž������� ���Ե� �� �������� ������ ����Ѵ�
		System.out.println("�Ž������� ������ ������ �����ϴ�: \n");
		System.out.println("500�� ¥�� ���� ���� = " + coin500);
		System.out.println("100�� ¥�� ���� ���� = " + coin100);
		System.out.println("50�� ¥�� ���� ���� = " + coin50);
		System.out.println("10�� ¥�� ���� ���� = " + coin10);
		System.out.println("5�� ¥�� ���� ���� = " + coin5);
		System.out.println("1�� ¥�� ���� ���� = " + coin1);
 	}
}