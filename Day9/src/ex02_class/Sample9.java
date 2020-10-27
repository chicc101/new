package ex02_class;
import java.util.*;
public class Sample9 {
	public static void main(String[] args){
		String s;
		String id="abcdef";
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		s = scan.next();
		if( s.equals(id) )
			System.out.println("로그인이 성공하였습니다");
		else
			System.out.println("로그인이 실패하였습니다");
	}
}
