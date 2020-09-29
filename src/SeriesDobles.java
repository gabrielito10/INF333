import java.util.*;
public class SeriesDobles {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("Digite valor de N");
		int N = x.nextInt();
		/*//5 6 10 17 27
		int serie=5;
		int serieA=1;
		for (int i=1 ; i<=N ;i++)
		{
			System.out.println(serie);
			serie+=serieA;
			serieA+=3;
		}*/
		
		//8 10 12 16 28
				int serie=8;
				int serieA=2;
				for (int i=1 ; i<=N ;i++)
				{
					System.out.println(serie);
					serie+=serieA;
					serieA*=i;
				}
	}

}
