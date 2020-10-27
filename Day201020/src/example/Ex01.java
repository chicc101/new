package example;

public class Ex01 {

	public static void main(String[] args) {
		int i,j,val = 0;
		int sum = 0;

		int [][] Arr = new int[5][5];

		for(i=0 ; i<5; i++) {
			for(j=0; j<5; j++) {
				Arr[i][j] = val;
				val++;
				System.out.printf("%3d",val);
				
				
			}System.out.println();

		}
		for(i=0 ; i<Arr.length; i++) {
			for(j=0; j<Arr[i].length; j++) {
				val = Arr[i][j] ;
				if(i<=j) { 
					
					val =0;

				}else {sum += val;
					
				}

			}

		}
		System.out.println("ÇÕ°è´Â: " + sum);

	}
}

