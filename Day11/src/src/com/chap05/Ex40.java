package src.com.chap05;

class Car
{
	int num = 10;
	double gas = 12.34;
	public Car()
	{
		System.out.println(num +", " + gas);
		System.out.println("�ڵ����� ����������ϴ�.");
	}
}

class RacingCar extends Car
{
	public RacingCar()
	{
		int num = 11;
		System.out.println(super.num +", " + gas);
		System.out.println(num +", " + gas);
		System.out.println("���̽� ī�� ����������ϴ�.");
	}
}

public class Ex40 {

	public static void main(String[] args) {
		new Car();
		new RacingCar();
	}

}

