
import java.io.*;
public class Sample {

		public static void main(String[] args) throws IOException
		{
			System.out.println("������ �Է��Ͻʽÿ�.") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			if (res % 2 == 0 )  { 
				System.out.println("¦���Դϴ�."); }
				else {
					System.out.println(res + "�� Ȧ���Դϴ�"); }
			
		
	}
}
