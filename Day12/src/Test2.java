
class Data {
	int sum = 0; //필드

	public Data() {} //생성자

	int plus() {
		for ( int i=1 ; i<101; i++) {
			sum += i;
			if (i % 10 == 0) { 
				System.out.println(sum);
			}
			return sum;

		} //메소드
	}                                                                                                                                                                                                                              
}

