import java.util.Scanner;

public class Abc {

	String name;
	
	String name_func () {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하라");
		name = scan.next();
		System.out.println(name);
		return name;
	}
}
/*
public class Example {
	public static void main(String[] args) {
		Abc b = new Abc();
		
		System.out.println(b.name_func() ) ;
		
	}
}
*/
