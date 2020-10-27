
public class abcabcabc 
{
	private String name;
	private int number;
	
	public abcabcabc(String NewName)
	{
		setName(NewName);
	}
	
	public abcabcabc(int NewNumber)
	{
		setNumber(NewNumber);
	}
	
	public abcabcabc(int NewNumber, String NewName)
	{
		setName(NewName);
		setNumber(NewNumber);
	}

	public String getName()
	{ 
		return name;
	}
	
	public int getNumber()
	{ 
		return number;
	}
	
	public String toString()
	{
		return (name + "\t\t" + number);
		
	}
	
	public void setName(String NewName)
	{
		name = NewName;
	}
	
	public void setNumber(String NewNumber)
	{
		name = NewNumber;
	}
}
		

