package Project03;

public class Student {
	public int number; //�й�
	public String name; //�̸�
	
	public Student (int Number, String Name)
	{
		number = Number;
		name = Name;
	}

	public String toString()
	{
		return (number + "\t\t" + name);
				
	}
}
