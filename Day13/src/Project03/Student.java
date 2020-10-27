package Project03;

public class Student {
	public int number; //학번
	public String name; //이름
	
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
