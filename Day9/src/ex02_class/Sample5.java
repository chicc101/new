package ex02_class;

class Sample5{
	void sum(int a, int b){System.out.println(a+b);}
	void sum(int a, int b, int c){System.out.println(a+b+c);}

	public static void main(String args[]){
		Sample5 obj=new Sample5();
		obj.sum(10,20,30);
		obj.sum(10,20);
	}
}