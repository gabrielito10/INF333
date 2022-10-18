import java.util.*;
public class ConSaltoLineal {

	public static void main(String[] args) {
		System.out.print("Digite Valor de N ");
		Scanner x = new Scanner(System.in);
		int N = x.nextInt();
		int a=1;
		int b=2;
		for (int i=1 ; i<=N ; i++)
		{
			if (i%2 != 0) // es impar
			{
				System.out.print(a + " ");
				a+=i;
			}
			else
			{
				System.out.print(b + " ");
				b*=i;
			}
		}
	}
}
