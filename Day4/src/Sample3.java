
import java.io.*;
public class Sample3 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("0 ���� 10������ ���� �Է��Ͻʽÿ�. ") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			if(res <= 10 ) {
				System.out.println("�����Դϴ�."); }
			
			else {
				System.out.println("Ʋ�Ƚ��ϴ�."); }
			
			
		}
	}