import java.util.Scanner;

public class SerieDobleSimple {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.print("Digite valor de N -> ");
        int N = x.nextInt();
        int serie=5;
        int a=1;
        for (int i=1 ; i<=N ;i++)
        {
        	System.out.println(serie);
        	serie+=a;
        	a+=3;
        }

	}

}
