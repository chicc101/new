

import java.io.*;
public class Sam5 {

		public static void main(String[] args) throws IOException
		{


			int sum = 0 ;
			
			for (int i = 1; i < 21; i+=2) {
				sum = sum + i ;
				
			}
			System.out.println("1에서 20까지의 수 중에 홀수 합계 : "  + sum );
		}	
}


