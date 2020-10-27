//½ºÅÂÆ½ ¼³¸í
package test06.jenerics08;

public class StaticEx {
	
	static int a = 0;
	
	public static void count() {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		s1.count(); //1
		StaticEx s2 = new StaticEx();
		s2.count(); //2
		StaticEx s3 = new StaticEx();
		s3.count(); //3
		System.out.println(s1.a); //3

	}

}
