
import java.io.*;
public class Sample4 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("������ �Է��Ͻÿ�.") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			
			int res = Integer.parseInt(str);
		

			switch(res) {
				case 1 :
					System.out.println("����սô�");
					break;
				case 2 :
					System.out.println("���� �� ����սô�.");
					break;
				case 3 :
					System.out.println("�� ���� ������ ��ǥ�� �սô�.");
					break;
				case 4 :
					System.out.println("�ſ� ���߽��ϴ�.");
					break;
				case 5 :
					System.out.println("�ſ� ����մϴ�.");
					break;
					
			
			}
			
			
		}
	}