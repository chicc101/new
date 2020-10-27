//학생 샘플 코드
import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		A00[] a = new A00[3];

		Scanner sc = new Scanner(System.in);
		System.out.println("1.�л� ���� �Է�");
		System.out.println("2.�Էµ� ���� ���");
		System.out.println("3.���α׷� ����");

		System.out.println();
		while(true) {
			System.out.print("�޴� ��ȣ�� �Է����ּ��� : ");
			int num = sc.nextInt();
			switch(num) {
			case 1 : System.out.println("1.�л� ���� �Է�");
			for(int i = 0; i < a.length; i++) {
				a[i] = new A00();
				System.out.println((i+1) + "��° �л��� �̸��� �Է����ּ��� : ");
				a[i].name = sc.next();
				System.out.println((i+1) + "��° �л��� ���̸� �Է����ּ��� : ");
				a[i].age = sc.nextInt();
				System.out.println((i+1) + "��° �л��� ��ȣ�� �Է����ּ��� : ");
				a[i].number = sc.next();
			}
			break;
			case 2 : System.out.println("2.�Էµ� ���� ���");
			System.out.println("1��° �л��� �̸� : " + a[0].name + ", ���� : " + a[0].age + ", ��ȣ : " + a[0].number);
			System.out.println("2��° �л��� �̸� : " + a[1].name + ", ���� : " + a[1].age + ", ��ȣ : " + a[1].number);
			System.out.println("3��° �л��� �̸� : " + a[2].name + ", ���� : " + a[2].age + ", ��ȣ : " + a[2].number);
			break;
			case 3 : System.out.println("3.���α׷� ����");
			break;
			default : System.out.println("�߸� �Է��ϼ˽��ϴ�. �ٽ� �Է����ּ���.");
			sc.close();
			break;
			}
			if(num == 3) {
				break;
			}
		}
	}
}