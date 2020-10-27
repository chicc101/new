package ex05;

public class SampleEx { //교차수열
	public static void main(String[] args) {
	int sum = 0;
	int sw = 1; //1,-1
	for (int i = 1; i < 101; i++) {
		if(sw == 1 ) {
			sum = sum + i;
		}else { 
			sum = sum - i;
		}
		sw = -sw;

	}

	System.out.println(sum);
	} 
}

