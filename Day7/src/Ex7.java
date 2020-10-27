

public class Ex7 {

	public static void main(String[] args) {

		int [] A = {11,20,7 ,};
		int minIndex = 0 ;
		//최소값의 위치 값을 찾으시오
		
		for (int i = 0 ; i < A.length ; i++) {
		  
 			if(A[i] > A[minIndex]) {
				minIndex = minIndex ;}
	
			if(A[minIndex] > A[i])
			{
				minIndex = i ; }
				
		
		
		}
		System.out.println(minIndex);
		}
			
}