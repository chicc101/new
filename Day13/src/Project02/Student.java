package Project02;
import java.util.Scanner;

public class Student {
	//Student Ŭ���� �ʵ�
	String name; 
	int classNumber = -1;

	//���� �޼ҵ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //��ĳ�� �����ž�

		String[] subject = new String[3]; //subject��� �迭 3�� ����ž�
		subject[0] = "java";
		subject[1] = "python";
		subject[2] = "c++";

		Student[] stu = new Student[10]; //stu��� Ŭ���� �迭 10�� ����ž�


		int menu = 1; 
		int i = 0;

		while(true) {


			System.out.println("1. �л� �̸� �߰�");
			System.out.println("2. �л� ��� ǥ��");
			System.out.println("3. ���α׷� ����");

			menu = scan.nextInt();

			if(menu == 1) {

				System.out.println("������ �Է��ϼ���. ");
				String subject1 = scan.next();

				if(subject1.equals(subject[0])) {
					for(i=0; i<3; i++) {
						System.out.println("�л� �̸��� �߰����ּ���.");
						stu[i] = new Student();
						stu[i].name = scan.next();
						stu[i].classNumber = 0;
					}
				}

				if(subject1.equals(subject[1])) {
					for(i=0; i<3; i++) {
						System.out.println("�л� �̸��� �߰����ּ���.");
						stu[i] = new Student();
						stu[i].name = scan.next();
						stu[i].classNumber = 1;
					}
				}
				if(subject1.equals(subject[2])) {
					for(i=0; i<3; i++) {
						System.out.println("�л� �̸��� �߰����ּ���.");
						stu[i] = new Student();
						stu[i].name = scan.next();
						stu[i].classNumber = 2;
					}
					i++; //�л� �Ѹ� �߰� �Ϸ�
				}

				if(menu == 2) {
					System.out.println("������ �Է��ϼ���. ");
					String subject1 = scan.next();
					for(i=0; i<3; i++) {
						if(subject1.equals(subject))
							System.out.println(stu[i].name);   
					}
				}

				if(menu == 3) {
					System.out.println("���α׷� ����");
				}
			}
		}

	}
}
