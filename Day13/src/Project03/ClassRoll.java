package Project03;

public class ClassRoll 
{


	public static final int NOT_FOUND = -1;
	public String coursename; //�������
	public int count;//�⼮�ο� �ִ� �л����� ��
	public int size;//�⼮���� ũ��
	Student[] sbook;//Student ��ü���� �迭
	
	//ũ�Ⱑ 10�� �� �⼮�� ��ü�� �����Ѵ�.
	public ClassRoll()
	{
		size = 10;
		count = 0;
		sbook = new Student[size];

	}
	
	// �� Student ��ÿ�� �⼮�ο� �߰��Ѵ�.
	public void add(Student newStudent) 
	{
		if (count >= size) 
			System.out.println("�⼮���� ũ�� �������� �߰��� �� �����ϴ�.");
		else {
			sbook[count] = newStudent;
			count++; 


		}
	}

}
