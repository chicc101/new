import java.util.*;

public class menu {

	public static void main(String[] args) {
		int drink , count;
		
		for(;;) {
		
			Scanner scan = new Scanner(System.in);
		
		
		System.out.println("--------------------");
		System.out.println("       메뉴선택        ");
		System.out.println("--------------------");
		System.out.println("        메뉴판         ");
		System.out.println("① 아메리카노(hot) 2500원");
		System.out.println("② 아메리카노(ice) 3000원");
		System.out.println("③ 핫초코 4000원");
		System.out.println("④ 프로그램 종료");
		drink = scan.nextInt(); 
		
		if(drink <= 3) { 
			System.out.print("수량을 입력 하세요 : "); 
			count = scan.nextInt();	}
		if(drink == 4) { 
			System.out.print("프로그램 종료");
		}
		
	
	} 

	}
}


