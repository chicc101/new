

import java.io.*;
public class Sam6 {

		public static void main(String[] args) throws IOException
		{


			int sum = 0 ;
			
			for (int i = 3; i < 51; i+=3) {
				sum = sum + i ;
					
			}
			System.out.println("1에서 50까지의 3의 배수 합계 : "  + sum );
		}	
}


