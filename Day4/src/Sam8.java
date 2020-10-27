

import java.io.*;
public class Sam8 {

	public static void main(String[] args) throws IOException
	{
		int count = 0;


		for (int i=1 ; i <= 50; i++ )  {

			if(i % 3 == 0 ) {
				count = count+1;


			}
			

		}	
		System.out.println(count);
	}

}
