
class Data {
	int sum = 0; //�ʵ�

	public Data() {} //������

	int plus() {
		for ( int i=1 ; i<101; i++) {
			sum += i;
			if (i % 10 == 0) { 
				System.out.println(sum);
			}
			return sum;

		} //�޼ҵ�
	}                                                                                                                                                                                                                              
}

