import java.util.Scanner;

public class ConSaltoLineal {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.print("Digite valor de N -> ");
        int N = x.nextInt();
        int Serie1 = 1;
        int Serie2 = 2;
        for (int i=1 ; i<=N + 2  ; i++ )
        {
        	if (i%2 != 0) // es impar
        	{
        		System.out.println(Serie1);
        		Serie1+=2;
           	}
        	else // par
        	{
        		System.out.println(Serie2);
        		Serie2*=2;
        	}
        }
	}
}
