
import java.io.*;
public class Sample2 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("2���� ������ �Է��Ͻʽÿ�.") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			String str2 = br.readLine();
			
			int res = Integer.parseInt(str);
		
			int res2 = Integer.parseInt(str2);
			
			if(res == res2 ) {
				System.out.println("�� ���ڴ� �����ϴ�."); }
			else if (res < res2) {
				System.out.println(res + "����" + res2 + "�� Ů�ϴ�"); }
			else {
				System.out.println("�� ���� ���� �ʽ��ϴ�");
			}
			
			
		}
	}