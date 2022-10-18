import java.util.*;
public class SerieDobleLineal {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.print("Digite valor de N ");
		int N=x.nextInt();
		int serie=9;
		int a=21;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.print(serie + " ");
			serie+=a;
			a+=13;
		}
	}  

}
