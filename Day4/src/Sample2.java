
import java.io.*;
public class Sample2 {

		public static void main(String[] args) throws IOException
		{
			System.out.println("2개의 정수를 입력하십시오.") ;

			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			String str2 = br.readLine();
			
			int res = Integer.parseInt(str);
		
			int res2 = Integer.parseInt(str2);
			
			if(res == res2 ) {
				System.out.println("두 숫자는 같습니다."); }
			else if (res < res2) {
				System.out.println(res + "보다" + res2 + "이 큽니다"); }
			else {
				System.out.println("두 수는 같지 않습니다");
			}
			
			
		}
	}