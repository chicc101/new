import java.util.Scanner;
public class Sample {


	int a ;
	String math[] = new String[3];
	String science[] = new String[3];
	String eng[] = new String[3];

	public void math() {
		Scanner scan = new Scanner(System.in);

		System.out.println("�л��̸��� �Է��϶�");
		for (int i=0 ; i<3 ; i++) {

			math[i] = scan.next();}
		}

	public void science() {
		Scanner scan = new Scanner(System.in);

		System.out.println("�л��̸��� �Է��϶�");
		for (int i=0 ; i<3 ; i++) {

			math[i] = scan.next();}
		}	
	public void eng() {
		Scanner scan = new Scanner(System.in);

		System.out.println("�л��̸��� �Է��϶�");
		for (int i=0 ; i<3 ; i++) {

			math[i] = scan.next();}
		}
	
	public void mathAll() {
		for (int i=0 ; i<3 ; i++) 
		System.out.println(math[i]);
		}
	public void engAll() {
		for (int i=0 ; i<3 ; i++) 
			System.out.println(eng[i]);
		
		}
	public void ScienceAll() {
		for (int i=0 ; i<3 ; i++) 
			System.out.println(science[i]);
		}
	}



		/*
import java.util.Scanner;

Scanner scan = new Scanner(System.in);

������ = scan.nextInt();
������ = scan.next();
		 */