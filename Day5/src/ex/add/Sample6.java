package ex.add;

public class Sample6 {

	public static void main(String[] args) {
		String a = new String("    c#");
		String b = new String(",c++ ");
		
		System.out.println(a + "의 길이는" + a.length()); //문자열의 길이(문자개수)
		System.out.println(a.contains("#")); //문자열의 포함 관계
		
		a = a.concat(b); //문자열 연결
		System.out.println(a);
		
		a= a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		a= a.replace("c#","java"); // 문자열 대치
		System.out.println(a);
	}

}
