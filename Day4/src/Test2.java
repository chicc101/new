import java.io.*;//��ü ��� ȣ��

public class Test2 {

	public static void main(String[] args) throws IOException {//����ó��
		System.out.println("������ �Է��Ͻʽÿ�.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		if (res == 1) { //== ����ǥ��� �����ϸ��. 1�� �¾�?
			System.out.println("1�� �ԷµǾ����ϴ�.");
            System.out.println("1�� ���õǾ����ϴ�.");
		} 
			System.out.println("ó���� �����մϴ�.");
			
		}
	}