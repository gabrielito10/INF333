import java.util.Scanner;

public class IntercaladaPractica {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
        System.out.print("Digite valor de N -> ");
        int N = x.nextInt();
        int Serie = 1;
        int incPar = 2;
        int incImpar = 3;
        for (int i=1 ; i<=N ; i++ )
        {
        	System.out.println(Serie);
        	if (i%2 != 0) // es impar
        	{
        		Serie += incImpar;
        		incImpar++;
        	}
        	else // par
        	{
        		Serie *= incPar;
        		incPar++;
        	}
        }

	}

}
