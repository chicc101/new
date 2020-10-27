package Project01;

public class Pro02 {
	String Newname;
	int Newage;
	
	public Pro02(String Newname)
	{
		
		this(Newname, 0);
		System.out.println("~~~");
	
	}
	public Pro02(int Newage)
	{
		this(Newage, 0 );
		System.out.println("~~~");
	
	}
	
	public Pro02(String Newname , int Newage)
	{
		this(Newage, 0 );
		this(Newname, 0 );
		System.out.println("~~~");
	
	}
	
}
