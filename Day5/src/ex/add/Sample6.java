package ex.add;

public class Sample6 {

	public static void main(String[] args) {
		String a = new String("    c#");
		String b = new String(",c++ ");
		
		System.out.println(a + "�� ���̴�" + a.length()); //���ڿ��� ����(���ڰ���)
		System.out.println(a.contains("#")); //���ڿ��� ���� ����
		
		a = a.concat(b); //���ڿ� ����
		System.out.println(a);
		
		a= a.trim(); // ���ڿ� �� ���� ���� ����
		System.out.println(a);
		
		a= a.replace("c#","java"); // ���ڿ� ��ġ
		System.out.println(a);
	}

}
