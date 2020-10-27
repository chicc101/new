package ex.add;

public class Sample5 {

	public static void main(String[] args) {
		String a = "hanna";
		String b = "point";
		String c = "hanna";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		System.out.println(a.compareTo(b)); //문자가 같으면 0
		System.out.println(a.compareTo(c)); //문자가 다르면 양수/음수
	}

}
