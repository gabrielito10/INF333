import java.util.Scanner;

public class SerieTripleSimple {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.print("Digite valor de N -> ");
        int N = x.nextInt();
        int serie=4;
        int a=2;
        int b=3;
        for (int i=1 ; i<=N ; i++)
        {
        	System.out.println(serie);
        	serie+=a;
        	a+=b;
        	b+=2;
        }
	}

}