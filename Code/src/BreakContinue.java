package hanna.exfor;//break(���������¿���),continue
import java.io.*;

public class Sample9 {

	public static void main(String[] args) throws IOException
	{
		System.out.println("�� ��°���� ������ ���� �����ðڽ��ϰ�? (1 ? 10) ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int res = Integer.parseInt(str);

		for(int i = 1; i<=10; i++) {
			System.out.println(i + "��° ó���Դϴ�.");
			if (i == res)
				break;
		}

		for(int i=1; i<=10; i++) {
			if(i == res)
				continue;
			System.out.println(i + "��° ó���Դϴ�.");
		}
	}

}
