package chapter01;
// 한 학생을 나타낸다.

public class Student
{
  public String Name;
  public int Number;
  public String Department;
  
  public Student(){
	  
  } //생성자
  
  
  public String getName( )
	{
		return Name;
	}
  
  public int getNumber()
	{
	  return Number;
	}
  
  public String getDepartment( )
	{
	  return Department;
	}
  public String toString()
  {
	  return Name +","  +  Number +"," + Department ;
  }
  
  public void setName(String name) {
	  Name = name;
  }
  
  public void setNumber(int number) {
	  Number = number;
  }
  public void setDepartment(String department) {
	  Department = department ;
  }

}

