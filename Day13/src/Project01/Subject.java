package Project01;
import java.util.Scanner;
class Subject {

	String[] sj;
	int count;
	Student[] stud;

	Scanner scan = new Scanner(System.in);

	public Subject() {
		sj = new String[3] ;
		count = 0;
		stud = new Student[50];

	}

	
	
	void inputSubject() {
		for(int i = 0; i<sj.length; i++) {
			System.out.println("과목명을 입력하세요 : ");
			sj[i] = scan.next();
		}
	}
	
	void menu() {
		while(true) {
			System.out.println("원하는 메뉴를 선택하세요 : ");
			System.out.println("1. 학생 이름 추가 ");
			System.out.println("2. 학생 목록 표시 ");
			System.out.println("3. 프로그램 종료 ");
			
			int c = scan.nextInt();
			
			if (c==1) {
				System.out.println("학생을 추가하실 과목명을 입력하세요 : ");
				String s = scan.next();
				
				for(int i = 0 ; i<sj.length ; i++) {
					if(s.equals(sj[i])) {
						System.out.println("추가하실 학생의 이름을 입력하세요 :");
						stud[count] = new Student();
						stud[count].name = scan.next();
						stud[count].sb = i;
						
						count ++ ;
					}
				}
			}
			
			if (c == 2) {
				System.out.println("==========교과목별 학생 목록==========");
				for (int i = 0 ; i<count; i++) {
					if(stud[i].sb ==0) 
						System.out.println(sj[0] + ":" + stud[i].name);
					if(stud[i].sb ==1) 
						System.out.println(sj[1] + ":" + stud[i].name);
					if(stud[i].sb ==2) 
						System.out.println(sj[2] + ":" + stud[i].name);
				}
			}
			if (c == 3) {
				System.out.println("프로그램을 종료합니다. ");
				break;
			}
		}
	}
	
	void run() {
		inputSubject();
		menu();
	}
}