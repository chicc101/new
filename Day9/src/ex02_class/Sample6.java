package ex02_class;

class Sample6{
	void sum(int a, int b){System.out.println(a+b);}
	void sum(double a, double b){System.out.println(a+b);}

	public static void main(String args[]){
		Sample6 obj=new Sample6();
		obj.sum(1.12, 2.25);
		obj.sum(10, 20);

	}
}