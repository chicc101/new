
import java.io.*;
public class Sam2 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("정수를 입력하시오 ") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			int res = Integer.parseInt(str);
			
			if(res % 2 == 0 ) {
				System.out.println("입력한 수는 짝수입니다."); }
			
			else {
				System.out.println("홀수입니다"); }
			
			
		}
	}