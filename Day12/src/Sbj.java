import java.util.Scanner;

public class Sbj {
	Scanner scan = new Scanner(System.in);	

	String stu ;
	String sbj[] = new String[3];{ 
	sbj[0] = "수학";
	sbj[1] = "영어";
	sbj[2] = "과학";}
	String sbj2;
	
	 



	public void getStud() {
		String stu[] = new String[10];
		System.out.println("이름을 입력해주세요.");

		for(int i=0; i<10; i++) {
			System.out.println(stu[i]);
		}
	} //학생이름입력배열저장 
	
	public void getSbj() {		
		System.out.println("과목을 선택하라 1.수학 2.영어 3.과학");
		 sbj2 = scan.next();
		 if (sbj2 == sbj[0]) {
			 System.out.println();
		 }


		}
	}


