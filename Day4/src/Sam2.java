
import java.io.*;
public class Sam2 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("������ �Է��Ͻÿ� ") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			if(res % 2 == 0 ) {
				System.out.println("�Է��� ���� ¦���Դϴ�."); }
			
			else {
				System.out.println("Ȧ���Դϴ�"); }
			
			
		}
	}