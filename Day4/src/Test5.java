import java.io.*;

public class Test5{

	public static void main(String[] args) throws IOException {
		System.out.println("당신은 남성입니까?");
		System.out.println("Y 또는 N을 입력하십시오.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char res = str.charAt(0);
		
		if (res == 'Y'|| res == 'y')  {// ||은 or조건을 나타냄
			System.out.println("당신은 남성이군요.");
		} else if (res == 'N' || res == 'n') {
			System.out.println("당신은 여성이군요.");
		} else {
			System.out.println("Y 또는 N을 입력하십시오.");
		}
	}
}

