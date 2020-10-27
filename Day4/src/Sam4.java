

import java.io.*;
public class Sam4 {

		public static void main(String[] args) throws IOException
		{


			int sum = 0 ;
			
			for (int i = 2; i < 21; i+=2) {
				sum = sum + i ;
				
			}
			System.out.println("1에서 20까지의 수 중에 짝수 합계 : "  + sum );
		}	
}


