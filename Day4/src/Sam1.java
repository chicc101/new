
import java.io.*;
public class Sam1 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("�� ���� ������ �Է��Ͻÿ� ") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			String str2 = br.readLine();
			
			int res = Integer.parseInt(str);
			int res2 = Integer.parseInt(str2);
			
			if(res != res2 ) {
				System.out.println("Different"); }
			
			else {
				System.out.println("correct"); }
			
			
		}
	}