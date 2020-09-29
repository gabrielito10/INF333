import java.util.*;
public class SeriesTriples {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N= x.nextInt();
		//4 6 11 21 38 --- 64 101
		int serie=4;
		int serieA=2;
		int serieB=3;
		for (int i=1 ; i<=N ; i++)
		{
			System.out.println(serie);
			serie+=serieA;
			serieA+=serieB;
			serieB+=2;
		}
	}

}
