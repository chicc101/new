import java.util.Scanner;
public class Xx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int subject;
		String name;
		int sub [] = new int [3];
		String stu[] = new String[10];


		for(;;) {
		System.out.println("메뉴를 선택해 주세요 1.과목 선택 및 이름 입력 / 2.목록 조회 / 3.종료");
		int menu ;
		menu = scan.nextInt();
		
			for(int i=0 ; i<3 ; i++) {

				if(menu == 1) {
					System.out.println("과목을 선택해 주세요 1.수학 2.영어 3.과학");
					sub[i] = scan.nextInt();
					subject = sub[i];

					System.out.println("이름을 입력해주세요");
					name = scan.next();
					stu[i] = name;  }


				if (menu == 2) {
					System.out.print(subject +"," + sub[i]); }

				if(menu == 3) {
					System.out.println("종료되었습니다."); }
				scan.close();
			}
		}
	}
}
