import java.util.Scanner;

public class Sbj {
	Scanner scan = new Scanner(System.in);	

	String stu ;
	String sbj[] = new String[3];{ 
	sbj[0] = "����";
	sbj[1] = "����";
	sbj[2] = "����";}
	String sbj2;
	
	 



	public void getStud() {
		String stu[] = new String[10];
		System.out.println("�̸��� �Է����ּ���.");

		for(int i=0; i<10; i++) {
			System.out.println(stu[i]);
		}
	} //�л��̸��Է¹迭���� 
	
	public void getSbj() {		
		System.out.println("������ �����϶� 1.���� 2.���� 3.����");
		 sbj2 = scan.next();
		 if (sbj2 == sbj[0]) {
			 System.out.println();
		 }


		}
	}


