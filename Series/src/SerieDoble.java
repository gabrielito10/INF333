import java.util.*;
public class SerieDoble {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Valor de N ");
		int N = x.nextInt();
		int serie1 = 8;
		int serie2 = 2;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.println(serie1);
			serie1+=serie2;
			serie2*=i;
		}
	}

}
