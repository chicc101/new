package Project03;
import java.util.Scanner;

public class ClassRollDriver {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice; //����� ����
		String coursename; //�������
		String name; //�̸�
		int number; //�й�
		Student student; //Student ��ü ��������

		ClassRoll sbook = new ClassRoll();
		System.out.println("��������� �Է��ϼ��� :");
		coursename = scan.next();
		sbook.coursename = coursename;

		do {//���๮
			System.out.println("���ϴ� ������ �����ϼ��� : "); System.out.println("(1) �߰�");
			System.out.println("(2) ã��"); System.out.println("(3) ����");
			choice = scan.nextInt();
			if (choice == 1) {
				System.out.println("�߰��ϴ� �л��� �й��� �Է��ϼ��� : ");
				number = scan.nextInt();
				System.out.println("�߰��ϴ� �л��� �й��� �Է��ϼ��� : ");
				name = scan.next();
				student = new Student(number, name);
				sbook.add(student);
			}
			else if (choice == 2) {
				//ã�� �л��� �й��� �Է� ���� �� �� �л��� �̸��� ����Ѵ�.
			} 
		} while (choice != 3); //���ǹ�
	}
}
