package chapter01;
// Student 클래스를 시험한다

public class StudentDriver
{
    public static void main (String[] args)
    {
		// Student 객체 참조변수들
    	Student student1, student2;
    	student1 = new Student();
    	
    	student1.setName("갑돌");
    	student1.setNumber(100);
    	student1.setDepartment("컴퓨터공학과");
    	
    	System.out.println(student1);
    	
    	student2 = new Student();
    	
    	student2.setName("갑순");
    	student2.setNumber(200);
    	student2.setDepartment("수학과");
    	
    	System.out.println(student2);
    	
    	
    }
}